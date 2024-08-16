package com.aneeb.shopee.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aneeb.shopee.data.repository.category.ICategoryRepository
import com.aneeb.shopee.domain.models.Category
import com.example.ecommerceapp.data.util.Resource

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val categoryRepository: ICategoryRepository
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories


    init {
        fetchCategories()
    }


    fun fetchCategories() {
        viewModelScope.launch {
            val result = categoryRepository.getCategories()
            _categories.value = result
        }
    }
}
