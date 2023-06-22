package com.inhatc.inflearn_kindjetpack.retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.retrofit.viewModel.CorutineViewModel

class CorutineActivity2 : AppCompatActivity() {

    lateinit var viewModel: CorutineViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corutine2)

        viewModel = ViewModelProvider(this)[CorutineViewModel::class.java]
        viewModel.a()
        viewModel.b()
    }
}