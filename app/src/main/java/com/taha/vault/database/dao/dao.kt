package com.taha.vault.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.taha.vault.database.entity.KeyValueEntity
import com.taha.vault.database.entity.VaultItem
import com.taha.vault.database.entity.VaultItemType
import kotlinx.coroutines.flow.Flow

@Dao
interface VaultItemDao {
    @Query("SELECT * FROM vault_items")
    fun getAll(): List<VaultItem>

    @Query("SELECT * FROM vault_items WHERE id = :id")
    fun getById(id: Long): VaultItem?

    @Insert
    fun insert(item: VaultItem): Long

    @Update
    fun update(item: VaultItem)

    @Delete
    fun delete(item: VaultItem)

    @Query("SELECT * FROM vault_items WHERE type = :type")
    fun getByType(type: VaultItemType): List<VaultItem>

    @Query("SELECT * FROM vault_items WHERE title LIKE '%' || :query || '%'")
    fun Search(query:String ): List<VaultItem>
}

@Dao
interface KeyValueDao {
    @Query("SELECT value FROM key_value_table WHERE key_ = :key")
     fun getValue(key: String): String?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun setValue(keyValueEntity: KeyValueEntity)

    @Query("DELETE FROM key_value_table WHERE key_ = :key")
     fun deleteValue(key: String)

    @Query("SELECT * FROM key_value_table")
    fun getAllValues(): List<KeyValueEntity>
}
