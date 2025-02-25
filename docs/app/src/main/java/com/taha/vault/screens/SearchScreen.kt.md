**Search Screen Documentation**
=====================================

### Overview

The Search Screen is a composable function that provides a search input field and displays a list of vault items based on the search query. It interacts with the `VaultViewModel` to fetch and filter vault items.

### Class/Function Descriptions

### `SearchScreen(navHostController, vaultViewModel)`

**Description**: A composable function that displays a search input field and a list of vault items.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller.
- `vaultViewModel` (VaultViewModel): The view model for vault data. Defaults to a Koin-provided instance.

**Returns**: A composable search screen.

**Example**:
```kotlin
SearchScreen(navHostController = navHostController)
```

### `SearchState(query, onSearch, onQueryChange)`

**Description**: A data class that represents the state of the search input field.

**Parameters**:
- `query` (String): The current search query.
- `onSearch` (()-> Unit): A callback function to perform a search.
- `onQueryChange` ((String) -> Unit): A callback function to update the search query.

**Returns**: An instance of SearchState.

**Example**:
```kotlin
SearchState(query = "", onSearch = { /* perform search */ }, onQueryChange = { /* update query */ })
```

### `rememberSearchState(vaultViewModel)`

**Description**: A composable function that creates and remembers a SearchState instance.

**Parameters**:
- `vaultViewModel` (VaultViewModel): The view model for vault data.

**Returns**: A remembered SearchState instance.

**Example**:
```kotlin
val searchState = rememberSearchState(vaultViewModel)
```

### API Reference

### `SearchScreen(navHostController, vaultViewModel)`

**Description**: A composable function that displays a search input field and a list of vault items.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller.
- `vaultViewModel` (VaultViewModel): The view model for vault data. Defaults to a Koin-provided instance.

**Returns**: A composable search screen.

**Throws**: None

**Example**:
```kotlin
SearchScreen(navHostController = navHostController)
```

### `SearchState(query, onSearch, onQueryChange)`

**Description**: A data class that represents the state of the search input field.

**Parameters**:
- `query` (String): The current search query.
- `onSearch` (()-> Unit): A callback function to perform a search.
- `onQueryChange` ((String) -> Unit): A callback function to update the search query.

**Returns**: An instance of SearchState.

**Throws**: None

**Example**:
```kotlin
SearchState(query = "", onSearch = { /* perform search */ }, onQueryChange = { /* update query */ })
```

### `rememberSearchState(vaultViewModel)`

**Description**: A composable function that creates and remembers a SearchState instance.

**Parameters**:
- `vaultViewModel` (VaultViewModel): The view model for vault data.

**Returns**: A remembered SearchState instance.

**Throws**: None

**Example**:
```kotlin
val searchState = rememberSearchState(vaultViewModel)
```

### `SearchState.query`

**Description**: The current search query.

**Type**: String

**Access**: Get and set

**Example**:
```kotlin
searchState.query = "new query"
```

### `SearchState.onSearch`

**Description**: A callback function to perform a search.

**Type**: ()-> Unit

**Access**: Get

**Example**:
```kotlin
searchState.onSearch()
```

### `SearchState.onQueryChange`

**Description**: A callback function to update the search query.

**Type**: (String) -> Unit

**Access**: Get

**Example**:
```kotlin
searchState.onQueryChange("new query")
```