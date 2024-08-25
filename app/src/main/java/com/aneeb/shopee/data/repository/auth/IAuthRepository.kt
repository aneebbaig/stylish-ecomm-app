package com.aneeb.shopee.data.repository.auth

import com.aneeb.shopee.domain.models.User

interface IAuthRepository {
    suspend fun login(email: String, password: String): Result<User>
    fun register(name: String, email: String, password: String): Boolean
}