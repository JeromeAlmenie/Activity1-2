package com.example.jeromebsit21m1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.jeromebsit21m1.ui.theme.JeromeBSIT21M1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             //Act1()
             Act2()

        }
    }
}
@Composable
fun Act1()
{
    Column {
        Image(
            painter = painterResource(id = R.drawable.act1 ),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on android with less code, powerful tools, and intuitive Kotlin APIs.  In this Tutorial, you build a simple UI component with declarative functions. you call Compose functions to say what elements you want and these compose function say what elements you want and the Compose Compiler does the rest. Compose is built around Composable Functions. these functions let you define your app's Ui programmatically becasue they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable Function, you add the @Composable annotation to the function name.",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(20.dp)
        )


    }
}
@Composable
fun Act2()
{
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.act2),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(700.dp)
        )
        Text(
            text ="ALL TASK COMPLETED",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 13.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 8.dp)
        )
        Text(
            text = "NICE WORK!",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 15.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Act1()
}

