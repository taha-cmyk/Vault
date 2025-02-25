---
layout: default
title: "AddPasswordScreen"
source_file: "app/src/main/java/com/taha/vault/screens/AddPasswordScreen.kt"
---

# AddPasswordScreen
=====================

## Overview
The `AddPasswordScreen` is a Jetpack Compose screen that allows users to add a new password. It uses the `PasswordScreen` composable function to display the password input UI and the `PasswordViewModel` to store the new password.

## Class Description
The `AddPasswordScreen` is a composable function that takes a `NavHostController` and an optional `PasswordViewModel` as parameters. It uses the `PasswordScreen` composable function to display the password input UI and the `PasswordViewModel` to store the new password.

## Parameters and Return Values
* `navHostController`: a `NavHostController` object that is used to navigate to other screens.
* `passwordViewModel`: an optional `PasswordViewModel` object that is used to store the new password. If not provided, a new instance of `PasswordViewModel` will be created using the `koinViewModel()` function.

## Usage Example
```kotlin
val navHostController = // create a NavHostController instance
AddPasswordScreen(navHostController = navHostController)
```

## API Reference

### `AddPasswordScreen(navHostController: NavHostController, passwordViewModel: PasswordViewModel = koinViewModel())`

**Description**: A composable function that displays the password input UI and stores the new password using the `PasswordViewModel`.

**Parameters**:
* `navHostController` (NavHostController): a `NavHostController` object that is used to navigate to other screens.
* `passwordViewModel` (PasswordViewModel): an optional `PasswordViewModel` object that is used to store the new password. If not provided, a new instance of `PasswordViewModel` will be created using the `koinViewModel()` function.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
val navHostController = // create a NavHostController instance
AddPasswordScreen(navHostController = navHostController)
```

Note: The `PasswordScreen` composable function is not documented here as it is not part of the provided code. However, it is assumed to be a composable function that displays the password input UI and calls the `onPasswordSet` callback when the user sets a new password.

## PasswordViewModel
The `PasswordViewModel` is a view model that stores the new password. It has a `setPassword` method that takes a `String` parameter and stores it as the new password.

### `setPassword(newPassword: String)`

**Description**: Stores the new password.

**Parameters**:
* `newPassword` (String): the new password to be stored.

**Returns**: Nothing.

**Throws**: Nothing.

**Example**:
```kotlin
val passwordViewModel = // create a PasswordViewModel instance
passwordViewModel.setPassword("new_password")
```