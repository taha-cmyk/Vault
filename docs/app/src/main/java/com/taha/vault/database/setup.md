---
layout: default
title: "setup.kt"
source_file: "app/src/main/java/com/taha/vault/database/setup.kt"
---

Vault Database Documentation
==========================

Overview
--------

The `VaultDatabase` class is a Room database implementation that provides a centralized storage solution for vault items and key-value pairs. It abstracts the underlying database operations and provides a simple, intuitive API for interacting with the data.

### `VaultDatabase`

**Description**: The main entry point for accessing the vault database. This class provides methods for retrieving DAOs (Data Access Objects) for vault items and key-value pairs.

**Properties**:

* `INSTANCE`: A volatile property that holds the singleton instance of the `VaultDatabase` class.

### `getDatabase(context: Context)`

**Description**: Returns the singleton instance of the `VaultDatabase` class, creating it if it doesn't exist.

**Parameters**:

* `context` (Context): The application context used to create the database instance.

**Returns**: The singleton instance of the `VaultDatabase` class.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### `vaultItemDao()`

**Description**: Returns the DAO for vault items.

**Returns**: An instance of `VaultItemDao`.

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns the DAO for key-value pairs.

**Returns**: An instance of `KeyValueDao`.

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

API Reference
-------------

### `VaultDatabase.getDatabase(context: Context)`

**Description**: Returns the singleton instance of the `VaultDatabase` class, creating it if it doesn't exist.

**Parameters**:

* `context` (Context): The application context used to create the database instance.

**Returns**: The singleton instance of the `VaultDatabase` class.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### `VaultDatabase.vaultItemDao()`

**Description**: Returns the DAO for vault items.

**Returns**: An instance of `VaultItemDao`.

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

### `VaultDatabase.keyValueDao()`

**Description**: Returns the DAO for key-value pairs.

**Returns**: An instance of `KeyValueDao`.

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

Usage Examples
--------------

### Retrieving a Vault Item DAO
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
val vaultItemDao = database.vaultItemDao()
```

### Retrieving a Key-Value DAO
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
val keyValueDao = database.keyValueDao()
```

### Creating a New Vault Item
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
val vaultItemDao = database.vaultItemDao()

val vaultItem = VaultItem(
    // initialize vault item properties here
)

vaultItemDao.insert(vaultItem)
```

### Creating a New Key-Value Pair
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
val keyValueDao = database.keyValueDao()

val keyValue = KeyValueEntity(
    // initialize key-value properties here
)

keyValueDao.insert(keyValue)
```

Note: This documentation assumes that the DAOs (`VaultItemDao` and `KeyValueDao`) and entities (`VaultItem` and `KeyValueEntity`) are properly implemented and documented separately.