package com.sibela.sharedviewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.sibela.sharedviewmodel.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    private var _binding: FragmentInputBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInputBinding.inflate(layoutInflater, container, false)

        binding.apply {
            buttonTwo.setOnClickListener {
                val newCountry = countryInput.text.toString()
                sharedViewModel.saveCountr(newCountry)
                findNavController().navigate(R.id.action_inputFragment_to_displayFragment)
            }
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}