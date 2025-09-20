package com.example.pantallas_alien.moleculas.pantalla_atinar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
fun Hackeo(label: String, progress: Float, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(vertical = 4.dp)
    ) {
        Text(

            text = label,
            color = Color.White,
            fontSize = 24.sp)
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(24.dp)
                .background(Color(0xFF00b4d8))
                .border(width = 4.dp, color = Color.White)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center

            ) {
                Box(
                    modifier = Modifier

                        .fillMaxWidth(progress)
                        .height(24.dp)
                        .background(Color.Cyan)
                )
            }
        }
    }
}
        @Preview(showBackground = true, backgroundColor = 0xFF000000, widthDp = 200)
        @Composable
        fun Hackeo() {
            Column(modifier = Modifier.padding(8.dp)) {
                Hackeo("ESTABLISHING CONNECTION", 0.6f)
                Hackeo("UPLOADING DATA", 0.3f)
                Hackeo("FINALIZING", 0.1f)
            }
        }