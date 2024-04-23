package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@Composable
fun HomeScreenWithBottomBar(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*do something*/ }) {
                        Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit Icon")
                    }
                    IconButton(onClick = { /*do something*/ }) {
                        Icon(imageVector = Icons.Default.Place, contentDescription = "Place Icon")
                    }
                    IconButton(onClick = { /*do something*/ }) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*do something*/ }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Add Icon")
                    }
                }
            )
        },
        modifier = modifier
    ) {
        Box(modifier = Modifier.padding(it)) {
            Text(text = "Ini adalah Home Screen dengan Bottom Bar")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenWithBottomBarPreview() {
    ComposeFundamentalTheme {
        HomeScreenWithBottomBar()
    }
}