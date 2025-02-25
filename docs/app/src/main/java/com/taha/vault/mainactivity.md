---
layout: default
title: "MainActivity.kt"
source_file: "app/src/main/java/com/taha/vault/MainActivity.kt"
---

**Overview**
-----------

This Kotlin code is for an Android application's main activity, specifically designed with Jetpack Compose and Koin dependency injection. The `MainActivity` class sets up the application's theme, secures the window to prevent screenshots, and initializes the Koin context with the `appModule`. It also sets the content of the activity using the `AppNavHost` composable function.

**Class Descriptions**
--------------------

### `MainActivity`

**Description**: The main activity of the application, responsible for setting up the theme, securing the window, and initializing the Koin context.

#### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created, sets up the window and Koin context, and sets the content of the activity.

**Parameters**:

- `savedInstanceState` (Bundle?): The saved instance state of the activity, or null if there is no saved state.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
class MyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize the activity
    }
}
```

### `GreetingPreview`

**Description**: A preview composable function for the application's theme.

**Parameters**: None.

**Returns**: A preview of the application's theme.

**Throws**: Nothing.

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    VaultTheme {
        // Preview content
    }
}
```

**API Reference**
-----------------

### `MainActivity()`

**Description**: The main activity of the application.

**Parameters**: None.

**Returns**: An instance of the `MainActivity` class.

**Throws**: Nothing.

**Example**:
```kotlin
class MyActivity : MainActivity() {
    // Custom activity code
}
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created.

**Parameters**:

- `savedInstanceState` (Bundle?): The saved instance state of the activity, or null if there is no saved state.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
class MyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize the activity
    }
}
```

### `GreetingPreview()`

**Description**: A preview composable function for the application's theme.

**Parameters**: None.

**Returns**: A preview of the application's theme.

**Throws**: Nothing.

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    VaultTheme {
        // Preview content
    }
}
```

### `startKoin(builder: KoinApplicationBuilder)`

**Description**: Starts the Koin context with the given application builder.

**Parameters**:

- `builder` (KoinApplicationBuilder): The application builder for the Koin context.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```

### `KoinAndroidContext(content: @Composable () -> Unit)`

**Description**: A composable function that provides the Koin context to its content.

**Parameters**:

- `content` (@Composable () -> Unit): The content of the composable function.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
KoinAndroidContext {
    // Content that uses the Koin context
}
```

### `VaultTheme(content: @Composable () -> Unit)`

**Description**: A composable function that provides the application's theme to its content.

**Parameters**:

- `content` (@Composable () -> Unit): The content of the composable function.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
VaultTheme {
    // Content that uses the application's theme
}
```

### `AppNavHost()`

**Description**: A composable function that provides the application's navigation host.

**Parameters**: None.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
AppNavHost()
```