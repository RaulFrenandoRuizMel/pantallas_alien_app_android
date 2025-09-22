package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pantallas_alien.moleculas.panatlla_amarrilla.PotenciaYRed
import com.example.pantallas_alien.moleculas.panatlla_amarrilla.SistemasActivar
import com.example.pantallas_alien.moleculas.pantalla_verde.Header

@Composable
fun SystemControlScreen() {
    Column(
        modifier = Modifier
            .background(Color(0xFF0A0D26))  // Fondo general
            .padding(16.dp)
            .widthIn(max = 800.dp)
            .heightIn(max = 800.dp)
    ) {
        // Header con colores personalizados
        Header(
            text = "            CTRL COMUNICACIONES",
            backgroundColor = Color(0xFFE3074A), // Margen destacado
            textColor = Color(0xFFFCD079)        // Texto color
        )

        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .width(350.dp)
                    .fillMaxHeight(0.5f)
            ) {
                SistemasActivar(
                    title = "SEÑAL DE LA CÁMARA",
                    value = 1,
                    status = "INACTIVO",
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                SistemasActivar(
                    title = "PURIFICACIÓN DEL AIRE",
                    value = 3,
                    status = "ACTIVO",
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.width(50.dp))

            Column(
                modifier = Modifier
                    .width(350.dp)
                    .fillMaxHeight(0.5f)
            ) {
                SistemasActivar(
                    title = "SISTEMA DE ACCESO",
                    value = 2,
                    status = "ACTIVO",
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                SistemasActivar(
                    title = "MONITOREO LOCAL",
                    value = 4,
                    status = "INACTIVO",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        PotenciaYRed(
            leftLabel = "POTENCIA DISPONIBLE",
            leftValue = "4",
            rightLabel = "USO DE LA RED",
            rightValue = "2/6",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF945406))  // Aplico fondo al contenedor
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 800,
    heightDp = 800
)
@Composable
fun PreviewSystemControlScreen() {
    SystemControlScreen()
}
