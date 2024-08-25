package com.aneeb.shopee.ui.screens.auth

import CustomText
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.aneeb.shopee.ui.components.CustomButton
import com.aneeb.shopee.ui.components.CustomScreenPadding
import com.aneeb.shopee.ui.components.CustomTextField

@Composable
fun ForgotPassword(navController: NavController, authViewModel: AuthViewModel = hiltViewModel()) {

    Scaffold { padding ->
        CustomScreenPadding() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(padding),
            ) {


                CustomText(
                    text = "Forgot Password",
                    style = MaterialTheme.typography.headlineLarge.copy(fontSize = 32.sp)
                )
                Spacer(modifier = Modifier.height(10.dp))


                //EMAIL FIELD
                CustomTextField(
                    placeholder = "Email",
                    value = authViewModel.loginEmail.value,
                    onValueChange = { authViewModel.loginEmail.value = it },
                    errorString = authViewModel.loginEmailError.value
                )
                Spacer(modifier = Modifier.height(10.dp))


                CustomButton(text = "Continue", onClick = { /*TODO*/ })


            }
        }
    }
}