Vault ViewModel Documentation
=============================

Overview
--------

The `VaultViewModel` class is a part of the application's architecture that handles the business logic related to vault items. It provides a layer of abstraction between the user interface and the data storage, making it easier to manage and interact with vault items.

Class Description
----------------

### `VaultViewModel(vaultdao: VaultItemDao)`

**Description**: The `VaultViewModel` class is responsible for managing the vault items. It provides methods for retrieving, searching, and inserting vault items.

**Parameters**:

* `vaultdao` (VaultItemDao): The data access object for vault items.

**Returns**: An instance of `VaultViewModel`.

API Reference
-------------

### `getVaults()`

**Description**: Retrieves all vault items from the database.

**Parameters**: None

**Returns**: None (updates the `vaults` state flow)

**Throws**: None

**Example**:
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
viewModel.getVaults()
```

### `searchVaults(query: String)`

**Description**: Searches for vault items that match the given query.

**Parameters**:

* `query` (String): The search query.

**Returns**: None (updates the `vaults` state flow)

**Throws**: None

**Example**:
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
viewModel.searchVaults("example query")
```

### `insertVaultItem(item: VaultItem)`

**Description**: Inserts a new vault item into the database.

**Parameters**:

* `item` (VaultItem): The vault item to be inserted.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
val item = VaultItem("example item", VaultItemType.PASSWORD)
viewModel.insertVaultItem(item)
```

### `vaults: StateFlow<List<VaultItem>>`

**Description**: A state flow that holds the current list of vault items.

**Parameters**: None

**Returns**: The current list of vault items.

**Throws**: None

**Example**:
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
viewModel.vaults.collect { items ->
    // handle the list of vault items
}
```

Usage Examples
--------------

### Retrieving all vault items
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
viewModel.getVaults()
viewModel.vaults.collect { items ->
    // handle the list of vault items
}
```

### Searching for vault items
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
viewModel.searchVaults("example query")
viewModel.vaults.collect { items ->
    // handle the list of vault items
}
```

### Inserting a new vault item
```kotlin
val viewModel = VaultViewModel(vaultItemDao)
val item = VaultItem("example item", VaultItemType.PASSWORD)
viewModel.insertVaultItem(item)
```