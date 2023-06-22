package com.inhatc.inflearn_kindjetpack.retrofit.repository

import com.inhatc.inflearn_kindjetpack.retrofit.api.PlantAPI
import com.inhatc.inflearn_kindjetpack.retrofit.api.PlantRetrofitInstance

class Repository {
    private val client = PlantRetrofitInstance.getInstance().create(PlantAPI::class.java)
    suspend fun getAllData() = client.getAllPlants()
}