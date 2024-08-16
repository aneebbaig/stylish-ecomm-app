package com.aneeb.shopee.ui.screens.auth

import CustomText
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aneeb.shopee.ui.components.CustomScreenPadding
import com.aneeb.shopee.ui.components.CustomTextField

@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }


    Scaffold { padding ->
        CustomScreenPadding() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(padding),
                verticalArrangement = Arrangement.Center

            ) {
                CustomText(text = "Create Account", style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(10.dp))

                CustomTextField(
                    value = "Email",
                    onValueChange = { newVal -> email = TextFieldValue(newVal) })
                CustomTextField(
                    value = "Password",
                    onValueChange = { newVal -> password = TextFieldValue(newVal) })

            }
        }
    }
}