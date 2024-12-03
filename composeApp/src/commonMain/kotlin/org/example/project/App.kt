package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import moe.tlaster.precompose.PreComposeApp

@Composable
@Preview
fun App() {
    PreComposeApp {

        val colors = getColorsTheme()

        AppTheme {
            Column(Modifier.fillMaxWidth()) {
                Text("Bem vindo", color = colors.textColor)
                Text("Kotlin Multiplataforma con compose")
                Text("Kotlin Multiplataforma con compose")
                Text("Kotlin Multiplataforma con compose asdasd")
            }
        }

    }
}

