package com.example.pantallas_alien.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.pantallas_alien.moleculas.pantalla_verde.Header
import com.example.pantallas_alien.moleculas.pantalla_verde.MoleculeMessage
import com.example.pantallas_alien.moleculas.pantalla_verde.MoleculePanel
import com.example.pantallas_alien.moleculas.pantalla_verde.MoleculeSectionTitle

@Composable
fun MoleculesShowcaseScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFF))
            .padding(16.dp),
    ) {
        // MoleculeHeader
        Header("PERSONAL TERMINAL")

        // MoleculeSectionTitle
        MoleculeSectionTitle("FOLDERS")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)

        ) {
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .fillMaxHeight(.2f)
                    .background(Color(0xFF002600))

            ) {
                // MoleculePanel
                MoleculePanel {
                    Text("PERSONAL", color = Color(0xFF12BA6D), fontSize = 28.sp)
                }
                MoleculePanel {
                    Text("", color = Color.White, fontSize = 14.sp)
                }
                MoleculePanel {
                    Text("", color = Color.White, fontSize = 14.sp)
                }

            }

            Spacer(modifier = Modifier.width(100.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color(0xFF002600))

            ) {
                // MoleculeMessage
                MoleculeMessage(
                    title = "JUST MISSED YOU",
                    body = """
                Verlaine, you on the lookout for a navigational officer? I have a friend that’s just lost his ship and he’s looking for work. I can vouch for him, he’s got good papers.

                Same old story – the megacorps undercut him, picked up all his clients. Contracts are getting harder to come by for the smaller companies and I’m thinking of getting out myself while I still have something to sell. Sounds like you’re doing okay though. Dropped by the docks and heard you just shipped out. Sevastopol station – what a shithole. Still, I hear Weyland-Yutani pay well.

                Good luck to you – If you can’t beat them, right? Let’s catch up when you get back.

                Blane.
            """.trimIndent()
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF001A00,
    widthDp = 800,
    heightDp = 800
)
@Composable
fun PreviewMoleculesShowcaseScreen() {
    MoleculesShowcaseScreen()
}


