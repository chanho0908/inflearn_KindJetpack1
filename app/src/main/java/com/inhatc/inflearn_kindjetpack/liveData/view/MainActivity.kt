package com.inhatc.inflearn_kindjetpack.liveData.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.liveData.viewModel.FruitViewModel
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: FruitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[FruitViewModel::class.java]
        binding.vm = viewModel
        binding.lifecycleOwner = this

        binding.next.setOnClickListener {
            viewModel.getNextData()
        }
    }
}