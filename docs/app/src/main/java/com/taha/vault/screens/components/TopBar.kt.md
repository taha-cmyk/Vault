Top Bar Component
================

Overview
--------

The `TopBar` component is a customizable top app bar designed for use in Android applications. It provides a simple and intuitive way to display a title, navigation icon, and actions. The component is built using Jetpack Compose and features a Samsung One UI-inspired design.

### `TopAppBar(title, onBackClick, onSearchClick, onSettingsClick, scrollBehavior)`

**Description**: A composable function that displays a top app bar with a title, navigation icon, and actions.

**Parameters**:
- `title` (String): The title to be displayed in the top app bar.
- `onBackClick` ((() -> Unit)?): An optional lambda function that will be called when the navigation icon is clicked. If null, the navigation icon will not be displayed.
- `onSearchClick` (() -> Unit): A lambda function that will be called when the search action is clicked.
- `onSettingsClick` ((() -> Unit)?): An optional lambda function that will be called when the settings action is clicked. If null, the settings action will not be displayed.
- `scrollBehavior` (TopAppBarScrollBehavior?): An optional scroll behavior for the top app bar.

**Returns**: A composable top app bar.

**Throws**: None

**Example**:
```kotlin
TopAppBar(
    title = "My App",
    onBackClick = { /* Handle back click */ },
    onSearchClick = { /* Handle search click */ },
    onSettingsClick = { /* Handle settings click */ }
)
```

API Reference
-------------

### `TopAppBar(title, onBackClick, onSearchClick, onSettingsClick, scrollBehavior)`

**Description**: A composable function that displays a top app bar with a title, navigation icon, and actions.

**Parameters**:
- `title` (String): The title to be displayed in the top app bar.
- `onBackClick` ((() -> Unit)?): An optional lambda function that will be called when the navigation icon is clicked. If null, the navigation icon will not be displayed.
- `onSearchClick` (() -> Unit): A lambda function that will be called when the search action is clicked.
- `onSettingsClick` ((() -> Unit)?): An optional lambda function that will be called when the settings action is clicked. If null, the settings action will not be displayed.
- `scrollBehavior` (TopAppBarScrollBehavior?): An optional scroll behavior for the top app bar.

**Returns**: A composable top app bar.

**Throws**: None

**Example**:
```kotlin
TopAppBar(
    title = "My App",
    onBackClick = { /* Handle back click */ },
    onSearchClick = { /* Handle search click */ },
    onSettingsClick = { /* Handle settings click */ }
)
```

Color Palette
-------------

The `TopBar` component uses the following Samsung One UI-inspired colors:

- `SamsungBlue`: #1259C3
- `SamsungBackground`: #FFFFFF
- `SamsungTextColor`: #000000

These colors can be customized by modifying the `TopAppBarDefaults.topAppBarColors` used in the `TopAppBar` composable function.