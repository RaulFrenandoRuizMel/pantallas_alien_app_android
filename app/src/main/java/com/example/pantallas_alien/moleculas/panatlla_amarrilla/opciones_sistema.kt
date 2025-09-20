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
fun SistemasActivar(
    title: String,
    value: Int,
    status: String? = null, // "ACTIVO", "INACTIVO" o null
    modifier: Modifier = Modifier,
    titleColor: Color = Color(0xFFFFFF00), // amarillo retro
    numberColor: Color = Color.White,
    statusActiveColor: Color = Color.White,
    statusInactiveColor: Color = Color(0xFFFFFF00),
    backgroundColor: Color = Color.Black
) {
    Column(modifier = modifier.padding(8.dp)) {
        // Contenedor del título
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor)
                .border(2.dp, titleColor)
                .padding(8.dp)
        ) {
            Text(
                text = title,
                color = titleColor,
                fontSize = 28.sp
            )
        }
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            // Contenedor del número
            Column(
                modifier = Modifier
                    .background(backgroundColor)
                    .fillMaxWidth(.2f)
            ) {
                Text(
                    text = value.toString(),
                    color = Color.Yellow,
                    fontSize = 24.sp
                )
            }
            Spacer(modifier = Modifier.weight(1f))

            // Contenedor del estado
            status?.let {
                Column(
                    modifier = Modifier
                        .background(backgroundColor)
                        .border(
                            2.dp,
                            if (it == "ACTIVO") statusActiveColor else statusInactiveColor
                        )
                        .fillMaxWidth(.7f)
                        .padding(8.dp)
                        .padding(top = 4.dp)
                ) {
                    Text(
                        text = it,
                        color = if (it == "ACTIVO") statusActiveColor else statusInactiveColor,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun SistemasActivarPreview() {
    Column(modifier = Modifier.padding(16.dp)) {
        SistemasActivar(title = "Motor Principal", value = 85, status = "ACTIVO")

    }
}
