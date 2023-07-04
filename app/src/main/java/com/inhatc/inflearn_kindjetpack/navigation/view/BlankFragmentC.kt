package com.inhatc.inflearn_kindjetpack.navigation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankBinding
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankCBinding
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankaBinding

class BlankFragmentC : Fragment() {
    private var _binding: FragmentBlankCBinding?=null
    private val binding : FragmentBlankCBinding
        get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankCBinding.inflate(inflater, container, false)
        return binding.root
    }

}