package com.example.cleanarchkotlin.framework

import com.example.core.data.datasource.UserDataSource
import com.example.core.data.model.GetUserResponse

class UserDatSourceImpl :UserDataSource{
    override suspend fun getUsers(): GetUserResponse {
        return RestApi.create("https://603f2d2dd9528500176041a5.mockapi.io/")
            .getUsers().body()!!
    }
}