package com.taha.vault.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taha.vault.database.entity.VaultItem
import com.taha.vault.database.entity.VaultItemType
import com.taha.vault.screens.components.CustomDialog

import java.text.SimpleDateFormat
import java.util.*

// Samsung One UI Colors
private val SamsungBlue = Color(0xFF1259C3)
private val SamsungGray = Color(0xFF4D4D4D)
private val SamsungLightGray = Color(0xFFF7F7F7)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VaultItemsList(
    items: List<VaultItem>,
    modifier: Modifier = Modifier
) {

    var showDialog by remember { mutableStateOf(false) }
    var clickedItem by remember { mutableStateOf<VaultItem?>(null) }


    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(items) { item ->
            Card(
                onClick = {
                    clickedItem=item
                    showDialog=true },
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = SamsungLightGray,
                ),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 2.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Samsung-style icon container
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = SamsungBlue.copy(alpha = 0.1f),
                        modifier = Modifier.size(40.dp)
                    ) {
                        Icon(
                            imageVector = when (item.type) {
                                VaultItemType.PASSWORD -> Icons.Default.Lock
                                VaultItemType.NOTE -> Icons.Default.Menu
                            },
                            contentDescription = null,
                            modifier = Modifier
                                .padding(8.dp)
                                .size(24.dp),
                            tint = SamsungBlue
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = item.title,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = SamsungGray
                        )

                        if (item.type == VaultItemType.NOTE && !item.value.isNullOrEmpty()) {
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = item.value,
                                fontSize = 14.sp,
                                color = SamsungGray.copy(alpha = 0.7f),
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                        }

                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = formatDate(item.updatedAt),
                            fontSize = 12.sp,
                            color = SamsungGray.copy(alpha = 0.5f)
                        )
                    }

                    // Samsung-style chip
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = SamsungBlue.copy(alpha = 0.1f),
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Text(
                            text = item.type.name.lowercase()
                                .replaceFirstChar { it.uppercase() },
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                            fontSize = 12.sp,
                            color = SamsungBlue,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
    if (showDialog) {
        CustomDialog(title = clickedItem?.title.toString(), message = clickedItem?.value.toString(), onDismissRequest = { showDialog = false })
    }
}

private fun formatDate(timestamp: Long): String {
    val dateFormat = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())
    return dateFormat.format(Date(timestamp))
}