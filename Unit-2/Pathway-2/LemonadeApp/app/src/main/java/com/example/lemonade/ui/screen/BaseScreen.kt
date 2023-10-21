package com.example.lemonade.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.R

@Composable
fun BaseScreen(
    image: Int,
    text: Int,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFc3ecd2),
            ),
            shape = RoundedCornerShape(16.dp),
            onClick = onClick
        ) {
            Image(
                painter = painterResource(id = image), contentDescription = null,
            )
        }

        Text(
            text = stringResource(id = text),
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)

fun BaseScreenPreview() {
    BaseScreen(
        image = R.drawable.lemon_tree,
        text = R.string.Lemon_tree,
        modifier = Modifier,
        onClick = {}
    )
}