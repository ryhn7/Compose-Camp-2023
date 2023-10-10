package com.example.basiccompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.R
import com.example.basiccompose.ui.theme.BasicComposeTheme

@Composable
fun TaskManager(
    image: Int,
    title: String,
    subtitle: String,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = subtitle,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {

    BasicComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFFFFFFF)
        ) {
            TaskManager(
                image = R.drawable.ic_task_completed,
                title = "All tasks completed",
                subtitle = "Nice Work!",
                modifier = Modifier
            )
        }
    }
}