package com.taha.vault.di

import com.taha.vault.database.VaultDatabase
import com.taha.vault.database.VaultDatabase.Companion.getDatabase
import com.taha.vault.viewmodels.PasswordViewModel
import com.taha.vault.viewmodels.VaultViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single { getDatabase(androidContext()) }
    single { get<VaultDatabase>().vaultItemDao() }
    single { get<VaultDatabase>().keyValueDao() }
    viewModelOf(::VaultViewModel)
    viewModelOf(::PasswordViewModel)



}