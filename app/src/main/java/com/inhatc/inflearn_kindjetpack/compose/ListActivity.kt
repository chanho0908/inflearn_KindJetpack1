package com.inhatc.inflearn_kindjetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.inhatc.inflearn_kindjetpack.compose.ui.theme.Inflearn_KindJetPackTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState() // 스크롤 정보 저장

//            Column(modifier = Modifier
//                .background(color = Color.Green)
//                .fillMaxWidth()
//                .verticalScroll(scrollState)
//            ) {
//                for (i in 1..50){
//                    Text("글씨 $i")
//                }
//            }
            LazyColumn(modifier = Modifier
                .background(color = Color.Green)
                .fillMaxWidth(),
                contentPadding = PaddingValues(15.dp), // 전체 패딩
                verticalArrangement = Arrangement.spacedBy(24.dp) // 아이템 간의 간격
            ) {
                item {
                    Text(text = "헤더")
                }

                items(50){
                    Text("글씨 $it")

                }

                item {
                    Text(text = "바텀")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Inflearn_KindJetPackTheme {
        Greeting2("Android")
    }
}