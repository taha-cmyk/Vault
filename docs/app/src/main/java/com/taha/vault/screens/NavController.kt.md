# NavController
## Overview
The NavController is a sealed class-based navigation component for a password vault application. It handles the navigation between various screens of the app, including the main screen, search screen, settings screen, password screen, password verify screen, and add vault item screen.

## Class/Function Descriptions

### `Screen(route: String)`
**Description**: A sealed class representing the different screens of the app.

**Parameters**:
- `route` (String): The route of the screen.

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Create a new screen object
val mainScreen = Screen.Main
```

### `AppNavHost()`
**Description**: A composable function that sets up the navigation host for the app.

**Parameters**: None

**Returns**: A NavHost composable.

**Throws**: None

**Example**:
```kotlin
// Set up the app navigation host
AppNavHost()
```

## API Reference

### `Screen(route: String)`

**Description**: A sealed class representing the different screens of the app.

**Parameters**:
- `route` (String): The route of the screen.

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Create a new screen object
val mainScreen = Screen.Main
```

### `Screen.Main`

**Description**: An object representing the main screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the main screen
navController.navigate(Screen.Main.route)
```

### `Screen.Search`

**Description**: An object representing the search screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the search screen
navController.navigate(Screen.Search.route)
```

### `Screen.Settings`

**Description**: An object representing the settings screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the settings screen
navController.navigate(Screen.Settings.route)
```

### `Screen.PasswordScreen`

**Description**: An object representing the password screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the password screen
navController.navigate(Screen.PasswordScreen.route)
```

### `Screen.PasswordVerifyScreen`

**Description**: An object representing the password verify screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the password verify screen
navController.navigate(Screen.PasswordVerifyScreen.route)
```

### `Screen.AddvaultItemScreen`

**Description**: An object representing the add vault item screen of the app.

**Parameters**: None

**Returns**: An object of the Screen class.

**Throws**: None

**Example**:
```kotlin
// Navigate to the add vault item screen
navController.navigate(Screen.AddvaultItemScreen.route)
```

### `AppNavHost()`

**Description**: A composable function that sets up the navigation host for the app.

**Parameters**: None

**Returns**: A NavHost composable.

**Throws**: None

**Example**:
```kotlin
// Set up the app navigation host
AppNavHost()
```