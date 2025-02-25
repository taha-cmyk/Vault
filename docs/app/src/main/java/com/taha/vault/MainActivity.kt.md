# MainActivity Documentation
======================================

## Overview
------------

The `MainActivity` class is the main entry point of the application. It is responsible for setting up the application's theme, starting the Koin dependency injection framework, and rendering the application's navigation host.

## Class Description
-------------------

### `MainActivity`

**Description**: The main activity of the application.

**Parameters**: None

**Returns**: None

## Method Descriptions
----------------------

### `onCreate(savedInstanceState)`

**Description**: Called when the activity is created. Sets up the application's theme, starts the Koin dependency injection framework, and renders the application's navigation host.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Not intended to be used directly
```

## API Reference
-----------------

### `MainActivity()`

**Description**: The main activity of the application.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Not intended to be used directly
```

### `onCreate(savedInstanceState)`

**Description**: Called when the activity is created. Sets up the application's theme, starts the Koin dependency injection framework, and renders the application's navigation host.

**Parameters**:
- `savedInstanceState` (Bundle?): The saved instance state of the activity.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
// Not intended to be used directly
```

### `GreetingPreview()`

**Description**: A preview composable for the application's theme.

**Parameters**: None

**Returns**: A composable preview of the application's theme.

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

## Usage Examples
------------------

To use the `MainActivity` class, simply create a new instance of it and start the activity.

```kotlin
// Not intended to be used directly
```

To use the `GreetingPreview` composable, simply call it in a composable scope.

```kotlin
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaultTheme {

    }
}
```

Note: The `MainActivity` class is not intended to be used directly. It is the main entry point of the application and is started automatically when the application is launched.