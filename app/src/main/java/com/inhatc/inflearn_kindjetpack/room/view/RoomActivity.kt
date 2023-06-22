package com.inhatc.inflearn_kindjetpack.room.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.inhatc.inflearn_kindjetpack.databinding.ActivityRoomBinding
import com.inhatc.inflearn_kindjetpack.retrofit.adapter.CustomAdapter
import com.inhatc.inflearn_kindjetpack.room.adapter.MainAdapter
import com.inhatc.inflearn_kindjetpack.room.db.database.TextDatabase
import com.inhatc.inflearn_kindjetpack.room.viewModel.MainViewModel

class RoomActivity : AppCompatActivity() {
    lateinit var binding: ActivityRoomBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = TextDatabase.getDatabase(this)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.getData()

        binding.btnInsert.setOnClickListener {
            viewModel.insertData(binding.editTextText.text.toString())
        }

        viewModel.textList.observe(this){
            val customAdapter = MainAdapter(it)
            binding.rv.adapter = customAdapter
            binding.rv.layoutManager = LinearLayoutManager(this)
        }

        binding.btnRead.setOnClickListener {
            //binding.rv.adapter = MainAdapter()
            Log.d("RoomActivity", viewModel.getData().toString())
        }

        binding.btnDel.setOnClickListener {
            viewModel.removeData()
        }
    }
}