package com.inhatc.inflearn_kindjetpack.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num: Int): ViewModel() {

    init {
        Log.d("MainViewModel", num.toString())
    }

    var countValue = 0

    fun plus(){
        countValue++
    }

    fun minus(){
        countValue--
    }

    fun getCount(): Int{
        return countValue
    }

}