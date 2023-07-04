package com.inhatc.inflearn_kindjetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.inhatc.inflearn_kindjetpack.compose.ui.theme.Inflearn_KindJetPackTheme

class EditTextActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Inflearn_KindJetPackTheme {

                val (text, setValue) = remember{
                    mutableStateOf("")
                }



                    Column(modifier = Modifier
                        .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        Button(onClick = { /*TODO*/ }) {
                            Text("클릭!!")
                        }
                    }

            }
        }
    }
}

