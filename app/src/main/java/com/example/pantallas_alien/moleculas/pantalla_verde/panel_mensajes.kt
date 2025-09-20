package com.example.pantallas_alien.moleculas.pantalla_verde

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoleculePanel(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFF002600))
            .border(width = 2.dp, color = Color(0xFF12BA6D))
            .padding(8.dp)
    ) {
        content()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF001A00)
@Composable
fun PreviewMoleculePanel() {
    MoleculePanel {
        Text("PERSONAL", color = Color.White, fontSize = 28.sp)
    }
}
