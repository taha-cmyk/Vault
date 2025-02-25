---
layout: default
title: "Overview"
source_file: "app/src/main/java/com/taha/vault/MainActivity.kt"
---

# Overview

The provided Kotlin code is for an Android application's main activity, specifically designed to work with the Jetpack Compose UI framework and the Koin dependency injection library. The `MainActivity` class sets up the application's theme, initializes Koin, and defines the main navigation host for the app.

## Class Descriptions

### `MainActivity`

**Description**: The main activity of the Android application, responsible for setting up the UI theme, initializing Koin, and defining the main navigation host.

**API Reference**

### `MainActivity()`

**Description**: The constructor for the `MainActivity` class.

**Parameters**: None

**Returns**: An instance of `MainActivity`

**Throws**: None

**Example**:
```kotlin
// Create a new instance of MainActivity
val mainActivity = MainActivity()
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created, sets up the UI theme, initializes Koin, and defines the main navigation host.

**Parameters**:

- `savedInstanceState` (Bundle?): The saved instance state of the activity, or null if there is no saved state.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Override the onCreate method in a subclass
class MyActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Additional initialization code here
    }
}
```

## Function Descriptions

### `GreetingPreview()`

**Description**: A preview function for the application's theme.

**API Reference**

### `GreetingPreview()`

**Description**: A preview function for the application's theme.

**Parameters**: None

**Returns**: A preview of the application's theme.

**Throws**: None

**Example**:
```kotlin
// Use the GreetingPreview function to preview the application's theme
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    GreetingPreview()
}
```

## API Reference

### `startKoin(init: KoinAppDeclaration)`

**Description**: Initializes the Koin dependency injection library.

**Parameters**:

- `init` (KoinAppDeclaration): The initialization declaration for Koin.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Initialize Koin
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```

### `KoinAndroidContext(content: @Composable () -> Unit)`

**Description**: A composable function that provides a Koin Android context.

**Parameters**:

- `content` (@Composable () -> Unit): The composable content to be displayed.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Use the KoinAndroidContext composable function
KoinAndroidContext {
    AppNavHost()
}
```

### `VaultTheme(content: @Composable () -> Unit)`

**Description**: A composable function that applies the application's theme.

**Parameters**:

- `content` (@Composable () -> Unit): The composable content to be displayed.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Use the VaultTheme composable function
VaultTheme {
    AppNavHost()
}
```

### `AppNavHost()`

**Description**: A composable function that defines the main navigation host for the application.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Use the AppNavHost composable function
AppNavHost()
```