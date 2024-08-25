package com.aneeb.shopee.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.aneeb.shopee.ui.theme.NavBarColor
import com.aneeb.shopee.ui.theme.NavBarItemColor


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = remember {
        listOf(
            BottomNavItem.Home,
            BottomNavItem.Favorite,
            BottomNavItem.Cart,
            BottomNavItem.Profile
        )
    }

    NavigationBar(containerColor = NavBarColor, contentColor = NavBarItemColor) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        items.forEach { screen ->
            val isSelected =
                currentDestination?.hierarchy?.any { it.route == screen.route::class.qualifiedName } == true
            BottomNavigationItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Image(
                        painter = painterResource(id = if (isSelected) screen.selectedIcon else screen.icon),
                        contentDescription = screen.title,
                        modifier = Modifier.size(30.dp),
                    )
                },


                selectedContentColor = MaterialTheme.colorScheme.primary,
                unselectedContentColor = MaterialTheme.colorScheme.onBackground
            )
        }

    }


}