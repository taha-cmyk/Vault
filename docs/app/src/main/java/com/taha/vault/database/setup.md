---
layout: default
title: "setup.kt"
source_file: "app/src/main/java/com/taha/vault/database/setup.kt"
---

Vault Database Documentation
==========================

Overview
--------

The `VaultDatabase` class is a Room database implementation that provides a centralized data storage solution for the application. It defines two entities: `VaultItem` and `KeyValueEntity`, and provides data access objects (DAOs) for interacting with these entities.

### Class Description

#### `VaultDatabase`

**Description**: The `VaultDatabase` class is an abstract class that extends `RoomDatabase`. It provides a singleton instance of the database and defines two abstract methods for accessing the DAOs.

### Public Methods and Properties

### `VaultDatabase.getDatabase(context: Context)`

**Description**: Returns a singleton instance of the `VaultDatabase`.

**Parameters**:
- `context` (Context): The application context.

**Returns**: A singleton instance of the `VaultDatabase`.

**Throws**: None.

**Example**:
```kotlin
// Get a reference to the database
val database = VaultDatabase.getDatabase(applicationContext)
```

### `VaultDatabase.vaultItemDao()`

**Description**: Returns a DAO for interacting with `VaultItem` entities.

**Parameters**: None.

**Returns**: A `VaultItemDao` instance.

**Throws**: None.

**Example**:
```kotlin
// Get a reference to the VaultItem DAO
val vaultItemDao = database.vaultItemDao()
```

### `VaultDatabase.keyValueDao()`

**Description**: Returns a DAO for interacting with `KeyValueEntity` entities.

**Parameters**: None.

**Returns**: A `KeyValueDao` instance.

**Throws**: None.

**Example**:
```kotlin
// Get a reference to the KeyValue DAO
val keyValueDao = database.keyValueDao()
```

API Reference
-------------

### `VaultDatabase`

* `getDatabase(context: Context)`: Returns a singleton instance of the `VaultDatabase`.
* `vaultItemDao()`: Returns a DAO for interacting with `VaultItem` entities.
* `keyValueDao()`: Returns a DAO for interacting with `KeyValueEntity` entities.

Usage Examples
-------------

### Create a new instance of the database

```kotlin
// Get a reference to the database
val database = VaultDatabase.getDatabase(applicationContext)
```

### Interact with the DAOs

```kotlin
// Get a reference to the VaultItem DAO
val vaultItemDao = database.vaultItemDao()

// Get a reference to the KeyValue DAO
val keyValueDao = database.keyValueDao()
```