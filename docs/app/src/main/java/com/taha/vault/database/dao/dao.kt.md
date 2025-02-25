Vault Item DAO and Key Value DAO
=====================================

Overview
--------

This module contains two Data Access Object (DAO) interfaces, `VaultItemDao` and `KeyValueDao`, which provide methods for interacting with the `vault_items` and `key_value_table` tables in the database. These DAOs are designed to be used with the Room persistence library.

### `VaultItemDao`

**Description**: This DAO provides methods for performing CRUD (Create, Read, Update, Delete) operations on the `vault_items` table.

### `KeyValueDao`

**Description**: This DAO provides methods for storing, retrieving, and deleting key-value pairs in the `key_value_table`.

API Reference
-------------

### `VaultItemDao`

#### `getAll()`

**Description**: Retrieves all vault items from the database.

**Returns**: A list of `VaultItem` objects.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val allItems: List<VaultItem> = dao.getAll()
```

#### `getById(id: Long)`

**Description**: Retrieves a vault item by its ID.

**Parameters**:

* `id` (Long): The ID of the vault item to retrieve.

**Returns**: The `VaultItem` object with the specified ID, or null if not found.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val item: VaultItem? = dao.getById(1L)
```

#### `insert(item: VaultItem)`

**Description**: Inserts a new vault item into the database.

**Parameters**:

* `item` (VaultItem): The vault item to insert.

**Returns**: The ID of the newly inserted vault item.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val item = VaultItem(title = "New Item", type = VaultItemType.PASSWORD)
val id: Long = dao.insert(item)
```

#### `update(item: VaultItem)`

**Description**: Updates an existing vault item in the database.

**Parameters**:

* `item` (VaultItem): The vault item to update.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val item = dao.getById(1L)
item!!.title = "Updated Item"
dao.update(item)
```

#### `delete(item: VaultItem)`

**Description**: Deletes a vault item from the database.

**Parameters**:

* `item` (VaultItem): The vault item to delete.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val item = dao.getById(1L)
dao.delete(item!!)
```

#### `getByType(type: VaultItemType)`

**Description**: Retrieves all vault items of a specific type.

**Parameters**:

* `type` (VaultItemType): The type of vault items to retrieve.

**Returns**: A list of `VaultItem` objects.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val items: List<VaultItem> = dao.getByType(VaultItemType.PASSWORD)
```

#### `Search(query: String)`

**Description**: Searches for vault items by title.

**Parameters**:

* `query` (String): The search query.

**Returns**: A list of `VaultItem` objects.

**Example**:
```kotlin
val dao: VaultItemDao = // obtain a reference to the DAO
val items: List<VaultItem> = dao.Search("password")
```

### `KeyValueDao`

#### `getValue(key: String)`

**Description**: Retrieves the value associated with a specific key.

**Parameters**:

* `key` (String): The key to retrieve the value for.

**Returns**: The value associated with the key, or null if not found.

**Example**:
```kotlin
val dao: KeyValueDao = // obtain a reference to the DAO
val value: String? = dao.getValue("my_key")
```

#### `setValue(keyValueEntity: KeyValueEntity)`

**Description**: Sets the value associated with a specific key.

**Parameters**:

* `keyValueEntity` (KeyValueEntity): The key-value pair to set.

**Example**:
```kotlin
val dao: KeyValueDao = // obtain a reference to the DAO
val entity = KeyValueEntity(key = "my_key", value = "my_value")
dao.setValue(entity)
```

#### `deleteValue(key: String)`

**Description**: Deletes the value associated with a specific key.

**Parameters**:

* `key` (String): The key to delete the value for.

**Example**:
```kotlin
val dao: KeyValueDao = // obtain a reference to the DAO
dao.deleteValue("my_key")
```

#### `getAllValues()`

**Description**: Retrieves all key-value pairs.

**Returns**: A list of `KeyValueEntity` objects.

**Example**:
```kotlin
val dao: KeyValueDao = // obtain a reference to the DAO
val allValues: List<KeyValueEntity> = dao.getAllValues()
```