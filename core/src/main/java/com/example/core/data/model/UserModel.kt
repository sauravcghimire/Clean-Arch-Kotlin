package com.example.core.data.model

import com.example.core.domain.entity.UserEntity

data class UserModel(
    val avatar: String,
    val createdAt: String,
    val id: String,
    val name: String
)

fun UserModel.mapToEntity(): UserEntity {
    return UserEntity(
        avatar = avatar,
        createdAt = createdAt,
        id = id,
        name = name
    )
}