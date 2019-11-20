package com.everis.myapplication.global.tutorial


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.everis.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class GlobalTutorialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_tutorial, container, false)
    }

    companion object {
        fun newInstance(): GlobalTutorialFragment = GlobalTutorialFragment()
    }
}
