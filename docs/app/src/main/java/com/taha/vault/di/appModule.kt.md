# App Module Documentation

## Overview

The app module is a Koin module that provides dependencies for the application. It sets up the database, DAOs, and view models.

## Class/Function Descriptions

### `appModule`

**Description**: The app module is a Koin module that provides dependencies for the application.

**Parameters**: None

**Returns**: A Koin module

**Throws**: None

**Example**:
```kotlin
// Usage example
val appModule = module {
    // ...
}
```

### `getDatabase(context)`

**Description**: Gets the VaultDatabase instance.

**Parameters**:
- `context` (Context): The application context.

**Returns**: The VaultDatabase instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
val database = getDatabase(androidContext())
```

### `vaultItemDao()`

**Description**: Gets the VaultItemDao instance.

**Parameters**: None

**Returns**: The VaultItemDao instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
val vaultItemDao = get<VaultDatabase>().vaultItemDao()
```

### `keyValueDao()`

**Description**: Gets the KeyValueDao instance.

**Parameters**: None

**Returns**: The KeyValueDao instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
val keyValueDao = get<VaultDatabase>().keyValueDao()
```

### `VaultViewModel()`

**Description**: Creates a new instance of the VaultViewModel.

**Parameters**: None

**Returns**: A new instance of the VaultViewModel.

**Throws**: None

**Example**:
```kotlin
// Usage example
val vaultViewModel = VaultViewModel()
```

### `PasswordViewModel()`

**Description**: Creates a new instance of the PasswordViewModel.

**Parameters**: None

**Returns**: A new instance of the PasswordViewModel.

**Throws**: None

**Example**:
```kotlin
// Usage example
val passwordViewModel = PasswordViewModel()
```

## API Reference

### `appModule`

**Description**: The app module is a Koin module that provides dependencies for the application.

**Parameters**: None

**Returns**: A Koin module

**Throws**: None

**Example**:
```kotlin
// Usage example
val appModule = module {
    // ...
}
```

### `getDatabase(context)`

**Description**: Gets the VaultDatabase instance.

**Parameters**:
- `context` (Context): The application context.

**Returns**: The VaultDatabase instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
val database = getDatabase(androidContext())
```

### `single { getDatabase(androidContext()) }`

**Description**: Provides the VaultDatabase instance as a singleton.

**Parameters**: None

**Returns**: The VaultDatabase instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { getDatabase(androidContext()) }
```

### `single { get<VaultDatabase>().vaultItemDao() }`

**Description**: Provides the VaultItemDao instance as a singleton.

**Parameters**: None

**Returns**: The VaultItemDao instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { get<VaultDatabase>().vaultItemDao() }
```

### `single { get<VaultDatabase>().keyValueDao() }`

**Description**: Provides the KeyValueDao instance as a singleton.

**Parameters**: None

**Returns**: The KeyValueDao instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
single { get<VaultDatabase>().keyValueDao() }
```

### `viewModelOf(::VaultViewModel)`

**Description**: Provides the VaultViewModel instance as a view model.

**Parameters**: None

**Returns**: The VaultViewModel instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
viewModelOf(::VaultViewModel)
```

### `viewModelOf(::PasswordViewModel)`

**Description**: Provides the PasswordViewModel instance as a view model.

**Parameters**: None

**Returns**: The PasswordViewModel instance.

**Throws**: None

**Example**:
```kotlin
// Usage example
viewModelOf(::PasswordViewModel)
```