package com.aneeb.shopee.ui.components


import CustomText
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aneeb.shopee.ui.theme.BtnCornerRadius
import com.aneeb.shopee.ui.theme.BtnPadding
import com.aneeb.shopee.ui.theme.PrimaryColor

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = PrimaryColor,
    contentColor: Color = Color.White,
    cornerRadius: Dp = BtnCornerRadius,
    style: TextStyle? = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium),
    @DrawableRes  prefixIcon: Int? = null,

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
        prefixIcon?.let {
            Image(
                painter = painterResource(id = prefixIcon),
                contentDescription = null,
                modifier = Modifier.padding(end = 8.dp)
            )
        }
        CustomText(text = text, style = style, color = contentColor)
    }
}

