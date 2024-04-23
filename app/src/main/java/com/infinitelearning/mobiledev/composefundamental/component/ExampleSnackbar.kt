package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme
import kotlinx.coroutines.launch

@Composable
fun ExampleSnackbar(modifier: Modifier = Modifier) {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                icon = {
                    Icon(imageVector = Icons.Default.Face, contentDescription = "Face Icon")
                },
                text = {
                    Text(text = "Kangen")
                },
                onClick = { scope.launch {
                    snackbarHostState.showSnackbar("Ya, Aku kangen kamu!")
                } },
            )
        }
    ) {
        Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize().padding(it)) {
            Text(text = "Apakah kamu kangen aku?")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ExampleSnackbarPreview() {
    ComposeFundamentalTheme {
        ExampleSnackbar()
    }
}