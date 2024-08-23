package com.example.navigationcompose.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navigationcompose.components.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar(backgroundColor = Color.Red) {
                Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                    ProvideTextStyle(value = MaterialTheme.typography.h6) {
                        CompositionLocalProvider(
                            LocalContentAlpha provides ContentAlpha.high,
                        ){
                            TitleBar(name = "Homeview")
                        }
                    }
                }
            }
        },
        floatingActionButton = {
        ActionButton()
        }
    ) {
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(navController: NavController){
    val id = 123
    var opcional  by remember  {
        mutableStateOf("")
    }
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally) {
        TitleView(name = "Home View")
        Space()
        TextField(value = opcional,
            onValueChange = {opcional = it},
            label = { Text(text = "opcional")} )
        Text(text = opcional)
        MainButton(name = "detail view", backcolor = Color.Red, color = Color.White ) {
            navController.navigate("Detail/${id}/?${opcional}")
        }
    }
}