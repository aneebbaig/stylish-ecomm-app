package com.aneeb.shopee.ui.theme

import androidx.compose.foundation.layout.ContextualFlowRow
import androidx.compose.material3.Typography
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.aneeb.shopee.R

val ralewayFontFamily = FontFamily(
    Font(R.font.raleway_regular, weight = FontWeight.Normal),
    Font(R.font.raleway_italic, style = FontStyle.Italic),
    Font(R.font.raleway_medium, weight = FontWeight.Medium),
    Font(R.font.raleway_bold, weight = FontWeight.Bold)
)

val nunitoFontFamily = FontFamily(
    Font(R.font.nunitosans_regular, weight = FontWeight.Normal),
    Font(R.font.nunitosans_italic, style = FontStyle.Italic),
    Font(R.font.nunitosans_medium, weight = FontWeight.Medium),
    Font(R.font.nunitosans_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),

    bodyMedium = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),

    bodySmall = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),

    titleLarge = TextStyle(
        fontFamily = ralewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 52.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = ralewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = ralewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),

    labelSmall = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),

    labelMedium = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),

    labelLarge = TextStyle(
        fontFamily = nunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
    )

)



