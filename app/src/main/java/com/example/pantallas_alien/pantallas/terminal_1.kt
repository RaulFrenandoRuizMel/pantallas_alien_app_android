package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaAlien(modificador: Modifier = Modifier){

    Column(modifier = modificador
        .fillMaxWidth()
        .background(
            Color(0xFF142F18)
        )) {
        // Text("Spoiler alert: ${numero_aleatorio}")
        Text(
            text = "PERSONAL TERMINAL",
            modifier = modificador
                .fillMaxWidth()
                .background(Color(0xFF12BA6D))
        )

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "FOLDERS",
                modifier = modificador
                    .fillMaxWidth()
                    .background(Color(0xFF142F18)),
                color = Color(0xFF12BA6D)
            )
        }
        Column (modifier = modificador
            .fillMaxWidth(.50f)
            .background(Color(0xFF12BA6D)
            )){
            Text(
                text = "PERSONAL TERMINAL",
                modifier = modificador
                    .fillMaxWidth()
                    .background(Color(0xFF12BA6D))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrevistaDeJuego(){
    PantallaAlien()
}