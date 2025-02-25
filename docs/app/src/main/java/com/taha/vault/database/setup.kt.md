Vault Database Setup
=====================

Overview
--------

This Kotlin code is used to set up a Room database for a vault application. The database contains two entities: `VaultItem` and `KeyValueEntity`. The `VaultDatabase` class provides a singleton instance of the database and abstract methods to access the DAOs (Data Access Objects) for these entities.

### `VaultDatabase`

**Description**: A Room database class that provides access to the DAOs for `VaultItem` and `KeyValueEntity` entities.

**API Reference**

### `VaultDatabase`

**Description**: A Room database class that provides access to the DAOs for `VaultItem` and `KeyValueEntity` entities.

**Constructors**:

- Private constructor (no direct instantiation allowed)

**Properties**:

- `INSTANCE` (VaultDatabase?): A volatile singleton instance of the database

**Methods**:

### `vaultItemDao()`

**Description**: Returns a DAO for `VaultItem` entities.

**Parameters**: None

**Returns**: A `VaultItemDao` object

**Throws**: None

**Example**:
```kotlin
val vaultItemDao = VaultDatabase.getDatabase(context).vaultItemDao()
```

### `keyValueDao()`

**Description**: Returns a DAO for `KeyValueEntity` entities.

**Parameters**: None

**Returns**: A `KeyValueDao` object

**Throws**: None

**Example**:
```kotlin
val keyValueDao = VaultDatabase.getDatabase(context).keyValueDao()
```

### `getDatabase(context: Context)`

**Description**: Returns a singleton instance of the `VaultDatabase`.

**Parameters**:

- `context` (Context): The application context

**Returns**: A `VaultDatabase` object

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

API Reference
-------------

### `VaultDatabase.getDatabase(context: Context)`

**Description**: Returns a singleton instance of the `VaultDatabase`.

**Parameters**:

- `context` (Context): The application context

**Returns**: A `VaultDatabase` object

**Throws**: None

**Example**:
```kotlin
val database = VaultDatabase.getDatabase(context)
```

### `VaultDatabase.vaultItemDao()`

**Description**: Returns a DAO for `VaultItem` entities.

**Parameters**: None

**Returns**: A `VaultItemDao` object

**Throws**: None

**Example**:
```kotlin
val vaultItemDao = VaultDatabase.getDatabase(context).vaultItemDao()
```

### `VaultDatabase.keyValueDao()`

**Description**: Returns a DAO for `KeyValueEntity` entities.

**Parameters**: None

**Returns**: A `KeyValueDao` object

**Throws**: None

**Example**:
```kotlin
val keyValueDao = VaultDatabase.getDatabase(context).keyValueDao()
```

Usage Examples
-------------

To use this database setup, you would first need to get a reference to the database instance:

```kotlin
val database = VaultDatabase.getDatabase(context)
```

Then, you can use the DAOs to interact with the database:

```kotlin
val vaultItemDao = database.vaultItemDao()
val keyValueDao = database.keyValueDao()
```

Note that this code assumes that you have already set up the necessary entities and DAOs for your application.