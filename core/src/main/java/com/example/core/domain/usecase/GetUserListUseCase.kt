package com.example.core.domain.usecase

import com.example.core.data.model.mapToEntity
import com.example.core.domain.entity.GetUserRequest
import com.example.core.domain.entity.GetUserResponseEntity
import com.example.core.domain.repo.UserRepo

class GetUserListUseCase(val userRepo: UserRepo) : UseCase<GetUserRequest, GetUserResponseEntity>() {

    override fun execute(req: GetUserRequest?): GetUserResponseEntity {
        return userRepo.getUsers().mapToEntity()
    }
}