package com.inhatc.inflearn_kindjetpack.liveData.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.databinding.ActivityLiveDataBinding
import com.inhatc.inflearn_kindjetpack.liveData.viewModel.MainViewModel

class LiveDataActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLiveDataBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btn.setOnClickListener {
            mainViewModel.plus()
        }

        mainViewModel.testLiveData.observe(this, Observer {
            //binding.textArea.text = mainViewModel.testMutableLiveData.value.toString()
            binding.textArea.text = it.toString()

        })


//        binding.btn.setOnClickListener {
//            mainViewModel.plus()
//        }
//
//        mainViewModel.testMutableLiveData.observe(this, Observer {
//            //binding.textArea.text = mainViewModel.testMutableLiveData.value.toString()
//            binding.textArea.text = it.toString()
//
//        })

    }

}