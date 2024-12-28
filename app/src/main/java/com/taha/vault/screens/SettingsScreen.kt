package com.taha.vault.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.taha.vault.screens.components.CustomDialog
import com.taha.vault.screens.components.ExpandableSection

private val SamsungBlue = Color(0xFF1259C3)
private val SamsungGray = Color(0xFF4D4D4D)
private val SamsungLightGray = Color(0xFFF7F7F7)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navHostController: NavHostController) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SamsungLightGray)
    ) {
        // Top App Bar
        TopAppBar(
            title = {
                Text(
                    "Vault Settings",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = SamsungGray
                )
            },
            modifier = Modifier.background(Color.White),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White
            )
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Security Section
            item { SettingsCategory("Security") }
            item {
                SettingItem(
                    icon = Icons.Default.Lock,
                    title = "Change Master Password",
                    subtitle = "Last changed 30 days ago",
                    onClick = {navHostController.navigate(Screen.PasswordScreen.route)}
                )
            }
            // About Section
            item { SettingsCategory("About") }

            item {
                SettingItem(
                    icon = Icons.Default.Info,
                    title = "App Version",
                    subtitle = "1.0.0 (Build 123)",
                )
            }

            item {
                SettingItem(
                    icon = Icons.Default.Person,
                    title = "App Maintainer",
                    subtitle = "Taha Elkarroumy",
                )
                ExpandableSection(isExpanded=true) {
                    Text(modifier = Modifier.padding(12.dp), text = "elkarroumytaha@gmail.com")
                }

            }
            item {
                SettingItem(
                    icon = Icons.Default.PlayArrow,
                    title = "Security policy",
                    subtitle = "View security policy of Vault",
                    onClick = {
                        isExpanded=!isExpanded
                    }
                )

                ExpandableSection(isExpanded=isExpanded) {
                    val text = "By using this password manager app, you acknowledge that your passwords are stored locally on your device using Android's Room persistence library with SQLite encryption through SQLCipher integration. The database is encrypted using SQLCipher's AES-256 bit encryption in CBC mode, and the database file is stored in your app's private storage space which is inaccessible to other apps on unrooted devices. The app operates completely offline with no internet connectivity or remote server storage, ensuring your data never leaves your device. To access your passwords, you must create a master password that's used to derive the database encryption key. Your session automatically locks when the app goes to background or after 3 minutes of inactivity. The app implements Android's window flag FLAG_SECURE to prevent screenshots and screen recordings. If you forget your master password, there is no way to recover your stored passwords as they are encrypted within the local database. You are responsible for maintaining the security of your device and master password, and it's recommended to keep a secure backup of your passwords through the app's export feature."
                    Text(modifier = Modifier.padding(12.dp), text = text)
                }
            }
        }
    }


}

@Composable
fun SettingsCategory(title: String) {
    Text(
        text = title,
        color = SamsungBlue,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun SettingItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() } ,
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = SamsungBlue,
                    modifier = Modifier.size(24.dp)
                )
                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        color = SamsungGray
                    )
                    Text(
                        text = subtitle,
                        fontSize = 14.sp,
                        color = SamsungGray.copy(alpha = 0.7f)
                    )
                }
            }

        }
    }
}