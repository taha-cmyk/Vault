Vault Database Documentation
==========================

Overview
--------

The `VaultDatabase` class is a RoomDatabase implementation that provides a centralized database for storing and retrieving vault items and key-value pairs. It uses Room persistence library to manage the database and provides Data Access Objects (DAOs) for interacting with the database.

### Class Description

#### `VaultDatabase`

**Description**: An abstract class that extends RoomDatabase and provides DAOs for vault items and key-value pairs.

**DAOs**:

- `vaultItemDao()`: Returns a DAO for vault items.
- `keyValueDao()`: Returns a DAO for key-value pairs.

### Companion Object

The companion object provides a method to get an instance of the `VaultDatabase` class.

#### `getDatabase(context)`

**Description**: Returns an instance of the `VaultDatabase` class. If an instance already exists, it returns the existing instance. Otherwise, it creates a new instance using the provided context.

**Parameters**:

- `context` (Context): The application context.

**Returns**: An instance of the `VaultDatabase` class.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

API Reference
-------------

### `VaultDatabase`

**Description**: An abstract class that extends RoomDatabase and provides DAOs for vault items and key-value pairs.

**DAOs**:

- `vaultItemDao()`: Returns a DAO for vault items.
- `keyValueDao()`: Returns a DAO for key-value pairs.

### `getDatabase(context)`

**Description**: Returns an instance of the `VaultDatabase` class. If an instance already exists, it returns the existing instance. Otherwise, it creates a new instance using the provided context.

**Parameters**:

- `context` (Context): The application context.

**Returns**: An instance of the `VaultDatabase` class.

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### `vaultItemDao()`

**Description**: Returns a DAO for vault items.

**Parameters**: None

**Returns**: A `VaultItemDao` instance.

**Throws**: None

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns a DAO for key-value pairs.

**Parameters**: None

**Returns**: A `KeyValueDao` instance.

**Throws**: None

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

Usage Examples
-------------

### Getting an instance of the database

```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### Getting a DAO for vault items

```kotlin
val vaultItemDao = database.vaultItemDao()
```

### Getting a DAO for key-value pairs

```kotlin
val keyValueDao = database.keyValueDao()
```