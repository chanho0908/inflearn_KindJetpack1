package com.inhatc.inflearn_kindjetpack.liveData.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var _testMutableLiveData = MutableLiveData(0)
    val testLiveData : LiveData<Int> get() = _testMutableLiveData

    fun plus(){
        _testMutableLiveData.value = _testMutableLiveData.value!!.plus(1)
    }


//    var testMutableLiveData = MutableLiveData(0)
//
//    fun plus(){
//        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
//    }
}