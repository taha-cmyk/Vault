Search Input Field
================

Overview
--------

The `SearchInputField` is a composable function that provides a customizable search input field with a hint, a search icon, and a divider. It is designed to work with the `SearchState` class to manage the search query and trigger the search action.

### `SearchInputField(modifier, surfaceColor, hint, searchState)`

**Description**: A composable function that displays a search input field with a hint, a search icon, and a divider.

**Parameters**:

* `modifier` (Modifier): The modifier to apply to the search input field. Defaults to `Modifier`.
* `surfaceColor` (Color): The background color of the search input field. Defaults to `Color(0xFFFFFFFF)`.
* `hint` (String): The hint text to display when the search query is empty. Defaults to `"Search"`.
* `searchState` (SearchState): The `SearchState` object that manages the search query and triggers the search action.

**Returns**: A composable search input field.

**Throws**: None.

**Example**:
```kotlin
@Composable
fun MyScreen() {
    val searchState = rememberSearchState()
    SearchInputField(
        modifier = Modifier.padding(16.dp),
        surfaceColor = Color.White,
        hint = "Search for something",
        searchState = searchState
    )
}
```

API Reference
-------------

### `SearchInputField(modifier, surfaceColor, hint, searchState)`

**Description**: A composable function that displays a search input field with a hint, a search icon, and a divider.

**Parameters**:

* `modifier` (Modifier): The modifier to apply to the search input field. Defaults to `Modifier`.
* `surfaceColor` (Color): The background color of the search input field. Defaults to `Color(0xFFFFFFFF)`.
* `hint` (String): The hint text to display when the search query is empty. Defaults to `"Search"`.
* `searchState` (SearchState): The `SearchState` object that manages the search query and triggers the search action.

**Returns**: A composable search input field.

**Throws**: None.

**Example**:
```kotlin
@Composable
fun MyScreen() {
    val searchState = rememberSearchState()
    SearchInputField(
        modifier = Modifier.padding(16.dp),
        surfaceColor = Color.White,
        hint = "Search for something",
        searchState = searchState
    )
}
```

Note: The `SearchState` class is not part of this documentation, but it is expected to have the following properties and methods:

* `query`: The current search query.
* `onQueryChange`: A callback function to update the search query.
* `onSearch`: A callback function to trigger the search action.

You can create your own `SearchState` class or use an existing one that matches this interface.