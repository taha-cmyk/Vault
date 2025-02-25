Vault Database Setup
=====================

Overview
--------

This Kotlin code is used to set up a Room database for an Android application. The database, named "vault_database", contains two entities: `VaultItem` and `KeyValueEntity`. The `VaultDatabase` class provides a singleton instance of the database and abstract methods to access the `VaultItemDao` and `KeyValueDao` data access objects.

### `VaultDatabase`

**Description**: The `VaultDatabase` class is an abstract class that extends `RoomDatabase`. It provides a singleton instance of the database and abstract methods to access the `VaultItemDao` and `KeyValueDao` data access objects.

**Properties**:

- `INSTANCE` (VaultDatabase?): A volatile private variable that holds the singleton instance of the `VaultDatabase`.

### `getDatabase(context: Context)`

**Description**: Returns the singleton instance of the `VaultDatabase`. If the instance does not exist, it creates a new instance using the `Room.databaseBuilder` method.

**Parameters**:

- `context` (Context): The application context used to create the database instance.

**Returns**: The singleton instance of the `VaultDatabase` (VaultDatabase).

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```

### `vaultItemDao()`

**Description**: Returns an instance of the `VaultItemDao` data access object.

**Returns**: An instance of the `VaultItemDao` (VaultItemDao).

**Example**:
```kotlin
val vaultItemDao = database.vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns an instance of the `KeyValueDao` data access object.

**Returns**: An instance of the `KeyValueDao` (KeyValueDao).

**Example**:
```kotlin
val keyValueDao = database.keyValueDao()
```

API Reference
-------------

### `VaultDatabase`

*   `getDatabase(context: Context)`: Returns the singleton instance of the `VaultDatabase`.
    *   **Description**: Returns the singleton instance of the `VaultDatabase`. If the instance does not exist, it creates a new instance using the `Room.databaseBuilder` method.
    *   **Parameters**:
        *   `context` (Context): The application context used to create the database instance.
    *   **Returns**: The singleton instance of the `VaultDatabase` (VaultDatabase).
    *   **Example**:
    ```kotlin
val database = VaultDatabase.getDatabase(applicationContext)
```
*   `vaultItemDao()`: Returns an instance of the `VaultItemDao` data access object.
    *   **Description**: Returns an instance of the `VaultItemDao` data access object.
    *   **Returns**: An instance of the `VaultItemDao` (VaultItemDao).
    *   **Example**:
    ```kotlin
val vaultItemDao = database.vaultItemDao()
```
*   `keyValueDao()`: Returns an instance of the `KeyValueDao` data access object.
    *   **Description**: Returns an instance of the `KeyValueDao` data access object.
    *   **Returns**: An instance of the `KeyValueDao` (KeyValueDao).
    *   **Example**:
    ```kotlin
val keyValueDao = database.keyValueDao()
```