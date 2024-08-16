package com.aneeb.shopee.ui.screens.main

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.aneeb.shopee.ui.components.SafeArea
import com.aneeb.shopee.ui.navigation.BottomNavigationBar
import com.aneeb.shopee.ui.navigation.NavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { padding ->
        SafeArea(padding) {
            NavGraph(navController = navController)
        }
    }

}