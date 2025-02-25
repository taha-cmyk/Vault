Settings Screen
================

Overview
--------

The Settings Screen is a Jetpack Compose UI component that displays the application's settings. It includes sections for security and about information, with expandable sections for additional details.

API Reference
-------------

### `SettingsScreen(navHostController)`

**Description**: The main settings screen composable function.

**Parameters**:
- `navHostController` (NavHostController): The navigation host controller used to navigate to other screens.

**Returns**: A Column composable containing the settings UI.

**Example**:
```kotlin
val navHostController = rememberNavController()
SettingsScreen(navHostController)
```

### `SettingsCategory(title)`

**Description**: A composable function that displays a settings category title.

**Parameters**:
- `title` (String): The title of the category.

**Returns**: A Text composable displaying the category title.

**Example**:
```kotlin
SettingsCategory("Security")
```

### `SettingItem(icon, title, subtitle, onClick)`

**Description**: A composable function that displays a setting item.

**Parameters**:
- `icon` (ImageVector): The icon to display next to the setting title.
- `title` (String): The title of the setting.
- `subtitle` (String): The subtitle of the setting.
- `onClick` (()->Unit): An optional callback to invoke when the setting item is clicked.

**Returns**: A Card composable containing the setting item UI.

**Example**:
```kotlin
SettingItem(
    icon = Icons.Default.Lock,
    title = "Change Master Password",
    subtitle = "Last changed 30 days ago",
    onClick = { navHostController.navigate(Screen.PasswordScreen.route) }
)
```

### `ExpandableSection(isExpanded, content)`

**Description**: A composable function that displays an expandable section.

**Parameters**:
- `isExpanded` (Boolean): Whether the section is expanded.
- `content` (@Composable ()->Unit): The content to display when the section is expanded.

**Returns**: A composable containing the expandable section UI.

**Example**:
```kotlin
var isExpanded by rememberSaveable { mutableStateOf(false) }
ExpandableSection(isExpanded) {
    Text(modifier = Modifier.padding(12.dp), text = "Expanded content")
}
```

Usage Examples
-------------

To use the Settings Screen, simply call the `SettingsScreen` composable function and pass in a `NavHostController` instance:
```kotlin
val navHostController = rememberNavController()
SettingsScreen(navHostController)
```
You can customize the appearance and behavior of the settings screen by modifying the `SettingsCategory`, `SettingItem`, and `ExpandableSection` composables.

Note that the `SettingsScreen` composable function uses Material 3 components and theming. You may need to adjust your app's theme and styling to match the settings screen's appearance.