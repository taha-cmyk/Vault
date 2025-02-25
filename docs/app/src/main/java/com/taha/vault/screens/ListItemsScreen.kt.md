Vault Items List Screen
=======================

Overview
--------

The `VaultItemsList` screen is a Composable function that displays a list of vault items. Each item is represented as a card containing the item's title, value (if applicable), and the date it was last updated.

### `VaultItemsList(items, modifier)`

**Description**: A Composable function that displays a list of vault items.

**Parameters**:
- `items` (List<VaultItem>): The list of vault items to be displayed.
- `modifier` (Modifier): A modifier to be applied to the list.

**Returns**: A Composable function that displays the list of vault items.

**Example**:
```kotlin
@Composable
fun MyScreen() {
    val items = listOf(
        VaultItem(title = "Item 1", value = "Value 1", type = VaultItemType.PASSWORD),
        VaultItem(title = "Item 2", value = "Value 2", type = VaultItemType.NOTE)
    )
    VaultItemsList(items = items)
}
```

API Reference
-------------

### `VaultItemsList(items, modifier)`

**Description**: A Composable function that displays a list of vault items.

**Parameters**:
- `items` (List<VaultItem>): The list of vault items to be displayed.
- `modifier` (Modifier): A modifier to be applied to the list.

**Returns**: A Composable function that displays the list of vault items.

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyScreen() {
    val items = listOf(
        VaultItem(title = "Item 1", value = "Value 1", type = VaultItemType.PASSWORD),
        VaultItem(title = "Item 2", value = "Value 2", type = VaultItemType.NOTE)
    )
    VaultItemsList(items = items)
}
```

### `formatDate(timestamp)`

**Description**: A function that formats a timestamp into a human-readable date string.

**Parameters**:
- `timestamp` (Long): The timestamp to be formatted.

**Returns**: A string representing the formatted date.

**Throws**: None

**Example**:
```kotlin
val timestamp = 1643723900L
val formattedDate = formatDate(timestamp)
println(formattedDate) // prints "Feb 01, 2022"
```

Custom Dialog
-------------

The `VaultItemsList` screen uses a `CustomDialog` to display the details of a vault item when it is clicked.

### `CustomDialog(title, message, onDismissRequest)`

**Description**: A Composable function that displays a custom dialog.

**Parameters**:
- `title` (String): The title of the dialog.
- `message` (String): The message to be displayed in the dialog.
- `onDismissRequest` (()->Unit): A callback to be executed when the dialog is dismissed.

**Returns**: A Composable function that displays the custom dialog.

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyScreen() {
    var showDialog by remember { mutableStateOf(false) }
    if (showDialog) {
        CustomDialog(
            title = "Dialog Title",
            message = "Dialog Message",
            onDismissRequest = { showDialog = false }
        )
    }
}
```

Vault Item
----------

The `VaultItemsList` screen uses a `VaultItem` data class to represent a vault item.

### `VaultItem(title, value, type)`

**Description**: A data class that represents a vault item.

**Parameters**:
- `title` (String): The title of the vault item.
- `value` (String): The value of the vault item.
- `type` (VaultItemType): The type of the vault item.

**Returns**: A `VaultItem` object.

**Throws**: None

**Example**:
```kotlin
val item = VaultItem(title = "Item 1", value = "Value 1", type = VaultItemType.PASSWORD)
```

Vault Item Type
----------------

The `VaultItemsList` screen uses a `VaultItemType` enum class to represent the type of a vault item.

### `VaultItemType`

**Description**: An enum class that represents the type of a vault item.

**Values**:
- `PASSWORD`
- `NOTE`

**Returns**: A `VaultItemType` object.

**Throws**: None

**Example**:
```kotlin
val type = VaultItemType.PASSWORD
```