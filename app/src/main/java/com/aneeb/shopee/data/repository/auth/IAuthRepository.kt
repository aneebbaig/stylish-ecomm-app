package com.aneeb.shopee.data.repository.auth

import com.aneeb.shopee.domain.models.User

interface IAuthRepository {
    fun login(email: String, password: String): Boolean
    fun register(name: String, email: String, password: String): Boolean
}