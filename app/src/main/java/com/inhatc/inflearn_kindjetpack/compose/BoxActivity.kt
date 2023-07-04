package com.inhatc.inflearn_kindjetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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

// Box : 겹침이 허용되는 FrameLayout 같은 것
class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .background(color = Color.Green)
                .fillMaxWidth() // 가로 길이에 꽉참
                .height(200.dp)
                //.fillMaxHeight() // 세로 길이에 꽉참
                //.fillMaxSize(), // 전체 꽉참
                //contentAlignment = Alignment.TopStart
            ) {
                Text("Hello")
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomEnd
                    ) {
                    Text("Hello222222")
                }

            }
        }
    }
}
