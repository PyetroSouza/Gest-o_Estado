package com.example.gesto_estado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.gesto_estado.juros.JurosScreen
import com.example.gesto_estado.juros.JurosScreenViewModel
import com.example.gesto_estado.ui.theme.GestãoestadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestãoestadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JurosScreen(
                        modifier = Modifier.padding(innerPadding),
                        jurosScreenViewModel = JurosScreenViewModel()
                    )
                }
            }
        }
    }
}