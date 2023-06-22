package com.inhatc.inflearn_kindjetpack.liveData.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.inhatc.inflearn_kindjetpack.liveData.model.testDataList

class FruitViewModel: ViewModel() {
    private var _mutableWord = MutableLiveData("")
    val liveWord get() = _mutableWord

    private var _randomMutableWord = MutableLiveData("")
    val randomLiveWord get() = _randomMutableWord

        init {
        getNextData()
    }
    fun getNextData(){
        val currentWord = testDataList.random()
        val randomWord = currentWord.toCharArray()
        randomWord.shuffle()

        _mutableWord.value = currentWord
        randomLiveWord.value = String(randomWord)
    }
}