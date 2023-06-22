package com.inhatc.inflearn_kindjetpack.retrofit.api

import com.inhatc.inflearn_kindjetpack.retrofit.model.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// Retrofit에 전달되어 통신할 때 사용
// -> 실제 통신시 필요한 코드를 담은 서비스 객체 생성
interface API {
    @GET("posts/1")
    suspend fun getPost1(): Post

    // URL 의 경로를 동적으로 지정
    @GET("posts/{number}")
    suspend fun getPostNumber(
        @Path("number") number: Int
    ): Post

    @GET("posts")
    suspend fun getPostAll(): List<Post>
}