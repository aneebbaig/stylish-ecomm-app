package com.aneeb.shopee.ui.components

import CustomText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aneeb.shopee.ui.theme.ErrorColor
import com.aneeb.shopee.ui.theme.FieldBgColor
import com.aneeb.shopee.ui.theme.FieldCornerRadius
import com.aneeb.shopee.ui.theme.FieldHintColor
import com.aneeb.shopee.ui.theme.FieldTextColor


@Composable
fun CustomTextField(
    value: TextFieldValue,
    errorString: String? = null,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    textStyle: TextStyle = MaterialTheme.typography.labelSmall.copy(color = FieldTextColor),
    backgroundColor: Color = FieldBgColor,
    placeholderColor: Color = FieldHintColor,
    cursorColor: Color = Color.Black,
    cornerRadius: Dp = 4.dp
) {
    Column {
        BasicTextField(
            value = value,
            onValueChange = { newValue ->
                onValueChange(newValue)
            },
            textStyle = textStyle,
            cursorBrush = SolidColor(cursorColor),
            modifier = modifier
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(cornerRadius)
                )
                .padding(horizontal = 15.dp, vertical = 20.dp),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    if (value.text.isEmpty()) {
                        Text(
                            text = placeholder,
                            style = textStyle.copy(color = placeholderColor)
                        )
                    }
                    innerTextField()
                }
            }
        )
        if (errorString != null) {
            Spacer(modifier = Modifier.height(10.dp))
            CustomText(
                text = errorString,
                color = ErrorColor,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}