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

val circularFontFamily = FontFamily(
    Font(R.font.circularstd_book, weight = FontWeight.Normal),
    Font(R.font.circularstd_medium, weight = FontWeight.Medium),
    Font(R.font.circularstd_bold, weight = FontWeight.Bold)
)

val gabaritoFontFamily = FontFamily(
    Font(R.font.gabarito_regular, weight = FontWeight.Normal),
    Font(R.font.gabarito_medium, weight = FontWeight.Medium),
    Font(R.font.gabarito_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),

    bodyMedium = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),

    bodySmall = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = gabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
    ),

    headlineMedium = TextStyle(
        fontFamily = gabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),

    headlineSmall = TextStyle(
        fontFamily = gabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),

    titleLarge = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 52.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),

    labelSmall = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),

    labelMedium = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),

    labelLarge = TextStyle(
        fontFamily = circularFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    )

)



