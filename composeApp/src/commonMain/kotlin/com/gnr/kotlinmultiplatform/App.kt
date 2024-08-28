package com.gnr.kotlinmultiplatform

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.SlideTransition
import com.gnr.kotlinmultiplatform.BottomBar.BottomBarScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(screen = MainScreen()){navigator: Navigator ->
            SlideTransition(navigator)
        }
    }
}

class MainScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navigator.push(SecondScreen())
            }) {
                Text("Navegación básica", fontSize = 24.sp, color = Color.White)
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = {
                navigator.push(BottomBarScreen())
            }) {
                Text("Bottombar", fontSize = 24.sp, color = Color.White)
            }
        }
    }
}

class SecondScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
            //CenterToAll
        ) {
            //MejorarDiseño
            Spacer(Modifier.height(16.dp))
            Text("SECOND SCREEN", fontSize = 32.sp, color = Color.White)
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navigator.pop() }) { Text("Back") }
        }
    }

}







