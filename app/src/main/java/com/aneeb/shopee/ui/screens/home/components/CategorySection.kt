package com.aneeb.shopee.ui.screens.home.components

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.aneeb.shopee.ui.screens.CenteredContent
import com.example.ecommerceapp.data.util.Resource
import com.aneeb.shopee.ui.screens.home.CategoryViewModel

@Composable
fun CategorySection(categoryViewModel: CategoryViewModel = hiltViewModel()) {
    val categories by categoryViewModel.categories.collectAsState()

    Box(modifier = Modifier.fillMaxWidth()) {
        when (categories) {
            is Resource.Loading<*> -> {

                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }

            is Resource.Success<*> -> {
                LazyColumn {
                    items(categories.data?.size ?: 0) { index ->
                        BasicText(text = categories.data!![index].name)
                    }
                }
            }

            is Resource.Error<*> -> {
                BasicText(text = "Error loading categories")
            }
        }
    }


}