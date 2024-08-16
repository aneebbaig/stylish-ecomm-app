package com.aneeb.shopee.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aneeb.shopee.ui.screens.SplashScreen
import com.aneeb.shopee.ui.screens.auth.LoginScreen
import com.aneeb.shopee.ui.screens.cart.CartScreen
import com.aneeb.shopee.ui.screens.favorites.FavoritesScreen
import com.aneeb.shopee.ui.screens.home.HomeScreen
import com.aneeb.shopee.ui.screens.profile.ProfileScreen
import kotlinx.serialization.Serializable

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = AppRoutes.Home) {
        composable<AppRoutes.Splash> {
            SplashScreen(navController)
        }

        composable<AppRoutes.Login> {
            LoginScreen()
        }

        composable<AppRoutes.Register> {

        }

        composable<AppRoutes.Home> {
            HomeScreen()
        }

        composable<AppRoutes.Cart> {
            CartScreen()
        }

        composable<AppRoutes.Profile> {
            ProfileScreen()
        }

        composable<AppRoutes.Favorites> {
            FavoritesScreen()
        }
    }
}


