package com.example.activityfragmentandrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.first_fragment, container, false)
        val myButton: Button = view.findViewById(R.id.toSecondFragment)
        myButton.setOnClickListener {
            //Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return view

        //val binding: FirstFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false)
        //val binding: FirstFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false)
        //binding.btnToSecondFragment.setOnClickListener { view : View ->
        //    view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        //}
        //return binding.root
    }

    //override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(itemView, savedInstanceState)


        //val myDataset = Datasource().loadListItemModels()
        //val recyclerView = view!!.findViewById<RecyclerView>(R.id.recycler_view)
        //recyclerView.adapter = ItemAdapter(requireContext(), myDataset)
    //}

}
