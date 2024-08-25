package com.aneeb.shopee.ui.components


import CustomText
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.TextUnit
import com.aneeb.shopee.ui.theme.BtnTextSize
import com.aneeb.shopee.ui.theme.TextBlackColor

@Composable
fun CustomTextButton(
    text: Any,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = TextBlackColor,
    textStyle: TextStyle = MaterialTheme.typography.bodySmall
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.background(backgroundColor),
        colors = ButtonDefaults.textButtonColors(contentColor = contentColor)
    ) {
        when (text) {
            is AnnotatedString -> {
                Text(
                    text = text,
                    style = textStyle.copy(color = contentColor)
                )
            }

            is String -> {
                Text(
                    text = text,
                    style = textStyle.copy(color = contentColor)
                )
            }

            else -> throw IllegalArgumentException("text parameter must be either String or AnnotatedString")
        }
    }
}



