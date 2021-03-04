package com.example.cleanarchkotlin.framework

import com.example.core.data.model.GetUserResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

internal interface RestApi {

    @GET("users")
    suspend fun getUsers():Response<GetUserResponse>

    companion object {
        fun create(baseUrl: String): RestApi = Retrofit.Builder()
            .baseUrl(baseUrl)
            .build()
            .create(RestApi::class.java)
    }
}