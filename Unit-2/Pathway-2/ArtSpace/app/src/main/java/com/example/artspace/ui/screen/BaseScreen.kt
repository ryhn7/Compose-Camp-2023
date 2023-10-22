package com.example.artspace.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.R

@Composable
fun BaseScreen(
    image: Int,
    title: String,
    artist: String,
    year: String,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color(0xFFfefbff))
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF),
            ),
            shape = RoundedCornerShape(0.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(id = image), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                modifier = Modifier
                    .width(320.dp)
                    .background(color = Color(0xFFecebf4))
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Light
                    )
                )
                Row {
                    Text(
                        text = artist,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = year,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Normal
                        ),
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
            )
            {
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Previous")
                }
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Next")
                }
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun BaseScreenPreview() {
    BaseScreen(
        image = R.drawable.flower,
        title = "Flower Still Life with a Timepiece",
        artist = "Willem van Aelst",
        year = "(1663)",
        modifier = Modifier
    )
}