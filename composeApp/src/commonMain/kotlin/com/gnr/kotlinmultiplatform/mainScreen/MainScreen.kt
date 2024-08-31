package com.gnr.kotlinmultiplatform.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.kotlinmultiplatform.BottomBar.BottomBarScreen
import com.gnr.kotlinmultiplatform.apis.LoadScreen
import com.gnr.kotlinmultiplatform.network.NetworkUtils
import com.gnr.kotlinmultiplatform.network.NetworkUtils.httpClient
import com.gnr.kotlinmultiplatform.secondScreen.SecondScreen
import com.gnr.kotlinmultiplatform.settings.ProfileScreen
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MainScreen : Screen {

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.weight(0.2f))
            Button(onClick = {
                navigator.push(SecondScreen())
            }) {
                Text("Navegación básica")
            }
            Spacer(Modifier.height(8.dp))
            Button(onClick = {
                navigator.push(BottomBarScreen())
            }) {
                Text("Bottombar")
            }
            Spacer(Modifier.height(8.dp))
            Button(onClick = {
                navigator.push(ProfileScreen())
            }) {
                Text("Navegación con persistencia")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                navigator.push(LoadScreen())
            }) {
                Text("Buscar super heroe")
            }
            Spacer(modifier = Modifier.weight(1f))

        }
    }
}






