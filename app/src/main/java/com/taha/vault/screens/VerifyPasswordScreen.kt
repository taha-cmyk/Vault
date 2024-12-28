package com.taha.vault.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.taha.vault.viewmodels.PasswordViewModel
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordCheckScreen(
    navHostController: NavHostController,
    passwordViewModel: PasswordViewModel =  koinViewModel(),
) {
    var isAuthenticated by remember { mutableStateOf(false) }
    var passwordInput by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var showError by remember { mutableStateOf(false) }



    val password by passwordViewModel.pm.collectAsState()

    LaunchedEffect(password) {
        if (password.value.isNotEmpty()) {

        } else {
            navHostController.navigate(Screen.PasswordScreen.route) {
                popUpTo(Screen.PasswordVerifyScreen.route) { inclusive = true }            }
        }
    }


    Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Check Password") }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Enter Password",
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "Please enter your password to continue",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                OutlinedTextField(
                    value = passwordInput,
                    onValueChange = {
                        passwordInput = it
                        showError = false
                    },
                    label = { Text("Password") },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp),
                    visualTransformation = if (passwordVisible)
                        VisualTransformation.None
                    else PasswordVisualTransformation(),
                    isError = showError,
                    trailingIcon = {
                        val text = if (passwordVisible) "Hide" else "Show"
                        Text(modifier = Modifier.clickable{ passwordVisible = !passwordVisible },text = text)

                    },
                    modifier = Modifier.fillMaxWidth()
                )

                AnimatedVisibility(visible = showError) {
                    Text(
                        text = "Incorrect password. Please try again.",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Button(
                    onClick = {
                        if (passwordInput == password.value) {
                            isAuthenticated = true
                            navHostController.navigate(Screen.Main.route){
                                popUpTo(Screen.PasswordVerifyScreen.route) { inclusive = true }
                            }
                        } else {
                            showError = true
                            passwordInput = ""
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = passwordInput.isNotEmpty()
                ) {
                    Text("Verify")
                }
            }
        }
    }
