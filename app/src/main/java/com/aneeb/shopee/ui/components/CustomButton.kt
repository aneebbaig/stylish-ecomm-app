package com.aneeb.shopee.ui.components


import CustomText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aneeb.shopee.ui.theme.BtnCornerRadius
import com.aneeb.shopee.ui.theme.BtnPadding
import com.aneeb.shopee.ui.theme.PrimaryBlueColor

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = PrimaryBlueColor,
    contentColor: Color = Color.White,
    cornerRadius: Dp = BtnCornerRadius,
    style: TextStyle? = MaterialTheme.typography.bodyLarge
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(cornerRadius)
            )
            .padding(BtnPadding)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(cornerRadius)
    ) {
        CustomText(text = text, style = style, color = contentColor)
    }
}
