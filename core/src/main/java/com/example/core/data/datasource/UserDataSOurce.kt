package com.example.core.data.datasource

import com.example.core.data.model.GetUserResponse

interface UserDataSource {
    suspend fun getUsers(): GetUserResponse
}