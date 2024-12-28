package com.taha.vault.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.taha.vault.database.dao.VaultItemDao
import com.taha.vault.database.entity.VaultItem
import com.taha.vault.database.entity.VaultItemType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class VaultViewModel(private val vaultdao: VaultItemDao) : ViewModel() {

    private val _vaults = MutableStateFlow<List<VaultItem>>(emptyList())
    val vaults: StateFlow<List<VaultItem>> = _vaults

    fun getVaults() {
        viewModelScope.launch(Dispatchers.IO) {
            val items = vaultdao.getAll()
            _vaults.value = items
        }
    }

    fun searchVaults(query:String) {
        viewModelScope.launch(Dispatchers.IO) {
            val items = vaultdao.Search(query)
            _vaults.value = items
        }
    }

     fun insertVaultItem(item :VaultItem){
        viewModelScope.launch(Dispatchers.IO) {
            vaultdao.insert(
                item
            )
        }
    }
}