package com.taha.vault.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.taha.vault.viewmodels.PasswordViewModel
import org.koin.androidx.compose.koinViewModel


sealed class Screen(val route: String) {
    object Main: Screen("main_screen")
    object Search: Screen("search_screen")
    object Settings: Screen("settings_screen")
    object PasswordScreen: Screen("password_screen")
    object PasswordVerifyScreen: Screen("verify_screen")
    object AddvaultItemScreen: Screen("add_item_screen")
}

@Composable
fun AppNavHost() {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = Screen.PasswordVerifyScreen.route) {

            composable(Screen.Main.route) {
                    MainScreen(navController)
            }
            composable(Screen.Search.route) {
                SearchScreen(navController)
            }
            composable(Screen.Settings.route) {
                SettingsScreen(navController)
            }
            composable(Screen.PasswordScreen.route) {
                AddPasswordScreen(navHostController = navController)
            }

            composable(Screen.PasswordVerifyScreen.route) {
                PasswordCheckScreen(navHostController = navController)
            }
            composable(Screen.AddvaultItemScreen.route) {
                AddVaultItemScreen(navHostController = navController)
            }



        }



}