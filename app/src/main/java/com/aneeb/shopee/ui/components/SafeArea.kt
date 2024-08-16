package com.aneeb.shopee.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SafeArea(padding: PaddingValues, function: @Composable () -> Unit){
    Box(modifier = Modifier.padding(top = padding.calculateTopPadding())) {
        function()
    }
}