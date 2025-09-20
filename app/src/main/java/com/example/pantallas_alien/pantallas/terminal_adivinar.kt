package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import com.example.pantallas_alien.moleculas.pantalla_atinar.Hackeo
import com.example.pantallas_alien.moleculas.pantalla_verde.Header

@Composable
fun SistemaTiming() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00b4d8))
            .padding(16.dp)
    ) {
        // Header
        Header(
            text = "                    CONTROL DE SISTEMAS",
            backgroundColor = Color(0xFF00b4d8),
            textColor = Color.White
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF))
                .padding(16.dp)
                .border(width = 4.dp, color = Color.White)
        ){
            Hackeo("ESTABLISHING CONNECTION", 0.6f)
            Hackeo("UPLOADING DATA", 0.3f)
            Hackeo("FINALIZING", 0.1f)
        }
        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(8.dp))


    }

}

fun column() {
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF00b4d8,
    widthDp = 800,
    heightDp = 800
)
@Composable
fun PreviewTiming() {
    SistemaTiming()
}

