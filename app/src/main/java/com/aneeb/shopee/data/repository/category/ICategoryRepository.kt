package com.aneeb.shopee.data.repository.category

import com.aneeb.shopee.domain.models.Category
import com.example.ecommerceapp.data.util.Resource

interface ICategoryRepository {
    suspend fun getCategories(): Resource<List<Category>>

}