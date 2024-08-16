package com.aneeb.shopee.data.repository.auth

import com.aneeb.shopee.domain.models.User
import com.aneeb.shopee.data.remote.ApiService
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val apiService : ApiService) : IAuthRepository {
    override fun login(email: String, password: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun register(name: String, email: String, password: String): Boolean {
        TODO("Not yet implemented")
    }
}