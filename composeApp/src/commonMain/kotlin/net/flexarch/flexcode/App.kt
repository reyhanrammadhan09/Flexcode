package net.flexarch.flexcode

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview

import net.flexarch.flexcode.theme.backgroudColor

@Composable
@Preview
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = backgroudColor))
    )
    {

    }
}