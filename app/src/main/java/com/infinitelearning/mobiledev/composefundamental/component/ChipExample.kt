package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinitelearning.mobiledev.composefundamental.ui.theme.FirstAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipExample(modifier: Modifier = Modifier) {
    var selected by remember { mutableStateOf(false) }

    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text(text = "Filter Chip") },
        leadingIcon = {
            if (selected) {
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = "Done Icon",
                    modifier = modifier.size(FilterChipDefaults.IconSize)
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun ChipExamplePreview(modifier: Modifier = Modifier) {
    FirstAppTheme {
        ChipExample()
    }
}