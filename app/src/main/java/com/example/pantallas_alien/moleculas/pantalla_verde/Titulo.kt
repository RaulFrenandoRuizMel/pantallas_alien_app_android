package com.example.pantallas_alien.moleculas.pantalla_verde

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoleculeSectionTitle(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFF142F18))
            .padding(4.dp),
        color = Color(0xFF12BA6D),
        fontSize = 38.sp
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF001A00)
@Composable
fun PreviewMoleculeSectionTitle() {
    MoleculeSectionTitle("FOLDERS")
}
