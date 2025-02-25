---
layout: default
title: "setup.kt"
source_file: "app/src/main/java/com/taha/vault/database/setup.kt"
---

Vault Database Setup
=====================

Overview
--------

The `VaultDatabase` class is a Room database setup for storing and retrieving vault items and key-value pairs. It provides a singleton instance of the database and abstract methods for accessing the data access objects (DAOs) for vault items and key-value pairs.

### `VaultDatabase`

**Description**: The `VaultDatabase` class is an abstract class that extends `RoomDatabase`. It provides a singleton instance of the database and abstract methods for accessing the DAOs for vault items and key-value pairs.

**Parameters**: None

**Returns**: None

### `getDatabase(context: Context)`

**Description**: Returns the singleton instance of the `VaultDatabase`. If the instance is null, it creates a new instance using the `Room.databaseBuilder` method.

**Parameters**:
- `context` (Context): The application context used to create the database instance

**Returns**: The singleton instance of the `VaultDatabase`

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

API Reference
-------------

### `VaultDatabase`

#### `vaultItemDao()`

**Description**: Returns the DAO for vault items

**Parameters**: None

**Returns**: The DAO for vault items (VaultItemDao)

**Throws**: None

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

#### `keyValueDao()`

**Description**: Returns the DAO for key-value pairs

**Parameters**: None

**Returns**: The DAO for key-value pairs (KeyValueDao)

**Throws**: None

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

#### `getDatabase(context: Context)`

**Description**: Returns the singleton instance of the `VaultDatabase`. If the instance is null, it creates a new instance using the `Room.databaseBuilder` method.

**Parameters**:
- `context` (Context): The application context used to create the database instance

**Returns**: The singleton instance of the `VaultDatabase`

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

### Usage Example
```kotlin
// Get the database instance
val database = VaultDatabase.getDatabase(context)

// Get the DAO for vault items
val vaultItemDao = database.vaultItemDao()

// Get the DAO for key-value pairs
val keyValueDao = database.keyValueDao()
```
Note: The `context` variable should be replaced with the actual application context.