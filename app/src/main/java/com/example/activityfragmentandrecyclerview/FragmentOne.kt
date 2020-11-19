package com.example.navigationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.activityfragmentandrecyclerview.R

class FragmentOne : Fragment(){
   override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?): View {
       val myView: View = inflater.inflate(R.layout.fragment_one, container, false)
       val myButton: Button = myView.findViewById(R.id.buttonFirstFragment)

       myButton.setOnClickListener {
           findNavController().navigate(R.id.action_fragmentOne_to_secondActivity)
       }
        // Inflate the layout for this fragment
        return myView
    }
}