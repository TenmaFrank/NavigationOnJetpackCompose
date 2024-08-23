package com.example.navigationcompose.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleView(name: String){
    Text(text = name, fontSize = 40.sp, color = Color.Black,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        maxLines = 1,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun Space(){
    Spacer (modifier = Modifier.height(10.dp))
}

@Composable
fun MainButton (name: String, backcolor: Color, color: Color, onClick:() -> Unit) {
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        contentColor = color,
        backgroundColor = backcolor
    )) {
        Text(text = name)
    }
}