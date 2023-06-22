package com.inhatc.inflearn_kindjetpack.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityViewModelMainBinding

class ViewModelMainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding : ActivityViewModelMainBinding

    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewModelMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this, MainViewModelFactory(5000))[MainViewModel::class.java] // viewModel 생성
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            viewModel.plus()
            binding.textView.text = viewModel.getCount().toString()
        }

        binding.btnMinus.setOnClickListener {
            binding.textView.text = viewModel.getCount().toString()
        }

        binding.showFragmentBtn.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout, TestFragment())
            transaction.commit()
        }

        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frameLayout, TestFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}