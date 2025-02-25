# Custom Dialog Component

The `CustomDialog` component is a customizable dialog box designed for Android applications. It provides a tailored layout with a title, message, copy button, and close button.

## Class Description

### `CustomDialog(onDismissRequest, title, message)`

**Description**: A composable function that displays a custom dialog box with a title, message, copy button, and close button.

**Parameters**:

* `onDismissRequest` (()->Unit): A callback function that is invoked when the dialog is dismissed.
* `title` (String): The title of the dialog box. Default value is "Custom Dialog Title".
* `message` (String): The message displayed in the dialog box. Default value is "This is a custom dialog with tailored content.".

**Returns**: None

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyScreen() {
    var showDialog by remember { mutableStateOf(false) }

    Column {
        Button(onClick = { showDialog = true }) {
            Text("Show Dialog")
        }

        if (showDialog) {
            CustomDialog(
                onDismissRequest = { showDialog = false },
                title = "My Dialog Title",
                message = "This is a custom dialog message."
            )
        }
    }
}
```

## API Reference

### `CustomDialog(onDismissRequest, title, message)`

**Description**: A composable function that displays a custom dialog box with a title, message, copy button, and close button.

**Parameters**:

* `onDismissRequest` (()->Unit): A callback function that is invoked when the dialog is dismissed.
* `title` (String): The title of the dialog box. Default value is "Custom Dialog Title".
* `message` (String): The message displayed in the dialog box. Default value is "This is a custom dialog with tailored content.".

**Returns**: None

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyScreen() {
    var showDialog by remember { mutableStateOf(false) }

    Column {
        Button(onClick = { showDialog = true }) {
            Text("Show Dialog")
        }

        if (showDialog) {
            CustomDialog(
                onDismissRequest = { showDialog = false },
                title = "My Dialog Title",
                message = "This is a custom dialog message."
            )
        }
    }
}
```

## Internal Implementation Details

The `CustomDialog` component uses the following colors:

* `SamsungBlue`: #1259C3
* `SamsungBackgroundColor`: #FFFFFF
* `SamsungTextColor`: #000000
* `SamsungSubtitleColor`: #666666
* `SamsungLightBlue`: #E7F0FF

These colors are used to style the dialog box and its components. The `CustomDialog` component also uses the `LocalClipboardManager` to handle copying the message to the clipboard. The `LaunchedEffect` composable is used to display a "Copied!" message for 2 seconds after the copy button is clicked.