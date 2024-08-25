package com.aneeb.shopee.ui.screens.main

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.aneeb.shopee.ui.components.SafeArea
import com.aneeb.shopee.ui.navigation.BottomNavigationBar
import com.aneeb.shopee.ui.navigation.NavGraph

@Composable
fun NavScreen(navController: NavController){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { padding ->
        SafeArea(padding) {

        }
    }
}