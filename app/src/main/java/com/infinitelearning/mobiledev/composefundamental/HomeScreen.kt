package com.infinitelearning.mobiledev.composefundamental

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinitelearning.mobiledev.composefundamental.ui.theme.FirstAppTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        floatingActionButton = {
            LargeFloatingActionButton(
                onClick = { /*do something*/ },
                shape = CircleShape
            ) {
                IconButton(onClick = { /*do something*/ }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon"
                    )
                }
            }
        },
        modifier = modifier
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Text(text = "Ini adalah Content Home")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    FirstAppTheme {
        HomeScreen()
    }
}