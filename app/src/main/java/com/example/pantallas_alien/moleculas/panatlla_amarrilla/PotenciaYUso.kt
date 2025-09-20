package com.example.pantallas_alien.moleculas.panatlla_amarrilla

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pantallas_alien.pantallas.column

@Composable
fun PotenciaYRed(
    leftLabel: String,
    leftValue: String,
    rightLabel: String,
    rightValue: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("$leftLabel $leftValue", color = Color(0xFFFFFF00), fontSize = 28.sp)
        Text("$rightLabel $rightValue", color = Color(0xFFFFFF00), fontSize = 28.sp)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF001A00)
@Composable
fun PreviewPotenciaYRed() {
    PotenciaYRed(
        leftLabel = "POTENCIA DISPONIBLE:",
        leftValue = "4",
        rightLabel = "USO DE LA RED:",
        rightValue = "2/6"
    )
}
