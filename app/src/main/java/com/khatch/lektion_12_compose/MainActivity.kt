package com.khatch.lektion_12_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.khatch.lektion_12_compose.ui.theme.Lektion_12_ComposeTheme
import java.security.AllPermission

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lektion_12_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // TODO - UI
                    usernameInput()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(name)
}

// @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lektion_12_ComposeTheme {
        /*
        Greeting(name = "Hello world")
        Image(
            painterResource(R.drawable.ic_launcher_background),
            "Desc",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
        )
        Greeting(name = "Hejsan Världen")
        */

        Row(verticalAlignment = Alignment.CenterVertically
            ) {
            Image(
                painterResource(R.drawable.ic_launcher_background),
                "",
                Modifier
                    .background(Color.Gray)
                    .padding(5.dp)
                    .size(75.dp)
                    .clip(CircleShape)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Greeting("Hello")
                Greeting("Short Description")
            }
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Name: ")})
        }
        //Greeting(name = "Jesus")
    }
}

@Preview
@Composable
fun usernameInput() {
    Column {
        Text(text = "Hello!",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.body1 /* HERE must be .bodyMedium*/
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Name")})
    }
    
}