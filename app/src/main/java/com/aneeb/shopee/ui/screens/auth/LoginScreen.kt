package com.aneeb.shopee.ui.screens.auth

import CustomText
import android.graphics.drawable.shapes.Shape
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
fun LoginScreen(navController: NavController, authViewModel: AuthViewModel = hiltViewModel()) {

    val context = LocalContext.current
    val isLoading by authViewModel.isLoading
    val loginState by authViewModel.loginState.collectAsState()


    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
            append("Don't have an account? ")
        }
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append("Create One")
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
                    text = "Sign In",
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

                //PASS FIELD
                CustomTextField(
                    placeholder = "Password",
                    value = authViewModel.loginPassword.value,
                    onValueChange = { authViewModel.loginPassword.value = it },
                    errorString = authViewModel.loginPasswordError.value
                )
                Spacer(modifier = Modifier.height(20.dp))


                CustomButton(text = "Continue", onClick = { authViewModel.login() })


                CustomTextButton(
                    text = annotatedText,
                    onClick = {
                        navController.navigate(AppRoutes.Register) {
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


                //SOCIAL BUTTONS
                CustomButton(
                    text = "Continue With Apple",
                    onClick = { /*TODO*/ },
                    backgroundColor = BtnSecondaryColor,
                    contentColor = TextBlackColor,
                    prefixIcon = R.drawable.apple,
                )
                Spacer(modifier = Modifier.height(10.dp))
                CustomButton(
                    text = "Continue With Google",
                    onClick = { /*TODO*/ },
                    backgroundColor = BtnSecondaryColor,
                    contentColor = TextBlackColor,
                    prefixIcon = R.drawable.google,
                )


            }
        }
    }

    if (isLoading) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f)),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(color = Color.White)
        }
    }

    LaunchedEffect(loginState) {
        loginState?.let {
            if (it.isSuccess) {
                // Do something on success, like navigate to another screen
            } else {
                Toast.makeText(
                    context,
                    it.exceptionOrNull()?.message ?: "Unknown error",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}

// Handle login result



