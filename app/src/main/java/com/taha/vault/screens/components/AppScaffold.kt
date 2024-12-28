package com.taha.vault.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.taha.vault.screens.Screen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScaffold(navHostController: NavHostController,app: @Composable (() -> Unit)) {

     val SamsungBackgroundColor = Color(0xFFF5F6F8)
     val SamsungSurfaceColor = Color(0xFFFFFFFF)



    Scaffold(
        topBar = {
           TopAppBar(
                title = "Vault",
                onSearchClick = { navHostController.navigate(Screen.Search.route)},
               onSettingsClick = { navHostController.navigate(Screen.Settings.route) },
            )
        },
        floatingActionButton = {
            IconButton(onClick = {navHostController.navigate(Screen.AddvaultItemScreen.route)  }) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = "Add item")
            }
        },
        containerColor = SamsungBackgroundColor
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            color = SamsungSurfaceColor,
            tonalElevation = 0.dp
        ) {
            Column {}
                app()
            }

        }
    }
