package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@Composable
fun ExampleAlertDialog(modifier: Modifier = Modifier) {
    AlertDialog(
        icon = {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Icon")
        },
        title = {
            Text(text = "Hapus Kenangan")
        },
        text = {
            Text(text = "Apakah kamu yakin ingin menghapus kenangan indah dengan mantan?")
        },
        onDismissRequest = { /*do something*/ },
        dismissButton = {
            TextButton(onClick = { /*do something*/ }) {
                Text(text = "Gamon")
            }
        },
        confirmButton = {
            TextButton(onClick = { /*do something*/ }) {
                Text(text = "Hapus")
            }
        },
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun ExampleAlertButtonPreview() {
    ComposeFundamentalTheme {
        ExampleAlertDialog()
    }
}