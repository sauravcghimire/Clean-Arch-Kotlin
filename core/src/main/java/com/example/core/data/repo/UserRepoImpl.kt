package com.example.core.data.repo

import com.example.core.data.datasource.UserDataSource
import com.example.core.data.model.GetUserResponse
import com.example.core.domain.repo.UserRepo

class UserRepoImpl(val userDataSource: UserDataSource) : UserRepo {
    override suspend fun getUsers(): GetUserResponse {
        return userDataSource.getUsers()
    }
}