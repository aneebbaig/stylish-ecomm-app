package com.aneeb.shopee.ui.screens


import CustomText
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aneeb.shopee.R
import com.aneeb.shopee.ui.components.CustomButton
import com.aneeb.shopee.ui.components.CustomTextButton
import com.aneeb.shopee.ui.navigation.AppRoutes

@Composable
fun SplashScreen(
    navController: NavController
) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            CenteredContent()
            Spacer(modifier = Modifier.weight(1f))
            BottomButtons(navController)
        }
    }
}

@Composable
fun CenteredContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.app_logo),
            contentDescription = "Logo"
        )
        Text(
            text = "Shoppe",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomText(
            text = "Beautiful eCommerce UI Kit for your online store",
            style = MaterialTheme.typography.labelMedium,
            textAlign = TextAlign.Center,

            )
    }
}

@Composable
fun BottomButtons(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomButton(
            onClick = { navController.navigate(AppRoutes.Login) },
            text = "Get Started",
            modifier = Modifier.fillMaxWidth()
        )
      //  CustomTextButton(onClick = { /*TODO*/ }, text = "I already have an account")
    }
}





