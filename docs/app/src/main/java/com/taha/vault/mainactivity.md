---
layout: default
title: "Overview"
source_file: "app/src/main/java/com/taha/vault/MainActivity.kt"
---

# Overview
The provided Kotlin code is for an Android application's main activity, specifically designed to work with the Jetpack Compose framework and the Koin dependency injection library. The `MainActivity` class is responsible for setting up the application's theme, initializing the Koin dependency injection framework, and hosting the application's navigation.

# Class Descriptions

### `MainActivity`
**Description**: The main activity of the application, responsible for setting up the theme and initializing the Koin dependency injection framework.

**Parameters**:
- None

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Usage example
class MyActivity : MainActivity() {
    // Custom implementation
}
```

### `GreetingPreview`
**Description**: A preview composable function used to display the application's theme in the Android Studio preview panel.

**Parameters**:
- None

**Returns**:
- A composable function displaying the application's theme.

**Throws**:
- None

**Example**:
```kotlin
// Usage example
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    GreetingPreview()
}
```

# API Reference

### `MainActivity()`

**Description**: The main activity of the application, responsible for setting up the theme and initializing the Koin dependency injection framework.

**Parameters**:
- None

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Usage example
class MyActivity : MainActivity() {
    // Custom implementation
}
```

### `onCreate(savedInstanceState: Bundle?)`

**Description**: Called when the activity is created. Sets up the application's theme and initializes the Koin dependency injection framework.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Usage example
class MyActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Custom implementation
    }
}
```

### `GreetingPreview()`

**Description**: A preview composable function used to display the application's theme in the Android Studio preview panel.

**Parameters**:
- None

**Returns**:
- A composable function displaying the application's theme.

**Throws**:
- None

**Example**:
```kotlin
// Usage example
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    GreetingPreview()
}
```

### `startKoin(block: KoinApplication.() -> Unit)`

**Description**: Initializes the Koin dependency injection framework with the provided application context and module.

**Parameters**:
- `block` (KoinApplication.() -> Unit): A block of code that configures the Koin application.

**Returns**:
- None

**Throws**:
- None

**Example**:
```kotlin
// Usage example
startKoin {
    androidContext(this@MainActivity)
    modules(appModule)
}
```