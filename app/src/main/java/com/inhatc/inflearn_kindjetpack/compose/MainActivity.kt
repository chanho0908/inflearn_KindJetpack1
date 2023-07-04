package com.inhatc.inflearn_kindjetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.inhatc.inflearn_kindjetpack.compose.ui.theme.Inflearn_KindJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Inflearn_KindJetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Blue)
                        .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                        Text("Hello")
                        Spacer(Modifier.width(16.dp))
                        Text("World")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String){
    Text(text = "Hello $name")
}

@Preview
@Composable
fun DefaultPreview(){
    Inflearn_KindJetPackTheme{
        Greeting("찬호")
    }
}
