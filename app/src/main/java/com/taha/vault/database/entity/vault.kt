package com.taha.vault.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vault_items")
data class VaultItem(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val value: String?,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis(),
    val type: VaultItemType,
)

enum class VaultItemType {
    PASSWORD,
    NOTE
}


@Entity(tableName = "key_value_table")
data class KeyValueEntity(
    @PrimaryKey val key_: String,
    var value: String
)

