package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.FirstAppTheme

@Composable
fun ExampleSlider(modifier: Modifier = Modifier) {
    var sliderValue by remember { mutableFloatStateOf(0f) }

    Slider(
        value = sliderValue,
        onValueChange = { sliderValue = it },
        steps = 20,
        valueRange = 0f..100f,
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun ExampleSliderPreview() {
    FirstAppTheme {
        ExampleSlider()
    }
}