package com.gnr.kotlinmultiplatform

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.gnr.kotlinmultiplatform.mainScreen.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(screen = MainScreen()){ navigator: Navigator ->
            SlideTransition(navigator)
        }
    }
}











