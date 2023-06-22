package com.inhatc.inflearn_kindjetpack.retrofit.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inhatc.inflearn_kindjetpack.retrofit.api.PlantAPI
import com.inhatc.inflearn_kindjetpack.retrofit.api.PlantRetrofitInstance
import com.inhatc.inflearn_kindjetpack.retrofit.model.Plant
import com.inhatc.inflearn_kindjetpack.retrofit.repository.Repository
import kotlinx.coroutines.launch

class PlantViewModel: ViewModel() {

    //val retrofitInstance: PlantAPI = PlantRetrofitInstance.getInstance().create(PlantAPI::class.java)

    private val repository = Repository()

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>> get() = _result

    fun getAllData() = viewModelScope.launch {

        _result.value = repository.getAllData()
    }



}