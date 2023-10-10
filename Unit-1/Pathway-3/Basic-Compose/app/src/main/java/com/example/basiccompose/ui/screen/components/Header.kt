package com.example.basiccompose.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.basiccompose.R


@Composable
fun Header(
    image: Int,
    fullName: String,
    title: String,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(color = Color(0xFF073042))
        )
        Text(
            text = fullName,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Light
            ),
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            color = Color(0xFF2a7a50),
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header(
        image = R.drawable.android_logo,
        fullName = "Rayhan Illyas Annabil",
        title = "Mobile Developer Expert",
        modifier = Modifier
    )
}