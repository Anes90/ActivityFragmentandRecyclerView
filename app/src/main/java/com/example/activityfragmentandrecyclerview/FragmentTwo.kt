package com.example.navigationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activityfragmentandrecyclerview.R

class FragmentTwo : Fragment(){
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View {
        val myView: View = inflater.inflate(R.layout.fragment_two, container, false)
        // Inflate the layout for this fragment
        return myView
    }
}