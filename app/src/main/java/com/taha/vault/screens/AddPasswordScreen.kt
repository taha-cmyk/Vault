package com.taha.vault.screens

import PasswordScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.taha.vault.viewmodels.PasswordViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun AddPasswordScreen (navHostController: NavHostController,passwordViewModel: PasswordViewModel =  koinViewModel()) {
    PasswordScreen(
        onPasswordSet = { newPassword ->
            passwordViewModel.setPassword(newPassword)
            navHostController.navigate(Screen.Main.route)

        }
    )
}


