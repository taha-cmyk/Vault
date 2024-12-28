package com.taha.vault.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Samsung One UI Colors
private val SamsungBlue = Color(0xFF1259C3)
private val SamsungBackground = Color(0xFFFFFFFF)
private val SamsungTextColor = Color(0xFF000000)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    title: String,
    onBackClick: (() -> Unit)? = null,
    onSearchClick: () -> Unit,
    onSettingsClick: (() -> Unit)? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = SamsungBackground,
            titleContentColor = SamsungTextColor,
            navigationIconContentColor = SamsungBlue,
            actionIconContentColor = SamsungBlue
        ),
        title = {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = SamsungTextColor
            )
        },
        navigationIcon = {
            if (onBackClick != null) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = SamsungBlue
                    )
                }
            }
        },
        actions = {

            IconButton(onClick = onSearchClick) {
                Icon(
                    imageVector =  Icons.Default.Search,
                    contentDescription = "Search",
                    tint = SamsungBlue
                )
            }

            // Menu action
            if (onSettingsClick != null) {
                IconButton(onClick = onSettingsClick) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "More options",
                        tint = SamsungBlue
                    )
                }
            }
        },
        scrollBehavior = scrollBehavior,
        modifier = Modifier.statusBarsPadding()
    )
}
