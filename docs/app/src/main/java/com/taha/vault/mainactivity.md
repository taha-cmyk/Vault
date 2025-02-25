---
layout: default
title: "MainActivity.kt"
source_file: "app/src/main/java/com/taha/vault/MainActivity.kt"
---

**Vault Documentation**
======================

**Overview**
------------

The provided Kotlin code is for the `MainActivity` class, which is the entry point of an Android application. The application uses the Jetpack Compose framework for building the user interface and Koin for dependency injection. The `MainActivity` class sets up the application's theme, navigation, and dependency injection.

**Class Descriptions**
--------------------

### `MainActivity`

**Description**: The main entry point of the Android application.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
class MyActivity : ComponentActivity() {
    // ...
}
```

### `GreetingPreview`

**Description**: A preview composable function to showcase the application's theme.

**Parameters**: None

**Returns**: A composable function that displays the application's theme.

**Throws**: None

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    VaultTheme {
        // ...
    }
}
```

**Function Descriptions**
----------------------

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // ...
}
```

### `startKoin(block: KoinApplication.() -> Unit)`

**Description**: Starts the Koin application.

**Parameters**:
- `block` (KoinApplication.() -> Unit): A block of code to configure the Koin application.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```

### `setContent(content: @Composable () -> Unit)`

**Description**: Sets the content of the activity.

**Parameters**:
- `content` (@Composable () -> Unit): A composable function that defines the content of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
setContent {
    VaultTheme {
        // ...
    }
}
```

**API Reference**
-----------------

### `MainActivity()`

**Description**: The main entry point of the Android application.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
class MyActivity : ComponentActivity() {
    // ...
}
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // ...
}
```

### `startKoin(block: KoinApplication.() -> Unit)`

**Description**: Starts the Koin application.

**Parameters**:
- `block` (KoinApplication.() -> Unit): A block of code to configure the Koin application.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```

### `setContent(content: @Composable () -> Unit)`

**Description**: Sets the content of the activity.

**Parameters**:
- `content` (@Composable () -> Unit): A composable function that defines the content of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
setContent {
    VaultTheme {
        // ...
    }
}
```

### `GreetingPreview()`

**Description**: A preview composable function to showcase the application's theme.

**Parameters**: None

**Returns**: A composable function that displays the application's theme.

**Throws**: None

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    VaultTheme {
        // ...
    }
}
```

You can view this documentation on GitHub Pages using a modern theme, such as the [Just the Docs](https://github.com/pmarsceill/just-the-docs) theme.