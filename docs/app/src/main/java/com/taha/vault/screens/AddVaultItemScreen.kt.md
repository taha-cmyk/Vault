# AddVaultItemScreen
## Overview

The `AddVaultItemScreen` is a Jetpack Compose screen that allows users to add new items to their vault. It provides a simple form with two fields: `Title` and `Value`, and a `Save` button. The screen validates the user input and only enables the `Save` button when both fields are filled.

## Class Description

### `AddVaultItemScreen(navHostController, vaultViewModel, onNavigateBack)`

**Description**: A Jetpack Compose screen for adding new vault items.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller for navigating back to the previous screen.
- `vaultViewModel` (VaultViewModel): The view model for interacting with the vault database. Defaults to a Koin-provided instance.
- `onNavigateBack` (() -> Unit): A callback for navigating back to the previous screen. Defaults to popping the back stack using the `navHostController`.

**Returns**: A Jetpack Compose screen with a form for adding new vault items.

**Example**:
```kotlin
AddVaultItemScreen(navHostController = navHostController)
```

## API Reference

### `AddVaultItemScreen(navHostController, vaultViewModel, onNavigateBack)`

**Description**: A Jetpack Compose screen for adding new vault items.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller for navigating back to the previous screen.
- `vaultViewModel` (VaultViewModel): The view model for interacting with the vault database. Defaults to a Koin-provided instance.
- `onNavigateBack` (() -> Unit): A callback for navigating back to the previous screen. Defaults to popping the back stack using the `navHostController`.

**Returns**: A Jetpack Compose screen with a form for adding new vault items.

**Throws**: None

**Example**:
```kotlin
AddVaultItemScreen(navHostController = navHostController)
```

## Usage Examples

### Basic Usage
```kotlin
AddVaultItemScreen(navHostController = navHostController)
```

### Custom Navigation
```kotlin
AddVaultItemScreen(
    navHostController = navHostController,
    onNavigateBack = { // Custom navigation logic }
)
```

### Custom View Model
```kotlin
AddVaultItemScreen(
    navHostController = navHostController,
    vaultViewModel = customViewModel
)
```

Note: This documentation only covers the public API of the `AddVaultItemScreen` composable function. The internal implementation details are not included.