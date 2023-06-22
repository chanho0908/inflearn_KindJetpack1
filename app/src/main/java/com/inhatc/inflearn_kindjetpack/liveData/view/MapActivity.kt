package com.inhatc.inflearn_kindjetpack.liveData.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.liveData.viewModel.MapViewModel
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding
    private lateinit var viewModel : MapViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_map)
        viewModel = ViewModelProvider(this)[MapViewModel::class.java]

        viewModel.liveCount.observe(this, Observer {
            binding.resultArea1.text = (it+it).toString()
            binding.resultArea2.text = it.toString()
        })


        binding.btnArea.setOnClickListener {
            val count = binding.inputArea.text.toString().toInt()
            viewModel.setLiveDataValue(count)
        }


    }
}