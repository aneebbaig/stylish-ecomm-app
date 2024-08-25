package com.aneeb.shopee.data.remote

import com.aneeb.shopee.data.models.LoginRequest
import com.aneeb.shopee.domain.models.Category
import com.aneeb.shopee.domain.models.User
import com.example.ecommerceapp.data.util.Resource
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("login/")
    suspend fun login(@Body loginRequest: LoginRequest): Response<User>

    @POST("register/")
    suspend fun register(
        @Body email: String,
        @Body password: String,
        @Body firstName: String,
        @Body lastName: String
    ): Response<User>

    @GET("categories/")
    suspend fun getCategories(): List<Category>


}