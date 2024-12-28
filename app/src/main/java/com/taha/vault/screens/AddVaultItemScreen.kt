package com.taha.vault.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.taha.vault.database.entity.VaultItem
import com.taha.vault.database.entity.VaultItemType
import com.taha.vault.viewmodels.VaultViewModel
import org.koin.androidx.compose.koinViewModel
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddVaultItemScreen(
    navHostController: NavHostController,
    vaultViewModel: VaultViewModel = koinViewModel(),
    onNavigateBack: () -> Unit = {navHostController.popBackStack()}
) {
    var title by remember { mutableStateOf("") }
    var value by remember { mutableStateOf("") }

    val isFormValid = remember(title,value) {
        title.isNotBlank() && value.isNotBlank()

    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Add New Item") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Navigate back"
                        )
                    }
                },
                actions = {
                    TextButton(
                        onClick = {
                            if (isFormValid) {
                                val newItem = VaultItem(
                                    title = title.trim(),
                                    value = value.takeIf { it.isNotBlank() },
                                    type = VaultItemType.PASSWORD,
                                )
                                vaultViewModel.insertVaultItem(newItem)
                                navHostController.popBackStack()
                            }
                        },
                        enabled = isFormValid
                    ) {
                        Text("Save")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Title") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                isError = title.isBlank()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = value,
                onValueChange = { value = it },
                label = { Text("Value") },
                modifier = Modifier.fillMaxWidth(),
                isError = value.isBlank(),
                singleLine = true
            )

        }
    }
}

