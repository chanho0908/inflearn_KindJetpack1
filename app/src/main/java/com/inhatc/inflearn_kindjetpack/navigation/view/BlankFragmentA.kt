package com.inhatc.inflearn_kindjetpack.navigation.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankaBinding


class BlankFragmentA : Fragment() {
    private var _binding: FragmentBlankaBinding ?=null
    private val binding : FragmentBlankaBinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankaBinding.inflate(inflater, container, false)

        val action = BlankFragmentADirections.actionBlankFragmentAToBlankFragmentB("abcd")

        binding.btn1.setOnClickListener {
            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }

}