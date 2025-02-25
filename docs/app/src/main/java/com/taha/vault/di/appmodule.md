---
layout: default
title: "appModule.kt"
source_file: "app/src/main/java/com/taha/vault/di/appModule.kt"
---

**Overview**
-----------

This Kotlin code defines a module for the Koin dependency injection framework. The module, named `appModule`, provides instances of the application's database and view models.

**Class/Function Descriptions**
-----------------------------

### `appModule`

**Description**: A Koin module that provides instances of the application's database and view models.

**API Reference**
-----------------

### `appModule`

**Description**: A Koin module that provides instances of the application's database and view models.

**Parameters**: None

**Returns**: A Koin module instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
val appModule = module {
    // ...
}
```

### `getDatabase(androidContext())`

**Description**: Gets an instance of the `VaultDatabase`.

**Parameters**:
- `androidContext()` (Context): The application context.

**Returns**: An instance of the `VaultDatabase`.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { getDatabase(androidContext()) }
```

### `get<VaultDatabase>().vaultItemDao()`

**Description**: Gets an instance of the `VaultItemDao`.

**Parameters**: None

**Returns**: An instance of the `VaultItemDao`.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { get<VaultDatabase>().vaultItemDao() }
```

### `get<VaultDatabase>().keyValueDao()`

**Description**: Gets an instance of the `KeyValueDao`.

**Parameters**: None

**Returns**: An instance of the `KeyValueDao`.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { get<VaultDatabase>().keyValueDao() }
```

### `viewModelOf(::VaultViewModel)`

**Description**: Creates an instance of the `VaultViewModel`.

**Parameters**:
- `::VaultViewModel` (Function0<VaultViewModel>): A function that creates a `VaultViewModel` instance.

**Returns**: An instance of the `VaultViewModel`.

**Throws**: None

**Example**:
```kotlin
// Usage example
viewModelOf(::VaultViewModel)
```

### `viewModelOf(::PasswordViewModel)`

**Description**: Creates an instance of the `PasswordViewModel`.

**Parameters**:
- `::PasswordViewModel` (Function0<PasswordViewModel>): A function that creates a `PasswordViewModel` instance.

**Returns**: An instance of the `PasswordViewModel`.

**Throws**: None

**Example**:
```kotlin
// Usage example
viewModelOf(::PasswordViewModel)
```

**Usage Examples**
-----------------

```kotlin
// Usage example
val appModule = module {
    single { getDatabase(androidContext()) }
    single { get<VaultDatabase>().vaultItemDao() }
    single { get<VaultDatabase>().keyValueDao() }
    viewModelOf(::VaultViewModel)
    viewModelOf(::PasswordViewModel)
}
```

**API Reference**
-----------------

### `appModule`

* `getDatabase(androidContext())`
* `get<VaultDatabase>().vaultItemDao()`
* `get<VaultDatabase>().keyValueDao()`
* `viewModelOf(::VaultViewModel)`
* `viewModelOf(::PasswordViewModel)`