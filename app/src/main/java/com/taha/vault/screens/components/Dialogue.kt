package com.taha.vault.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

private val SamsungBlue = Color(0xFF1259C3)
private val SamsungBackgroundColor = Color(0xFFFFFFFF)
private val SamsungTextColor = Color(0xFF000000)
private val SamsungSubtitleColor = Color(0xFF666666)
private val SamsungLightBlue = Color(0xFFE7F0FF)

@Composable
fun CustomDialog(
    onDismissRequest: () -> Unit,
    title: String = "Custom Dialog Title",
    message: String = "This is a custom dialog with tailored content."
) {
    val clipboardManager = LocalClipboardManager.current
    var showCopyConfirmation by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = { onDismissRequest() },
        properties = DialogProperties(
            dismissOnBackPress = true,
            dismissOnClickOutside = true
        )
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            shape = RoundedCornerShape(28.dp),
            colors = CardDefaults.cardColors(
                containerColor = SamsungBackgroundColor
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            )
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.Start
            ) {
                // Title
                Text(
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = SamsungTextColor,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Message with Copy Button
                Surface(
                    color = SamsungLightBlue,
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = message,
                            fontSize = 16.sp,
                            color = SamsungSubtitleColor,
                            lineHeight = 24.sp,
                        )

                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Copy button
                    FilledTonalButton(
                        onClick = {
                            clipboardManager.setText(AnnotatedString(message))
                            showCopyConfirmation = true
                        },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.filledTonalButtonColors(
                            containerColor = SamsungBlue.copy(alpha = 0.1f),
                            contentColor = SamsungBlue
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (showCopyConfirmation) "Copied!" else "Copy",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }

                    // Close Button
                    Button(
                        onClick = {onDismissRequest()},
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = SamsungBlue
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            "Close",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                }

            }
        }
    }

    LaunchedEffect(showCopyConfirmation) {
        if (showCopyConfirmation) {
            kotlinx.coroutines.delay(2000)
            showCopyConfirmation = false
        }
    }
}