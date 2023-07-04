package com.inhatc.inflearn_kindjetpack.workManager.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerTest
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerTest.Companion.HowMuch

class ProgressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        val worker = OneTimeWorkRequestBuilder<WorkManagerTest>().build()
        WorkManager.getInstance(this).enqueue(worker)

        WorkManager.getInstance(this)
            .getWorkInfoByIdLiveData(worker.id)
            .observe(this){ workInfo : WorkInfo? ->
                val progress = workInfo?.progress
                val value = progress?.getInt(HowMuch, 0)
                if (value !=0){
                    Log.d("progressActivity", value.toString())
                }
            }
    }
}