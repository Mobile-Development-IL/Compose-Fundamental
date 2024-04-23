package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InfiniteApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Infinite App")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*do action*/ }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Icon")
            }
        },
        modifier = modifier
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            Text(text = "Hello Infinite Learning")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InfiniteAppScreen() {
    ComposeFundamentalTheme {
        InfiniteApp()
    }
}