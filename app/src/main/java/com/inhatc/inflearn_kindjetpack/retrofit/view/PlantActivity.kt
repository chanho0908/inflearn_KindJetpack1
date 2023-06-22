package com.inhatc.inflearn_kindjetpack.retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityPlantBinding
import com.inhatc.inflearn_kindjetpack.retrofit.adapter.PlantAdapter
import com.inhatc.inflearn_kindjetpack.retrofit.viewModel.PlantViewModel

class PlantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlantBinding
    private lateinit var viewModel: PlantViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PlantViewModel::class.java]
        viewModel.getAllData()

        viewModel.result.observe(this){
            binding.rv.adapter = PlantAdapter(this, it)
            binding.rv.layoutManager = LinearLayoutManager(this)
        }
    }
}