package com.aneeb.shopee.data.remote

import com.aneeb.shopee.domain.models.Category
import com.aneeb.shopee.domain.models.User
import com.example.ecommerceapp.data.util.Resource
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("login")
    suspend fun login(@Body request: User): Response<User>

    @POST("register")
    suspend fun register(@Body request: User): Response<User>

    @GET("categories")
    suspend fun getCategories(): List<Category>


}