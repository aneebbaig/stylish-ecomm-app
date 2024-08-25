package com.aneeb.shopee.ui.navigation

import kotlinx.serialization.Serializable

sealed class AppRoutes {
    @Serializable
    object Splash

    @Serializable
    object Login

    @Serializable
    object Register

    @Serializable
    object ForgotPassword

    @Serializable
    object Home

    @Serializable
    object Cart

    @Serializable
    object Favorites

    @Serializable
    object Profile


}