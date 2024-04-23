package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RangeSlider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@Composable
fun ExampleRangeSlider(modifier: Modifier = Modifier) {
    var sliderValue by remember { mutableStateOf(0f..100f) }

    RangeSlider(
        value = sliderValue,
        onValueChange = { sliderValue = it },
        valueRange = 0f..100f,
        steps = 20,
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun ExampleRangeSliderPreview() {
    ComposeFundamentalTheme {
        ExampleRangeSlider()
    }
}