package com.gnr.kotlinmultiplatform.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.kotlinmultiplatform.BottomBar.BottomBarScreen
import com.gnr.kotlinmultiplatform.secondScreen.SecondScreen
import com.gnr.kotlinmultiplatform.settings.ProfileScreen

class MainScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.weight(0.2f))
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
            Spacer(Modifier.height(16.dp))
            Button(onClick = {
                navigator.push(ProfileScreen())
            }) {
                Text("Navegación con persistencia", fontSize = 22.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}