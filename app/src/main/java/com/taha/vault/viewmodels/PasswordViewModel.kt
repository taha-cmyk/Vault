package com.taha.vault.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.taha.vault.database.dao.KeyValueDao
import com.taha.vault.database.entity.KeyValueEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PasswordViewModel(private val dao: KeyValueDao) : ViewModel() {

    private val _pm = MutableStateFlow<KeyValueEntity>(KeyValueEntity("",""))
    val pm: StateFlow<KeyValueEntity> = _pm.asStateFlow()
    private val key = "master_password"

    init {
        getPassword()
    }

    fun getPassword(){
        viewModelScope.launch(Dispatchers.IO) {
            val masterPassword = dao.getValue(key)
            if (masterPassword !=null ) {
                _pm.value = KeyValueEntity(key,masterPassword)
            }
        }
    }

    fun setPassword(value:String){
        viewModelScope.launch(Dispatchers.IO) {
            dao.setValue(KeyValueEntity(key,value))
            _pm.value = KeyValueEntity(key,value)

        }
    }


}