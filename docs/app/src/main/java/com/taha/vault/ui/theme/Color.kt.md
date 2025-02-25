Color
================

Overview
--------

The `Color` object contains a set of predefined colors used throughout the application. These colors are defined as constants and can be easily accessed and used in the app's UI components.

API Reference
-------------

### `Color` object

The `Color` object is not explicitly defined in this code, but it's part of the `androidx.compose.ui.graphics` package. However, the colors defined here are extensions of this object.

### Color Constants

#### `Purple80`, `PurpleGrey80`, `Pink80`

**Description**: These are predefined colors with a higher lightness value.

**Type**: `Color`

**Value**:

- `Purple80`: `Color(0xFFD0BCFF)`
- `PurpleGrey80`: `Color(0xFFCCC2DC)`
- `Pink80`: `Color(0xFFEFB8C8)`

**Example**:
```kotlin
// Usage example
import com.taha.vault.ui.theme.Purple80

// Using the color in a Compose function
@Composable
fun MyComponent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple80)
    ) {
        // Content
    }
}
```

#### `Purple40`, `PurpleGrey40`, `Pink40`

**Description**: These are predefined colors with a lower lightness value.

**Type**: `Color`

**Value**:

- `Purple40`: `Color(0xFF6650a4)`
- `PurpleGrey40`: `Color(0xFF625b71)`
- `Pink40`: `Color(0xFF7D5260)`

**Example**:
```kotlin
// Usage example
import com.taha.vault.ui.theme.Purple40

// Using the color in a Compose function
@Composable
fun MyComponent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple40)
    ) {
        // Content
    }
}
```

Note that these are simple color constants and do not have any methods or properties. They are meant to be used directly as needed in the application's UI.