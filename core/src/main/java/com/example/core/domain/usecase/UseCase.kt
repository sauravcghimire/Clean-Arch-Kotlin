package com.example.core.domain.usecase

abstract class UseCase<T : Request?, R : Response> {
    abstract fun execute(req: T?): R
}

interface Request {}
interface Response {}