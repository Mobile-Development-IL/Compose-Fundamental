package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@Composable
fun ActionLogin(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Button(onClick = { /*do something*/ }) {
            Text(text = "Masuk")
        }
        OutlinedButton(onClick = { /*do something*/ }) {
            Text(text = "Daftar")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ActionLoginPreview() {
    ComposeFundamentalTheme {
        ActionLogin(modifier = Modifier.padding(16.dp))
    }
}