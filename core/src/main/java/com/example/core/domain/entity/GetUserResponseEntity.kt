package com.example.core.domain.entity

import com.example.core.domain.usecase.Response

data class GetUserResponseEntity(
    val userList: List<UserEntity>? = null
) : Response

