package com.aneeb.shopee.data.repository.category

import com.aneeb.shopee.domain.models.Category
import com.aneeb.shopee.domain.models.User
import com.aneeb.shopee.data.remote.ApiService
import com.example.ecommerceapp.data.util.Resource
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    ICategoryRepository {

    override suspend fun getCategories(): Resource<List<Category>> {
        return try {
            val response = apiService.getCategories()
            val categories = response.map { Category(it.toString()) }
            Resource.Success(categories)
        } catch (e: Exception) {
            Resource.Error("Error fetching categories")
        }
    }


}