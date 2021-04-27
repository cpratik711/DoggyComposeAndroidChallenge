package com.pratik.doggycompose.compose_component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CharacterChip(character: String, colorResource: Color = Color.Blue) {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 4.dp
    ) {
        Text(
            text = character,
            style = MaterialTheme.typography.caption,
            color = colorResource,
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)
        )
    }
}


@Preview
@Composable
fun CharacterChipDemo() {
    CharacterChip(character = "Age: 10 Rupees")
}

