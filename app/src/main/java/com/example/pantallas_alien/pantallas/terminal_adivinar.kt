package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pantallas_alien.moleculas.panatlla_amarrilla.PotenciaYRed
import com.example.pantallas_alien.moleculas.panatlla_amarrilla.SistemasActivar
import com.example.pantallas_alien.moleculas.pantalla_atinar.Hackeo
import com.example.pantallas_alien.moleculas.pantalla_verde.Header

@Composable
fun SistemaTiming() {
    Column(
        modifier = Modifier
            .background(Color(0xFF0A0D26)) // Fondo oscuro (#0A0D26)
            .padding(16.dp)
            .widthIn(max = 800.dp)
            .heightIn(max = 800.dp)
    ) {
        // Header con colores personalizados
        Header(
            text = "                    CONTROL DE SISTEMAS",
            backgroundColor = Color(0xFFE3074A), // Margen rojo intenso (#E3074A)
            textColor = Color(0xFFFCD079)          // Texto amarillo claro (#FCD079)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
                .padding(16.dp)
                .border(width = 4.dp, color = Color(0xFFE3074A)) // Borde rojo intenso (#E3074A)
        ) {
            Hackeo("ESTABLISHING CONNECTION", 0.6f)
            Hackeo("UPLOADING DATA", 0.3f)
            Hackeo("FINALIZING", 0.1f)
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(
    showBackground = true,
    widthDp = 800,
    heightDp = 800
)
@Composable
fun PreviewTiming() {
    SistemaTiming()
}
