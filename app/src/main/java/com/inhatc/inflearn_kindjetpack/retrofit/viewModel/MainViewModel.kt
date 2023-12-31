package com.inhatc.inflearn_kindjetpack.retrofit.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inhatc.inflearn_kindjetpack.retrofit.api.API
import com.inhatc.inflearn_kindjetpack.retrofit.api.RetrofitInstance
import com.inhatc.inflearn_kindjetpack.retrofit.model.Post
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val retrofitInstance = RetrofitInstance().getInstance().create(API::class.java)

    private var _mutableWord1 = MutableLiveData<String>()
    val liveWord1: LiveData<String>
        get() = _mutableWord1

    private var _mutableWord2 = MutableLiveData<String>()
    val liveWord2: LiveData<String>
        get() = _mutableWord2

    private var _mutableWordList = MutableLiveData<List<Post>>()
    val liveWordList : LiveData<List<Post>> get() = _mutableWordList

    fun getPost1() = viewModelScope.launch {
        val post = retrofitInstance.getPost1()
        Log.d("MainViewModel", post.toString())
        _mutableWord1.value = post.title
    }

    fun getPostNumber(number: Int) = viewModelScope.launch {
        val post = retrofitInstance.getPostNumber(number)
        Log.d("MainViewModel", post.toString())
        _mutableWord2.value = post.title
    }

    fun getPostAll() = viewModelScope.launch {
        val postAll = retrofitInstance.getPostAll()
        _mutableWordList.value = postAll

    }
}