package com.sibela.sharedviewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DisplayFragment()
    }
}