# MainScreen
## Overview

The `MainScreen` is a composable function that serves as the primary entry point for the application's main screen. It is responsible for displaying a list of vault items and providing navigation functionality.

## Class/Function Descriptions

### `MainScreen(navHostController, viewModel)`

**Description**: A composable function that displays the main screen of the application, featuring a list of vault items and navigation.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller for the application.
- `viewModel` (VaultViewModel): The view model for the vault data. Defaults to a `koinViewModel` instance if not provided.

**Returns**: A composable UI component.

**Throws**: None.

**Example**:
```kotlin
// Usage example
@Composable
fun MyApp() {
    val navController = rememberNavController()
    MainScreen(navHostController = navController)
}
```

## API Reference

### `MainScreen(navHostController, viewModel)`

**Description**: A composable function that displays the main screen of the application, featuring a list of vault items and navigation.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller for the application.
- `viewModel` (VaultViewModel): The view model for the vault data. Defaults to a `koinViewModel` instance if not provided.

**Returns**: A composable UI component.

**Throws**: None.

**Example**:
```kotlin
// Usage example
@Composable
fun MyApp() {
    val navController = rememberNavController()
    MainScreen(navHostController = navController)
}
```

Note: The `MainScaffold` and `VaultItemsList` components are not documented here as they are not part of the provided code. However, they should be documented separately as they are part of the application's UI components.

## Usage Examples

To use the `MainScreen` composable function, simply call it within your application's composable UI, providing the required `navHostController` parameter. The `viewModel` parameter is optional and will default to a `koinViewModel` instance if not provided.

```kotlin
// Usage example
@Composable
fun MyApp() {
    val navController = rememberNavController()
    MainScreen(navHostController = navController)
}
```

## Best Practices

- Always provide a `navHostController` instance when calling the `MainScreen` composable function.
- Consider providing a custom `viewModel` instance if you need to customize the vault data handling.
- Use the `MainScreen` composable function as the primary entry point for your application's main screen.