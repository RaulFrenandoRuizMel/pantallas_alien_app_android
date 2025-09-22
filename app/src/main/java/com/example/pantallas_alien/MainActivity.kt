package com.example.pantallas_alien

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.pantallas_alien.pantallas.MoleculesShowcaseScreen
import com.example.pantallas_alien.pantallas.SistemaTiming
import com.example.pantallas_alien.pantallas.SystemControlScreen
import com.example.pantallas_alien.ui.theme.Pantallas_alienTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pantallas_alienTheme {
                MoleculesShowcaseScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla() {
    Pantallas_alienTheme {
        MoleculesShowcaseScreen()
    }
}
