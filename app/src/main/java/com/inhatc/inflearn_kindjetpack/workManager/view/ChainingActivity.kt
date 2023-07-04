package com.inhatc.inflearn_kindjetpack.workManager.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerC
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerD
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerE

class ChainingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chaining)

        val workManagerC = OneTimeWorkRequestBuilder<WorkManagerC>().build()
        val workManagerD = OneTimeWorkRequestBuilder<WorkManagerD>().build()
        val workManagerE = OneTimeWorkRequestBuilder<WorkManagerE>().build()

        WorkManager.getInstance(this)
            .beginWith(listOf(workManagerC, workManagerD))
            .then(workManagerE)
            .enqueue()

    }
}