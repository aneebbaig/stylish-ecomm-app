package com.aneeb.shopee.ui.navigation

import androidx.annotation.DrawableRes
import com.aneeb.shopee.R
import kotlinx.serialization.Serializable


@Serializable
sealed class BottomNavItem<T>(
    val route: T,
    val title: String,
    @DrawableRes val icon: Int,
    @DrawableRes val selectedIcon: Int
) {

    @Serializable
    data object Home : BottomNavItem<AppRoutes.Home>(
        route = AppRoutes.Home,
        title = "Home",
        icon = R.drawable.home,
        selectedIcon = R.drawable.home_fill
    )

    @Serializable
    data object Favorite :
        BottomNavItem<AppRoutes.Favorites>(
            AppRoutes.Favorites,
            "Favorite",
            R.drawable.notifications,
            selectedIcon = R.drawable.notification_fill
        )

    @Serializable
    data object Cart :
        BottomNavItem<AppRoutes.Cart>(
            AppRoutes.Cart,
            "Cart",
            R.drawable.orders,
            selectedIcon = R.drawable.orders_fill
        )

    @Serializable
    data object Profile :
        BottomNavItem<AppRoutes.Profile>(
            AppRoutes.Profile,
            "Profile",
            R.drawable.profile,
            selectedIcon = R.drawable.profile_fill
        )


}