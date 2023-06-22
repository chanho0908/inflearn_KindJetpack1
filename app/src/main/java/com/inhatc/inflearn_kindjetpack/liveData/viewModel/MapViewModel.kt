package com.inhatc.inflearn_kindjetpack.liveData.viewModel

import androidx.lifecycle.*


class MapViewModel: ViewModel() {
    // Transformations -> map / switchMap
    // map -> 값을 return

    private var _mutableCount = MutableLiveData(0)
    val liveCount : LiveData<Int> get() = _mutableCount

    fun setLiveDataValue(count : Int){
        _mutableCount.value = count
    }

    fun changeValue(count: Int) : MutableLiveData<Int>{
        return MutableLiveData(count * count)
    }

}