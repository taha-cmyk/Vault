Vault Database Documentation
==========================

Overview
--------

The Vault Database is a Room-based database designed to store and manage vault items and key-value pairs. It provides a singleton instance of the database, ensuring that only one instance is created throughout the application's lifecycle.

### `VaultDatabase`

**Description**: The main database class that extends RoomDatabase. It provides abstract methods for accessing the DAOs (Data Access Objects) for vault items and key-value pairs.

**Properties**:

- `vaultItemDao`: An abstract method that returns a VaultItemDao instance.
- `keyValueDao`: An abstract method that returns a KeyValueDao instance.

### `VaultDatabase.getDatabase(context)`

**Description**: A companion object method that returns the singleton instance of the VaultDatabase. If the instance is not created, it builds a new instance using Room's database builder.

**Parameters**:

- `context` (Context): The application context.

**Returns**: The singleton instance of VaultDatabase.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
val vaultItemDao = database.vaultItemDao()
val keyValueDao = database.keyValueDao()
```

API Reference
-------------

### `VaultDatabase.getDatabase(context)`

**Description**: Returns the singleton instance of the VaultDatabase.

**Parameters**:

- `context` (Context): The application context.

**Returns**: The singleton instance of VaultDatabase.

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### `VaultDatabase.vaultItemDao()`

**Description**: Returns a VaultItemDao instance for accessing vault items.

**Parameters**: None

**Returns**: A VaultItemDao instance.

**Throws**: None

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

### `VaultDatabase.keyValueDao()`

**Description**: Returns a KeyValueDao instance for accessing key-value pairs.

**Parameters**: None

**Returns**: A KeyValueDao instance.

**Throws**: None

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

### `VaultDatabase`

**Description**: The main database class that extends RoomDatabase.

**Properties**:

- `INSTANCE` (VaultDatabase?): The singleton instance of the database.

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```