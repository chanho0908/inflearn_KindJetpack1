package com.inhatc.inflearn_kindjetpack.retrofit.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.inhatc.inflearn_kindjetpack.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CourtinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courtines)

        val goToSecond = findViewById<Button>(R.id.goToSecond)

        goToSecond.setOnClickListener {
            startActivity(Intent(this, CorutineActivity2::class.java))
        }

    }

    suspend fun a(){

    }

    suspend fun b(){

    }
}