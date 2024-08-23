package com.example.navigationcompose.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navigationcompose.components.MainButton
import com.example.navigationcompose.components.MainIconButton
import com.example.navigationcompose.components.Space
import com.example.navigationcompose.components.TitleBar
import com.example.navigationcompose.components.TitleView

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailView(navController: NavController, id: Int, opcional: String?,){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TitleBar(name = "Detail View") },
                backgroundColor =  Color.Blue,
                navigationIcon = {
                    MainIconButton(icon = Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                })
            }
    ) {
    ContentDetailView(navController, id, opcional)
    }
}

@Composable
fun ContentDetailView(navController: NavController, id: Int, opcional: String?){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally) {
        TitleView(name = "Detail View")
        Space()
        TitleView(name = id.toString())
        Space()
        opcional?.let {  TitleView(name = it) }
        MainButton(name = "return home", backcolor = Color.Blue, color = Color.White ) {
            navController.popBackStack()
        }
    }
}