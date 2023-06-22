package com.inhatc.inflearn_kindjetpack.liveData.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel: ViewModel() {

    private val _mutableCount = MutableLiveData(0)
    val liveCnt get() = _mutableCount

    fun plus(){
        _mutableCount.value = _mutableCount.value!!.plus(1)
    }



}