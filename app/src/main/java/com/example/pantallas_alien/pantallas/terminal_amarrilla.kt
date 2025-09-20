package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        // Header
        Header(
        text = "            CTRL COMUNICACIONES",
            backgroundColor = Color.Black, // Fondo amarillo
            textColor = Color.Yellow         // Texto negro
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
                    .fillMaxHeight(.5f)

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
            Spacer(modifier = Modifier.height(24.dp))

            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.width(50.dp))

            Column(
                modifier = Modifier
                    .width(350.dp)
                    .fillMaxHeight(.5f)

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
            modifier = Modifier.fillMaxWidth()
        )
    }

}

fun column(function: () -> Unit) {

}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF001A00,
    widthDp = 800,
    heightDp = 800
)
@Composable
fun PreviewSystemControlScreen() {
    SystemControlScreen()
}

