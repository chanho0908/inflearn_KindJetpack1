package com.inhatc.inflearn_kindjetpack.liveData.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.liveData.viewModel.BlankViewModel
import com.inhatc.inflearn_kindjetpack.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private var _binding : FragmentBlankBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn1.setOnClickListener {
            viewModel.plus()
        }

        // viewLifecycleOwner -> 프래그먼트와 view 와 LifeCycle 이 다르기 때문에 사용
        viewModel.liveCnt.observe(viewLifecycleOwner, Observer {
            binding.textView.text = it.toString()
        })
    }
}