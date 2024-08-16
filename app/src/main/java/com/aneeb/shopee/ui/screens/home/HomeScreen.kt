package com.aneeb.shopee.ui.screens.home

import CustomAppBar
import CustomText
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aneeb.shopee.ui.components.CustomScreenPadding
import com.aneeb.shopee.ui.components.CustomSectionHeading
import com.aneeb.shopee.ui.components.CustomTextButton
import com.aneeb.shopee.ui.screens.home.components.CategorySection
import com.aneeb.shopee.ui.theme.PrimaryBlueColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            CustomAppBar(
                title = "Home",

                )
        },

        ) { padding ->
        CustomScreenPadding {
            Column(
                Modifier
                    .padding(padding)
                    .fillMaxSize()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    CustomSectionHeading(text = "Categories")
                    CustomTextButton(text = "See All", onClick = { /*TODO*/ })
                }
                Box(modifier = Modifier.height(10.dp))
                CategorySection()
            }
        }
    }
}