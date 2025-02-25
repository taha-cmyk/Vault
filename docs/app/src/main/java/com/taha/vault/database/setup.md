---
layout: default
title: "setup.kt"
source_file: "app/src/main/java/com/taha/vault/database/setup.kt"
---

Vault Database Documentation
==========================

Overview
--------

The `VaultDatabase` class is a Room database implementation that provides a single source of truth for the application's data. It defines the database schema and provides DAOs (Data Access Objects) to interact with the data.

### `VaultDatabase`

**Description**: The `VaultDatabase` class is an abstract class that extends `RoomDatabase`. It defines the database schema and provides DAOs to interact with the data.

**Parameters**: None

**Returns**: None

**Throws**: None

### `getDatabase(context: Context)`

**Description**: The `getDatabase` function returns a singleton instance of the `VaultDatabase` class. If the instance does not exist, it creates a new instance using the `Room.databaseBuilder` method.

**Parameters**:
- `context` (Context): The application context.

**Returns**: A singleton instance of the `VaultDatabase` class.

**Throws**: None

**Example**:
```kotlin
// Get the database instance
val database = VaultDatabase.getDatabase(applicationContext)
```

API Reference
-------------

### `VaultDatabase`

**Description**: The `VaultDatabase` class is an abstract class that extends `RoomDatabase`. It defines the database schema and provides DAOs to interact with the data.

**Properties**:
- `vaultItemDao`: A DAO that provides methods to interact with `VaultItem` entities.
- `keyValueDao`: A DAO that provides methods to interact with `KeyValueEntity` entities.

### `getDatabase(context: Context)`

**Description**: The `getDatabase` function returns a singleton instance of the `VaultDatabase` class. If the instance does not exist, it creates a new instance using the `Room.databaseBuilder` method.

**Parameters**:
- `context` (Context): The application context.

**Returns**: A singleton instance of the `VaultDatabase` class.

**Throws**: None

### `vaultItemDao()`

**Description**: The `vaultItemDao` function returns a DAO that provides methods to interact with `VaultItem` entities.

**Parameters**: None

**Returns**: A DAO that provides methods to interact with `VaultItem` entities.

**Throws**: None

### `keyValueDao()`

**Description**: The `keyValueDao` function returns a DAO that provides methods to interact with `KeyValueEntity` entities.

**Parameters**: None

**Returns**: A DAO that provides methods to interact with `KeyValueEntity` entities.

**Throws**: None

Usage Examples
-------------

```kotlin
// Get the database instance
val database = VaultDatabase.getDatabase(applicationContext)

// Get the DAO instances
val vaultItemDao = database.vaultItemDao()
val keyValueDao = database.keyValueDao()
```

Note: This documentation assumes that the `VaultItemDao` and `KeyValueDao` classes are properly documented separately. If not, you should generate documentation for those classes as well.