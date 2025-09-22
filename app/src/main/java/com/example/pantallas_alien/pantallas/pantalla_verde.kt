package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Header modificado para recibir colores
@Composable
fun Header(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    backgroundColor: Color = Color.Transparent
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(12.dp)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

// MoleculeSectionTitle modificado para recibir color texto
@Composable
fun MoleculeSectionTitle(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    Text(
        text = text,
        color = textColor,
        fontSize = 20.sp,
        modifier = modifier.padding(vertical = 8.dp)
    )
}

// MoleculePanel modificado para fondo y texto configurable
@Composable
fun MoleculePanel(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .padding(12.dp)
            .fillMaxWidth()
    ) {
        content()
    }
}

// MoleculeMessage modificado para texto y fondo configurable
@Composable
fun MoleculeMessage(
    title: String,
    body: String,
    modifier: Modifier = Modifier,
    titleColor: Color = Color.White,
    bodyColor: Color = Color.White,
    backgroundColor: Color = Color.Transparent
) {
    Column(
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(text = title, fontSize = 22.sp, color = titleColor)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = body, fontSize = 14.sp, color = bodyColor)
    }
}

// Pantalla con colores personalizados aplicados correctamente
@Composable
fun MoleculesShowcaseScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0A0D26))
            .padding(16.dp)
    ) {
        // Header con colores
        Header(
            text = "PERSONAL TERMINAL",
            textColor = Color(0xFFFCD079),
            backgroundColor = Color(0xFFE3074A)
        )

        // Título sección con color texto
        MoleculeSectionTitle(
            text = "FOLDERS",
            textColor = Color(0xFFFCD079)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .fillMaxHeight(0.2f)
                    .background(Color(0xFFE3074A))
            ) {
                MoleculePanel(
                    backgroundColor = Color(0xFFE3074A)
                ) {
                    Text("PERSONAL", color = Color(0xFFFCD079), fontSize = 28.sp)
                }
                MoleculePanel(
                    backgroundColor = Color(0xFFE3074A)
                ) {
                    Text("", color = Color(0xFFFCD079), fontSize = 14.sp)
                }
                MoleculePanel(
                    backgroundColor = Color(0xFFE3074A)
                ) {
                    Text("", color = Color(0xFFFCD079), fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.width(100.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color(0xFF945406))
            ) {
                MoleculeMessage(
                    title = "JUST MISSED YOU",
                    body = """
                        Verlaine, you on the lookout for a navigational officer? I have a friend that’s just lost his ship and he’s looking for work. I can vouch for him, he’s got good papers.

                        Same old story – the megacorps undercut him, picked up all his clients. Contracts are getting harder to come by for the smaller companies and I’m thinking of getting out myself while I still have something to sell. Sounds like you’re doing okay though. Dropped by the docks and heard you just shipped out. Sevastopol station – what a shithole. Still, I hear Weyland-Yutani pay well.

                        Good luck to you – If you can’t beat them, right? Let’s catch up when you get back.

                        Blane.
                    """.trimIndent(),
                    titleColor = Color(0xFFFCD079),
                    bodyColor = Color(0xFFFCD079),
                    backgroundColor = Color(0xFF945406)
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 800, heightDp = 800)
@Composable
fun PreviewMoleculesShowcaseScreen() {
    MoleculesShowcaseScreen()
}
