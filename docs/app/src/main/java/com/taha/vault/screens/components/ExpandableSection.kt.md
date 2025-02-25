Expandable Section Component
=============================

Overview
--------

The `ExpandableSection` component is a customizable UI element that displays content in an expandable section. It can be used to create accordion-like layouts, where content is hidden or revealed based on a boolean state.

API Reference
-------------

### `ExpandableSection(modifier, isExpanded, content)`

**Description**: A composable function that creates an expandable section with a customizable modifier, expansion state, and content.

**Parameters**:

- `modifier` (Modifier): A modifier that can be applied to the expandable section's container. Defaults to an empty modifier.
- `isExpanded` (Boolean): A boolean indicating whether the section is expanded or not. Defaults to `false`.
- `content` (@Composable () -> Unit): A composable function that returns the content to be displayed inside the expandable section.

**Returns**: A composable UI element representing the expandable section.

**Throws**: None

**Example**:
```kotlin
ExpandableSection(
    modifier = Modifier.padding(16.dp),
    isExpanded = true
) {
    Text("Expanded content")
}
```

Usage Examples
-------------

### Creating an Expandable Section

To create an expandable section, simply call the `ExpandableSection` composable function and provide the required parameters:
```kotlin
@Composable
fun MyScreen() {
    Column {
        ExpandableSection(
            modifier = Modifier.padding(16.dp),
            isExpanded = true
        ) {
            Text("Expanded content")
        }
    }
}
```

### Customizing the Expandable Section

You can customize the expandable section's appearance by applying modifiers to the `modifier` parameter:
```kotlin
@Composable
fun MyScreen() {
    Column {
        ExpandableSection(
            modifier = Modifier
                .padding(16.dp)
                .border(1.dp, Color.Gray),
            isExpanded = true
        ) {
            Text("Expanded content")
        }
    }
}
```

### Controlling the Expansion State

You can control the expansion state of the section by updating the `isExpanded` parameter:
```kotlin
@Composable
fun MyScreen() {
    var isExpanded by remember { mutableStateOf(false) }

    Column {
        Button(onClick = { isExpanded = !isExpanded }) {
            Text("Toggle expansion")
        }

        ExpandableSection(
            modifier = Modifier.padding(16.dp),
            isExpanded = isExpanded
        ) {
            Text("Expanded content")
        }
    }
}
```