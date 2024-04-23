package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleBottomSheet(modifier: Modifier = Modifier) {
    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                icon = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add Icon")
                },
                text = {
                    Text(text = "Show Bottom Sheet")
                },
                onClick = { showBottomSheet = true }
            )
        }
    ) {
        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = { showBottomSheet = false },
                modifier = modifier.padding(it),
                sheetState = sheetState
            ) {
                Text(text = "Ini Bottom Sheet", modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ExampleBottomSheetPreview() {
    ComposeFundamentalTheme {
        ExampleBottomSheet()
    }
}