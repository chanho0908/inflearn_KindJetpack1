package com.inhatc.inflearn_kindjetpack.retrofit.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CorutineViewModel: ViewModel(){

    fun a(){
        // 뷰모델이 사라져도 계속 동작!
        CoroutineScope(Dispatchers.IO).launch {
           for (i in 0..10){
               delay(1000)
               Log.d("IntheViewModel", i.toString())
           }
        }
    }

    fun b(){
        // 뷰모델이 사라지면 종료!
        viewModelScope.launch {
            for (i in 0..10){
                delay(1000)
                Log.d("viewModelScope", i.toString())
            }
        }
    }
}