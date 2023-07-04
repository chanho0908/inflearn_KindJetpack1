package com.inhatc.inflearn_kindjetpack.workManager.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.workManager.manager.IntervalWorkManager
import com.inhatc.inflearn_kindjetpack.workManager.manager.UniqueWorkManager
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerTest
import java.util.concurrent.TimeUnit

class IntervalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interval)

        val worker = PeriodicWorkRequestBuilder<IntervalWorkManager>(15, TimeUnit.MINUTES).build()
        WorkManager.getInstance(this).enqueue(worker)

        val button = findViewById<Button>(R.id.Btn)

        button.setOnClickListener {
            val worker = OneTimeWorkRequestBuilder<UniqueWorkManager>().build()
            WorkManager.getInstance(this)
                .enqueueUniqueWork("test", ExistingWorkPolicy.KEEP, worker)

        }

    }
}