package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlienTerminalScreen(modificador: Modifier = Modifier) {

    Column(
        modifier = modificador
            .fillMaxWidth()
            .background(Color(0xFF142F18))
    ) {
        Text(
            text = "PERSONAL TERMINAL",
            modifier = modificador
                .fillMaxWidth()
                .background(Color(0xFF12BA6D))
        )

        // 👇 Este bloque es un Column independiente
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "FOLDERS",
                modifier = modificador
                    .fillMaxWidth()
                    .background(Color(0xFF142F18)),
                color = Color(0xFF12BA6D)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            // Panel izquierdo (folders)
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .fillMaxHeight(.2f)
                    .background(Color(0xFF002600))
                    .border(
                        width = 3.dp,
                        color = Color(0xFF12BA6D), // Verde neón estilo Alien Isolation
                    )
                    .padding(8.dp)
            ) {
                Text(
                    text = "PERSONAL",
                    color = Color(0xFFFFFFFF),
                    fontSize = 14.sp,
                )
            }

            // Panel derecho (contenido)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(.5f)
                    .padding(8.dp)
                    .border(
                        width = 3.dp,
                        color = Color(0xFF12BA6D), // Verde neón estilo Alien Isolation
                    )
            ) {

                // Título
                Text(
                    text = "JUST MISSED YOU",
                    color = Color(0xFFFFFFFF),
                    fontSize = 18.sp,
                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = """
                            Verlaine, you on the lookout for a navigational officer? 
                            I have a friend that’s just lost his ship and he’s looking for work. 
                            I can vouch for him, he’s got good papers.

                            Same old story - the megacorps undercut him, picked up all his clients. 
                            Contracts are getting harder to come by for the smaller companies...
                        """.trimIndent(),
                        color = Color(0xFFFFFFFF),
                        fontSize = 14.sp,
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}
@Preview(
    showBackground = true,
    backgroundColor = 0xFF001A00, // igual que el fondo de la UI
    widthDp = 360,
    heightDp = 800
)
@Composable
fun AlienTerminalPreview() {
    AlienTerminalScreen()
}