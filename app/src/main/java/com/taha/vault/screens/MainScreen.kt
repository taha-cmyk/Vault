package com.taha.vault.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import com.taha.vault.screens.components.MainScaffold
import com.taha.vault.viewmodels.PasswordViewModel
import com.taha.vault.viewmodels.VaultViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreen(navHostController: NavHostController, viewModel: VaultViewModel = koinViewModel()) {
    LaunchedEffect(Unit) {
        viewModel.getVaults()
    }


    val vaults by viewModel.vaults.collectAsState()


    MainScaffold(navHostController=navHostController){
        Column {
            VaultItemsList(items = vaults)
        }
    }



}