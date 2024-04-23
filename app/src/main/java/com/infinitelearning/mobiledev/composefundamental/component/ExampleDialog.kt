package com.infinitelearning.mobiledev.composefundamental.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.infinitelearning.mobiledev.composefundamental.R
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

@Composable
fun ExampleDialog(
    onDismissRequest: () -> Unit,
    onConfirm: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Dialog(onDismissRequest = onDismissRequest) {
        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.infinite_learning),
                    contentDescription = "Infinite Learning Icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                )
                Text(
                    text = "Apakah kamu menyukai Infinite Learning?",
                    modifier = Modifier.padding(16.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    TextButton(onClick = onDismissRequest, modifier = Modifier.padding(8.dp)) {
                        Text(text = "Sangat Suka")
                    }
                    TextButton(onClick = onConfirm, modifier = Modifier.padding(8.dp)) {
                        Text(text = "Suka Sekali")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ExampleDialogPreview() {
    ComposeFundamentalTheme {
        ExampleDialog(onDismissRequest = {}, onConfirm = {})
    }
}