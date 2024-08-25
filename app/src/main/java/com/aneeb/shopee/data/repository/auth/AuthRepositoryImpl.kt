package com.aneeb.shopee.data.repository.auth

import android.util.Log
import com.aneeb.shopee.data.models.ErrorResponse
import com.aneeb.shopee.data.models.LoginRequest
import com.aneeb.shopee.domain.models.User
import com.aneeb.shopee.data.remote.ApiService
import com.google.gson.Gson
import java.util.logging.Logger
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val apiService: ApiService) : IAuthRepository {
    override suspend fun login(email: String, password: String): Result<User> {
        return try {
            val response = apiService.login(LoginRequest(email, password))

            if (response.isSuccessful) {
                val user = response.body()
                Result.success(user!!)
            } else {
                val errorResponse = response.errorBody()?.string()
                val error = Gson().fromJson(errorResponse, ErrorResponse::class.java)
                Result.failure(Exception(error.error))
            }

        } catch (e: Exception) {
            Result.failure(e)
        }

    }

    override fun register(name: String, email: String, password: String): Boolean {
        TODO("Not yet implemented")
    }
}