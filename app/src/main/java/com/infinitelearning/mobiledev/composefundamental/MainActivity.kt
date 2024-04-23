package com.infinitelearning.mobiledev.composefundamental

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.mobiledev.composefundamental.ui.theme.ComposeFundamentalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFundamentalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ContactCard()
                }
            }
        }
    }
}

@Composable
fun ContactCard(
    modifier: Modifier = Modifier
) {
    var positionOffset by remember {
        mutableStateOf(Offset(0f, 0f))
    }

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
            .pointerInput("dragging") {
                detectDragGestures { _, dragAmount ->
                    positionOffset += dragAmount
                }
            }
            .onSizeChanged {
                positionOffset = Offset(it.width / 2f, it.height / 2f)
            }
            .drawWithContent {
                drawContent()
                drawRect(
                    Brush.radialGradient(
                        listOf(Color.Transparent, Color.Black),
                        center = positionOffset,
                        radius = 100.dp.toPx()
                    )
                )
            }
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.einstein),
                contentDescription = "Einstein",
                modifier = Modifier.requiredSize(60.dp)
            )
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "Check Circle Icon",
                tint = Color.Blue,
                modifier = Modifier.offset(x = 36.dp, y = 36.dp)
            )
        }
        Column {
            Text(text = "Albert Enstein")
            Text(text = "2 Years ago")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContactCardPreview() {
    ComposeFundamentalTheme {
        ContactCard()
    }
}

// Modifier
@Composable
fun ContactCards(
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(id = R.drawable.einstein_square),
        contentDescription = "Einstein Image",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(4.dp)
            .border(2.dp, Color.Blue, CircleShape)
            .clip(CircleShape)
            .size(60.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun ContactCardsPreview() {
    ComposeFundamentalTheme {
        ContactCards()
    }
}