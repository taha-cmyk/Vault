package com.taha.vault.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.taha.vault.database.dao.KeyValueDao
import com.taha.vault.database.dao.VaultItemDao
import com.taha.vault.database.entity.KeyValueEntity
import com.taha.vault.database.entity.VaultItem

@Database(entities = [VaultItem::class,KeyValueEntity::class], version = 1)
abstract class VaultDatabase : RoomDatabase() {
    abstract fun vaultItemDao(): VaultItemDao
    abstract fun keyValueDao(): KeyValueDao

    companion object {
        @Volatile
        private var INSTANCE: VaultDatabase? = null



        fun getDatabase(context: Context): VaultDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VaultDatabase::class.java,
                    "vault_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}