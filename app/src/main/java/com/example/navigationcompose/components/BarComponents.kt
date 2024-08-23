package com.example.navigationcompose.components

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.White,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        maxLines = 1)
}

@Composable
fun ActionButton(){
    FloatingActionButton(
        onClick = { /*TODO*/ },
        contentColor = Color.White,
        backgroundColor = Color.Red
    ) {
    Icon(imageVector = Icons.Default.Add,
        contentDescription = "agregar" )
    }
}

@Composable
fun  MainIconButton(icon: ImageVector, onClickAction: () -> Unit){
    IconButton(onClick = { onClickAction}) {
        Icon(imageVector = icon, contentDescription = null, tint = Color.White)
    }
}
//material 2 top app bar
/*
val appBarHorizontalPadding = 4.dp
val titleIconModifier = Modifier.fillMaxHeight()
    .width(72.dp - appBarHorizontalPadding)

TopAppBar(
    backgroundColor = Color.Transparent,
    elevation = 0.dp,
    modifier= Modifier.fillMaxWidth()) {

    //TopAppBar Content
    Box(Modifier.height(32.dp)) {

        //Navigation Icon
        Row(titleIconModifier, verticalAlignment = Alignment.CenterVertically) {
            CompositionLocalProvider(
                LocalContentAlpha provides ContentAlpha.high,
            ) {
                IconButton(
                    onClick = { },
                    enabled = true,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add_24px),
                        contentDescription = "Back",
                    )
                }
            }
        }

        //Title
        Row(Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically) {

            ProvideTextStyle(value = MaterialTheme.typography.h6) {
                CompositionLocalProvider(
                    LocalContentAlpha provides ContentAlpha.high,
                ){
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        text = "Hello"
                    )
                }
            }
        }

        //actions
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Row(
                Modifier.fillMaxHeight(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                content = actions
            )
        }
    }
}
 */