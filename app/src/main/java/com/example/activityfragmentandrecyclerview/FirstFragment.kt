package com.example.activityfragmentandrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.activityfragmentandrecyclerview.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        //val binding: FirstFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false)
        //binding.btnToSecondFragment.setOnClickListener(
        //        Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
        //)
        val binding: FirstFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false)
        binding.btnToSecondFragment.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return binding.root
    }

    //override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(itemView, savedInstanceState)


        //val myDataset = Datasource().loadListItemModels()
        //val recyclerView = view!!.findViewById<RecyclerView>(R.id.recycler_view)
        //recyclerView.adapter = ItemAdapter(requireContext(), myDataset)
    //}

}