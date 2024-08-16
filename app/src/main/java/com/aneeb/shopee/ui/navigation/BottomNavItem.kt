package com.aneeb.shopee.ui.navigation

import androidx.annotation.DrawableRes
import com.aneeb.shopee.R
import kotlinx.serialization.Serializable


@Serializable
sealed class BottomNavItem<T>(val route: T, val title: String, @DrawableRes val icon: Int) {

    @Serializable
    data object Home : BottomNavItem<AppRoutes.Home>(route = AppRoutes.Home, title = "Home", icon = R.drawable.navbar_home_icon)

    @Serializable
    data object Favorite :
        BottomNavItem<AppRoutes.Favorites>(
            AppRoutes.Favorites,
            "Favorite",
            R.drawable.navbar_favorite
        )

    @Serializable
    data object Cart :
        BottomNavItem<AppRoutes.Cart>(AppRoutes.Cart, "Cart", R.drawable.navbar_cart)

    @Serializable
    data object Profile :
        BottomNavItem<AppRoutes.Profile>(AppRoutes.Profile, "Profile", R.drawable.navbar_profile)


}