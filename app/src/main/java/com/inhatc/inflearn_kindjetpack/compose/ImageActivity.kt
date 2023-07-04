package com.inhatc.inflearn_kindjetpack.compose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.compose.ui.theme.Inflearn_KindJetPackTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Inflearn_KindJetPackTheme {
                var isFavorite by rememberSaveable {
                    mutableStateOf(false)
                }

                ImageCard(modifier = Modifier
                    .fillMaxWidth(0.5f) // 비율 -> 절반!
                    .padding(16.dp),
                    isFavorite = isFavorite)
                {
                    isFavorite = it
                }
            }
        }
    }
}

@Composable
fun ImageCard(
    modifier: Modifier = Modifier, // modifier를 외부에서 전달 받음
    isFavorite: Boolean,
    onTabFavorite: (Boolean) -> Unit, // 반환 값이 없는 형태
){

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),

    ) {
        Box(modifier = Modifier.height(200.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.main_image),
                contentDescription = "poster",
                contentScale = ContentScale.Crop // CenterCrop

            )

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopEnd
                ) {
                IconButton(onClick = {
                    onTabFavorite(!isFavorite)
                }) {
                    Icon(
                        imageVector = if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = "favorite",
                        tint = Color.Red
                        )
                }
            }
        }
    }
}


