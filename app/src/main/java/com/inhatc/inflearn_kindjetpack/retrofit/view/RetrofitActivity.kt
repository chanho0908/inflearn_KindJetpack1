package com.inhatc.inflearn_kindjetpack.retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityRetrofitBinding
import com.inhatc.inflearn_kindjetpack.retrofit.adapter.CustomAdapter
import com.inhatc.inflearn_kindjetpack.retrofit.api.API
import com.inhatc.inflearn_kindjetpack.retrofit.api.RetrofitInstance
import com.inhatc.inflearn_kindjetpack.retrofit.model.Post
import com.inhatc.inflearn_kindjetpack.retrofit.viewModel.MainViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *  Retrofit 동작 순서
 *  1. 통신용 함수를 선언한 인터페이스 작성
 *  2. Retrofit에 인터페이스 전달
 *  3. Retrofit이 통신용 서비스 객체 반환
 *  4. 서비스의 통신용 함수를 호출한 후 Call 객체 반환
 *  Call 객체의 enqueue() 함수를 호출하여 네트워크 통신 수행
 */
class RetrofitActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel
    private lateinit var binding: ActivityRetrofitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.getPost1()
        viewModel.getPostNumber(3)
        viewModel.getPostAll()

        viewModel.liveWord1.observe(this) {
            binding.area1.text = it.toString()
        }

        viewModel.liveWord2.observe(this) {
            binding.area2.text = it.toString()
        }

        viewModel.liveWordList.observe(this) {
            binding.recyclerView.adapter = CustomAdapter(it)
            binding.recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }
}