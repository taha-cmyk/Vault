---
layout: default
title: "setup.kt"
source_file: "app/src/main/java/com/taha/vault/database/setup.kt"
---

Vault Database Documentation
==========================

Overview
--------

The Vault Database is a Room-based database solution for storing and managing vault items and key-value pairs. It provides a simple and efficient way to interact with the database through its data access objects (DAOs).

### `VaultDatabase`

**Description**: The main database class that extends RoomDatabase. It provides abstract methods for accessing the DAOs and a companion object for instantiating the database.

**Constructors**:

- `VaultDatabase()`: The default constructor.

**Methods**:

### `vaultItemDao()`

**Description**: Returns the DAO for interacting with vault items.

**Returns**: An instance of `VaultItemDao`.

**Example**:
```kotlin
val vaultItemDao = VaultDatabase.getDatabase(context).vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns the DAO for interacting with key-value pairs.

**Returns**: An instance of `KeyValueDao`.

**Example**:
```kotlin
val keyValueDao = VaultDatabase.getDatabase(context).keyValueDao()
```

### `getDatabase(context: Context)`

**Description**: Instantiates the database if it doesn't exist and returns the instance.

**Parameters**:

- `context` (Context): The application context.

**Returns**: An instance of `VaultDatabase`.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

API Reference
-------------

### `VaultDatabase`

**Description**: The main database class.

**Constructors**:

- `VaultDatabase()`: The default constructor.

### `VaultDatabase.getDatabase(context: Context)`

**Description**: Instantiates the database if it doesn't exist and returns the instance.

**Parameters**:

- `context` (Context): The application context.

**Returns**: An instance of `VaultDatabase`.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

### `vaultItemDao()`

**Description**: Returns the DAO for interacting with vault items.

**Returns**: An instance of `VaultItemDao`.

**Example**:
```kotlin
val vaultItemDao = VaultDatabase.getDatabase(context).vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns the DAO for interacting with key-value pairs.

**Returns**: An instance of `KeyValueDao`.

**Example**:
```kotlin
val keyValueDao = VaultDatabase.getDatabase(context).keyValueDao()
```

Usage Examples
-------------

### Instantiating the Database

```kotlin
val database = VaultDatabase.getDatabase(context)
```

### Accessing DAOs

```kotlin
val vaultItemDao = database.vaultItemDao()
val keyValueDao = database.keyValueDao()
```

### Interacting with the Database

```kotlin
// Insert a vault item
vaultItemDao.insert(VaultItem("Item 1", "Description 1"))

// Get all vault items
val vaultItems = vaultItemDao.getAll()

// Insert a key-value pair
keyValueDao.insert(KeyValueEntity("Key 1", "Value 1"))

// Get a key-value pair by key
val keyValue = keyValueDao.getByKey("Key 1")
```