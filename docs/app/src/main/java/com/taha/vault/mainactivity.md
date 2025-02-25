---
layout: default
title: "Overview"
source_file: "app/src/main/java/com/taha/vault/MainActivity.kt"
---

# Overview
The provided Kotlin code is for an Android application's main activity, specifically designed to work with the Jetpack Compose framework and the Koin dependency injection library. The `MainActivity` class sets up the application's theme, initializes Koin, and defines the main navigation host for the application.

## Class Descriptions

### `MainActivity`

**Description**: The main activity of the application, responsible for setting up the application's theme, initializing Koin, and defining the main navigation host.

**Parameters**:
- None

**Returns**:
- None

### `GreetingPreview`

**Description**: A preview composable function used to preview the application's theme.

**Parameters**:
- None

**Returns**:
- A composable preview of the application's theme.

## API Reference

### `MainActivity()`

**Description**: The main activity of the application.

**Parameters**:
- None

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Create a new instance of MainActivity
val mainActivity = MainActivity()
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Override onCreate in your activity
class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize your activity here
    }
}
```

### `GreetingPreview()`

**Description**: A preview composable function used to preview the application's theme.

**Parameters**:
- None

**Returns**:
- A composable preview of the application's theme.

**Throws**:
- None

**Example**:
```kotlin
// Use GreetingPreview in your code
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    GreetingPreview()
}
```

### `startKoin(block: KoinApplication.() -> Unit)`

**Description**: Starts the Koin application.

**Parameters**:
- `block` (KoinApplication.() -> Unit): A block of code to execute on the Koin application.

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Start Koin in your activity
startKoin {
    androidContext(this@MyActivity)
    modules(appModule)
}
```

## Usage Examples

### Starting Koin and setting up the application's theme

```kotlin
class MyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startKoin {
            androidContext(this@MyActivity)
            modules(appModule)
        }
        setContent {
            VaultTheme {
                // Your composable content here
            }
        }
    }
}
```

### Using the `GreetingPreview` composable function

```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    GreetingPreview()
}
```

Note: The `GreetingPreview` function is currently empty and does not display any content. You will need to add composable content to this function to see a preview.