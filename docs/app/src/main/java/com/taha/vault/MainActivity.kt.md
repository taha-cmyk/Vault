# MainActivity Documentation

## Overview

The `MainActivity` class is the main entry point of the Android application. It is responsible for setting up the application's theme, initializing the Koin dependency injection framework, and rendering the application's navigation host.

## Class Description

### `MainActivity()`

**Description**: The main activity of the application.

**Parameters**: None

**Returns**: None

## Function Descriptions

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created. It sets up the window flags, initializes Koin, and sets the content of the activity.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Example**:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
    }
}
```

### `GreetingPreview()`

**Description**: A preview function for the application's theme.

**Parameters**: None

**Returns**: A `@Composable` function that renders the application's theme.

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaultTheme {

    }
}
```

## API Reference

### `MainActivity()`

**Description**: The main activity of the application.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
class MainActivity : ComponentActivity() {
    // ...
}
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created. It sets up the window flags, initializes Koin, and sets the content of the activity.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
    }
}
```

### `GreetingPreview()`

**Description**: A preview function for the application's theme.

**Parameters**: None

**Returns**: A `@Composable` function that renders the application's theme.

**Throws**: None

**Example**:
```kotlin
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaultTheme {

    }
}
```

### `startKoin(block: KoinApplication.() -> Unit)`

**Description**: Starts the Koin dependency injection framework.

**Parameters**:
- `block` (KoinApplication.() -> Unit): A lambda function that configures the Koin application.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```

### `KoinAndroidContext(content: @Composable () -> Unit)`

**Description**: A composable function that provides the Koin Android context.

**Parameters**:
- `content` (@Composable () -> Unit): A composable function that renders the content.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
KoinAndroidContext {
    AppNavHost()
}
```

### `VaultTheme(content: @Composable () -> Unit)`

**Description**: A composable function that provides the application's theme.

**Parameters**:
- `content` (@Composable () -> Unit): A composable function that renders the content.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
VaultTheme {
    // ...
}
```