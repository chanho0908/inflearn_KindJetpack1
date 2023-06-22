package com.inhatc.inflearn_kindjetpack.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.R

class ViewModelFactoryActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    
    // Activity -> viewModel 데이터 전달
    lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_factory)

        viewModelFactory = MainViewModelFactory(5000)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }
}