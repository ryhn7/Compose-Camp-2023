package com.example.basiccompose.ui.screen.business_card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccompose.R
import com.example.basiccompose.ui.screen.components.Footer
import com.example.basiccompose.ui.screen.components.Header

@Composable
fun BusinessCardScreen(
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth()
    ) {
        Header(
            image = R.drawable.android_logo,
            fullName = "Rayhan Illyas Annabil",
            title = "Mobile Developer Expert",
            modifier = Modifier
        )
        Footer(
            phone = "(+62) 8223 4419 237",
            instagram = "@ryhnilyas",
            email = "rayhan205732@gmail.com",
            modifier = Modifier.padding(top = 200.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardScreen(
        modifier = Modifier
    )
}
