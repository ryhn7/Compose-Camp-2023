package com.example.basiccompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.R
import com.example.basiccompose.ui.theme.BasicComposeTheme

@Composable
fun ComposeArticle(
    image: Int,
    title: String,
    paragraph: String,
    paragraph2: String,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paragraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    BasicComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFFFFFFF)
        ) {
            ComposeArticle(
                image = R.drawable.bg_compose_background,
                title = stringResource(R.string.title),
                paragraph = stringResource(R.string.paragraph_1),
                paragraph2 = stringResource(R.string.paragraph_2),
                modifier = Modifier
            )
        }
    }
}