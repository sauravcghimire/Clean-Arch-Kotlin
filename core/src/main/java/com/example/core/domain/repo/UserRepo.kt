package com.example.core.domain.repo

import com.example.core.data.model.GetUserResponse

interface UserRepo {
    suspend fun getUsers(): GetUserResponse
}