package com.inhatc.inflearn_kindjetpack.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityNavMainBinding

// enterAnim -> A->B 갈 때 B가 보이는 방식

class NavMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}