package com.example.navigationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.activityfragmentandrecyclerview.R
import com.example.activityfragmentandrecyclerview.`interface`.CellClickListener
import com.example.activityfragmentandrecyclerview.adapter.ItemAdapter
import com.example.activityfragmentandrecyclerview.data.Datasource

class FragmentOne : Fragment(), CellClickListener {
   override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?): View {
       val myView: View = inflater.inflate(R.layout.fragment_one, container, false)
       //val myButton: Button = myView.findViewById(R.id.buttonFirstFragment)

       //myButton.setOnClickListener {
       //    findNavController().navigate(R.id.action_fragmentOne_to_secondActivity)
       //}
        // Inflate the layout for this fragment
        return myView
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        val myDataset = Datasource().loadListItemModels()
        val recyclerView = requireView().findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(requireContext(), myDataset, this)
    }

    override fun onCellClickListener(id: Int) {
        Toast.makeText(requireContext(),"Cell clicked", Toast.LENGTH_SHORT).show()
        findNavController().navigate(id)
    }
}