package com.inhatc.inflearn_kindjetpack.navigation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankCBinding
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankDBinding


class BlankFragmentD : Fragment() {
    private var _binding: FragmentBlankDBinding?=null
    private val binding : FragmentBlankDBinding
        get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankDBinding.inflate(inflater, container, false)
        return binding.root
    }

}