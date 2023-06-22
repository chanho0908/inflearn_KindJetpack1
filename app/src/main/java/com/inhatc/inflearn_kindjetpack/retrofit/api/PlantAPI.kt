package com.inhatc.inflearn_kindjetpack.retrofit.api

import com.inhatc.inflearn_kindjetpack.retrofit.model.Plant
import retrofit2.http.GET

interface PlantAPI {
    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants(): List<Plant>
}