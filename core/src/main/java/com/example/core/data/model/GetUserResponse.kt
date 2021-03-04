package com.example.core.data.model

import com.example.core.domain.entity.GetUserResponseEntity

data class GetUserResponse(
    val userList: List<UserModel>? = null
)

fun GetUserResponse.mapToEntity(): GetUserResponseEntity {
    return GetUserResponseEntity(userList = userList!!.map { it.mapToEntity() })
}


