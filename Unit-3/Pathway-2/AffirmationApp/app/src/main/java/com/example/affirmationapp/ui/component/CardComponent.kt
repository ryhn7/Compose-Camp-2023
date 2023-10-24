package com.example.affirmationapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.affirmationapp.R
import com.example.affirmationapp.model.Affirmation

@Composable
fun CardComponent(
    affirmation: Affirmation,
    modifier: Modifier
) {
    Card(
        modifier,
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(
            painter = painterResource(id = affirmation.imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(194.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = LocalContext.current.getString(affirmation.stringResourceId),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CardComponentPreview(
) {
    CardComponent(
        affirmation = Affirmation(R.string.affirmation1, R.drawable.image1),
        modifier = Modifier
    )
}