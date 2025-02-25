# Theme
================

## Overview
------------

This Kotlin module provides a custom theme for an Android application based on the Samsung One UI design. It includes a dark and light color scheme, and it configures the status bar to match the theme.

## Class Descriptions
--------------------

### `VaultTheme`
------------------

**Description**: A composable function that wraps the application's UI in a custom theme based on the Samsung One UI design.

**Parameters**:

* `darkTheme` (Boolean): A boolean indicating whether to use the dark theme. Defaults to `isSystemInDarkTheme()`.
* `content` (@Composable () -> Unit): The content to be wrapped in the theme.

**Returns**: Unit

**Throws**: None

**Example**:
```kotlin
@Composable
fun App() {
    VaultTheme {
        // Application UI content
    }
}
```

## API Reference
-----------------

### `VaultTheme(darkTheme, content)`
-----------------------------------

**Description**: A composable function that wraps the application's UI in a custom theme based on the Samsung One UI design.

**Parameters**:

* `darkTheme` (Boolean): A boolean indicating whether to use the dark theme. Defaults to `isSystemInDarkTheme()`.
* `content` (@Composable () -> Unit): The content to be wrapped in the theme.

**Returns**: Unit

**Throws**: None

**Example**:
```kotlin
@Composable
fun App() {
    VaultTheme {
        // Application UI content
    }
}
```

### `SamsungDarkColorScheme`
---------------------------

**Description**: A dark color scheme based on the Samsung One UI design.

**Properties**:

* `primary`: Color(0xFF4C94FF)
* `secondary`: Color(0xFFCFCFCF)
* `tertiary`: Color(0xFF1259C3)
* `background`: Color(0xFF000000)
* `surface`: Color(0xFF121212)
* `onPrimary`: Color.White
* `onSecondary`: Color.White
* `onTertiary`: Color.White
* `onBackground`: Color.White
* `onSurface`: Color.White

### `SamsungLightColorScheme`
---------------------------

**Description**: A light color scheme based on the Samsung One UI design.

**Properties**:

* `primary`: Color(0xFF1259C3)
* `secondary`: Color(0xFF4C4C4C)
* `tertiary`: Color(0xFF4C94FF)
* `background`: Color(0xFFF7F7F7)
* `surface`: Color(0xFFFFFFFF)
* `onPrimary`: Color.White
* `onSecondary`: Color.White
* `onTertiary`: Color.White
* `onBackground`: Color.Black
* `onSurface`: Color.Black

### `Typography`
-----------------

**Description**: The typography used in the theme. (Not shown in the provided code)

### `isSystemInDarkTheme()`
---------------------------

**Description**: A function provided by the AndroidX library to determine if the system is in dark theme mode.

**Returns**: Boolean

**Throws**: None

Note: This function is not part of the provided code but is used as a default value for the `darkTheme` parameter in the `VaultTheme` function.