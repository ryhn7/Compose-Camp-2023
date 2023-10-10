package com.example.basiccompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccompose.ui.screen.components.Section
import com.example.basiccompose.ui.theme.BasicComposeTheme

@Composable
fun ComposeQuadrant(
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Section(
                title = "Text composable",
                body = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.fillMaxWidth(0.5f)
            )
            Section(
                title = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF),
                modifier = Modifier
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Section(
                title = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8),
                modifier = Modifier.fillMaxWidth(0.5f)
            )
            Section(
                title = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF),
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    BasicComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = Color(0xFFFFFFFF)
        ) {
            ComposeQuadrant(modifier = Modifier.background(Color(0xFFd2e8d4)))
        }
    }
}