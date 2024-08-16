package com.aneeb.shopee.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.aneeb.shopee.ui.theme.ScreenPadding

@Composable
fun CustomScreenPadding(
    content: @Composable() (BoxScope.() -> Unit),

    ) {
    Box(
        modifier = Modifier
            .padding(ScreenPadding)
            .fillMaxSize(),
        content = content,
    )
}