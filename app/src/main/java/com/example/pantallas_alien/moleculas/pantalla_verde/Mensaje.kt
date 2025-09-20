package com.example.pantallas_alien.moleculas.pantalla_verde

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoleculeMessage(
    title: String,
    body: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFF002600))
            .border(width = 2.dp, color = Color(0xFF12BA6D))
            .padding(8.dp)
    ) {
        Text(
            text = title,
            color = Color.White,
            fontSize = 36.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(
                text = body,
                color = Color.White,
                fontSize = 18.sp,
                lineHeight = 36.sp
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF001A00)
@Composable
fun PreviewMoleculeMessage() {
    MoleculeMessage(
        title = "JUST MISSED YOU",
        body = """
            Verlaine, you on the lookout for a navigational officer? I have a friend that’s just lost his ship and he’s looking for work. Same old story - the megacorps undercut him...
        """.trimIndent()
    )
}
