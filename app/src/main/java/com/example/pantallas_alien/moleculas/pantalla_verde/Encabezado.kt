package com.example.pantallas_alien.moleculas.pantalla_verde

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
fun Header(
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF12BA6D), // verde por defecto
    textColor: Color = Color(0xFF142F18)        // verde oscuro por defecto
) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(8.dp),
        fontSize = 36.sp,
        color = textColor
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF001A00,
)
@Composable
fun MoleculeHeaderPreview() {
    Column {
        Header("")
    }
}
