package com.taha.vault.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.taha.vault.screens.components.SearchInputField
import com.taha.vault.viewmodels.VaultViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun SearchScreen(
    navHostController: NavHostController,
    vaultViewModel: VaultViewModel = koinViewModel()
) {

    LaunchedEffect(Unit) {
        vaultViewModel.getVaults()
    }
    val items by vaultViewModel.vaults.collectAsState()
    val searchState = rememberSearchState(vaultViewModel)


    Column {
        SearchInputField(searchState = searchState)
        VaultItemsList(items)
    }

}

data class SearchState(
    val query: String,
    val onSearch: () -> Unit,
    val onQueryChange: (String) -> Unit

)

@Composable
fun rememberSearchState(
    vaultViewModel: VaultViewModel

): SearchState {
    var query by rememberSaveable { mutableStateOf("") }

    return SearchState(
        query = query,
        onSearch = {
            vaultViewModel.searchVaults(query)
        }
    ) { query = it }
}