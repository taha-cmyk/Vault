Vault Database Documentation
==========================

Overview
--------

The `VaultDatabase` class is a RoomDatabase implementation that provides a centralized point for accessing and managing data in the application. It uses Room persistence library to store and retrieve data, providing a simple and efficient way to interact with the database.

The database contains two entities: `VaultItem` and `KeyValueEntity`, which are accessed through their respective DAOs (Data Access Objects).

### Class Description

#### `VaultDatabase`

`VaultDatabase` is an abstract class that extends `RoomDatabase`. It provides a singleton instance of the database, which can be accessed through the `getDatabase` method.

### API Reference

### `VaultDatabase`

**Description**: A RoomDatabase implementation that provides access to the application's data.

**Methods**:

#### `vaultItemDao()`

**Description**: Returns a `VaultItemDao` instance for accessing `VaultItem` data.

**Returns**: `VaultItemDao` instance.

**Example**:
```kotlin
val vaultItemDao = VaultDatabase.getDatabase(context).vaultItemDao()
```

#### `keyValueDao()`

**Description**: Returns a `KeyValueDao` instance for accessing `KeyValueEntity` data.

**Returns**: `KeyValueDao` instance.

**Example**:
```kotlin
val keyValueDao = VaultDatabase.getDatabase(context).keyValueDao()
```

#### `getDatabase(context: Context)`

**Description**: Returns a singleton instance of the `VaultDatabase`.

**Parameters**:

* `context` (Context): The application context.

**Returns**: `VaultDatabase` instance.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

### Usage Examples

To use the `VaultDatabase`, first obtain an instance of the database using the `getDatabase` method:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

Then, you can access the DAOs to perform CRUD operations:
```kotlin
val vaultItemDao = database.vaultItemDao()
val keyValueDao = database.keyValueDao()

// Perform CRUD operations using the DAOs
```

Note: Make sure to call `getDatabase` on the application's main thread or a thread that has a Looper attached. Room will throw an exception if the database is accessed on a background thread without a Looper.