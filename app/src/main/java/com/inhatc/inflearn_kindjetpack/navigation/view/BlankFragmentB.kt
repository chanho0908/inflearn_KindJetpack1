package com.inhatc.inflearn_kindjetpack.navigation.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankBinding


class BlankFragmentB : Fragment() {
    private var _binding : FragmentBlankBinding ?= null
    private val binding : FragmentBlankBinding
        get() = _binding!!

    val args: BlankFragmentBArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("BlankFragmentB", args.key)


        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }


}