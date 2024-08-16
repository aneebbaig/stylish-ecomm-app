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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aneeb.shopee.ui.theme.BtnCornerRadius
import com.aneeb.shopee.ui.theme.FieldBgColor
import com.aneeb.shopee.ui.theme.FieldCornerRadius
import com.aneeb.shopee.ui.theme.FieldHintColor
import com.aneeb.shopee.ui.theme.FieldTextColor

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    textColor: Color = FieldTextColor,
    backgroundColor: Color = FieldBgColor,
    cursorColor: Color = FieldTextColor,
    placeholderColor: Color = FieldHintColor,
    cornerRadius: Dp = FieldCornerRadius,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    singleLine: Boolean = true,
    padding: Int = 8
) {
    TextField(
        value = value,
        onValueChange = onValueChange,

        modifier = modifier
            .background(backgroundColor, RoundedCornerShape(cornerRadius))
            .padding(padding.dp).fillMaxWidth(),
        placeholder = {
            CustomText(
                text = placeholder,
                style = textStyle,
                color = placeholderColor
            )
        },
        textStyle = textStyle.copy(color = textColor),
        colors = TextFieldDefaults.colors(
            cursorColor = cursorColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius),
        visualTransformation = visualTransformation,
        singleLine = singleLine
    )
}