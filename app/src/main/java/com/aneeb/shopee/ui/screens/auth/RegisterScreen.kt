package com.aneeb.shopee.ui.screens.auth

import CustomText
import android.graphics.drawable.shapes.Shape
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
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.aneeb.shopee.R
import com.aneeb.shopee.ui.components.CustomButton
import com.aneeb.shopee.ui.components.CustomScreenPadding
import com.aneeb.shopee.ui.components.CustomTextButton
import com.aneeb.shopee.ui.components.CustomTextField
import com.aneeb.shopee.ui.navigation.AppRoutes
import com.aneeb.shopee.ui.theme.BtnSecondaryColor
import com.aneeb.shopee.ui.theme.TextBlackColor

@Composable
fun RegisterScreen(navController: NavController, authViewModel: AuthViewModel = hiltViewModel()) {

    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
            append("Already Have an account? ")
        }
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append("Login")
        }

    }


    Scaffold { padding ->
        CustomScreenPadding() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(padding),
            ) {


                CustomText(
                    text = "Create Account",
                    style = MaterialTheme.typography.headlineLarge.copy(fontSize = 32.sp)
                )
                Spacer(modifier = Modifier.height(10.dp))


                //FIRST NAME FIELD
                CustomTextField(
                    placeholder = "First Name",
                    value = authViewModel.registerFirstName.value,
                    onValueChange = { authViewModel.registerFirstName.value = it },
                    errorString = authViewModel.registerFirstNameError.value,
                )
                Spacer(modifier = Modifier.height(10.dp))


                //LAST NAME FIELD
                CustomTextField(
                    placeholder = "Last Name",
                    value = authViewModel.registerLastName.value,
                    onValueChange = { authViewModel.registerLastName.value = it },
                    errorString = authViewModel.registerLastNameError.value,
                )
                Spacer(modifier = Modifier.height(10.dp))


                //EMAIL FIELD
                CustomTextField(
                    placeholder = "Email",
                    value = authViewModel.registerEmail.value,
                    onValueChange = { authViewModel.registerEmail.value = it },
                    errorString = authViewModel.registerEmailError.value,
                )
                Spacer(modifier = Modifier.height(10.dp))

                //PASS FIELD
                CustomTextField(
                    placeholder = "Password",
                    value = authViewModel.registerPassword.value,
                    onValueChange = { authViewModel.registerPassword.value = it },
                    errorString = authViewModel.registerPasswordError.value,
                )
                Spacer(modifier = Modifier.height(20.dp))


                CustomButton(text = "Continue", onClick = { authViewModel.register() })


                CustomTextButton(
                    text = annotatedText,
                    onClick = {
                        navController.navigate(AppRoutes.Login) {
                            popUpTo(navController.graph.startDestinationId) {
                                inclusive = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Spacer(modifier = Modifier.height(60.dp))


            }
        }
    }
}