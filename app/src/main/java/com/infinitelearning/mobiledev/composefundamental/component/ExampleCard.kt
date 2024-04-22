package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleCard(modifier: Modifier = Modifier) {
    Card(
        onClick = { /*do something*/ },
        colors = CardDefaults.cardColors(Color(0xFFEAE7D7)),
        modifier = modifier.size(160.dp)
    ) {
        Text(
            text = "Filled Card",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview()
@Composable
private fun ExampleCardPreview() {
    ExampleCard()
}