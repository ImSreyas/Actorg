package com.example.actorg.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.actorg.Screen


@ExperimentalFoundationApi
@Composable
fun MainScreen(navController: NavController) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        content = {
            items(50) { i ->
                Button(
                    onClick = {
                        navController.navigate(Screen.NoteScreen.route)
                    },
                    modifier = Modifier
                        .padding(13.dp)
                        .clip(RoundedCornerShape(35.dp)),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colors.primary)

                ) {
//                    var x = 200.dp
//                    if(i % 3 == 0){
//                         x = 300.dp
//                    }
                    Box(
                        modifier = Modifier
                            .aspectRatio(.9f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "$i", color = MaterialTheme.colors.background)
                    }
                }
            }
        },
        modifier = Modifier
            .padding(horizontal = 10.dp)
    )
}
