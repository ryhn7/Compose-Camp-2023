package com.example.dicerollerapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dicerollerapp.R

@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier,
) {
    var result by remember { mutableStateOf(1) }
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Dice(result)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { result = (1..6).random() },
        )
        {
            Text(text = stringResource(id = R.string.roll))
        }
    }
}

@Composable
fun Dice(result: Int) {
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Image(painter = painterResource(id = imageResource), contentDescription = null)
}

