package com.example.actorg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actorg.ui.theme.ActorgTheme
import kotlinx.coroutines.CoroutineScope
import org.intellij.lang.annotations.JdkConstants

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActorgTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyScaffold()
                }
            }
        }
    }
}
@ExperimentalFoundationApi
@Composable
fun MyScaffold(){
    val scaffoldState : ScaffoldState = rememberScaffoldState()
    val scope: CoroutineScope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        contentColor = colorResource(id = R.color.purple_200),
        content = { Navigation() },
//        topBar = { MyTopBar(scaffoldState = scaffoldState, scope = scope) },
        drawerContent = { MyColumn() },
        backgroundColor = MaterialTheme.colors.background
    )
}
@Composable
fun MyColumn() {
    val elementList = listOf("sreyas", "amal", "indrajith")
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        elementList.forEach{ text ->
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = text,
                    fontSize = 22.sp
                )
            }
        }
    }
}
@ExperimentalFoundationApi
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ActorgTheme {
        Column(
            Modifier
                .fillMaxWidth(),
                Arrangement.Center
        ) {
            MyScaffold()
        }
    }
}
