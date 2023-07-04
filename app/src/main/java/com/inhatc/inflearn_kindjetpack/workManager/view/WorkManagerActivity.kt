package com.inhatc.inflearn_kindjetpack.workManager.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManager2
import com.inhatc.inflearn_kindjetpack.workManager.manager.WorkManagerB

// WorkManager -> Background 작업을 하는데 유용!

//https://developer.android.com.topic/libraries/architecture/workmanager
// https://developer.android.com/codelabs/android-workmanager#0

class WorkManagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)

        //val workManagerA = OneTimeWorkRequestBuilder<WorkManagerA>().build()
        //WorkManager.getInstance(this).enqueue(workManagerA)

        val data: Data = workDataOf(
            "a" to 10,
            "b" to 20
        )

        val workManagerB = OneTimeWorkRequestBuilder<WorkManagerB>()
            .setInputData(data).build()
        WorkManager.getInstance(this).enqueue(workManagerB)

        WorkManager.getInstance(this).getWorkInfoByIdLiveData(workManagerB.id)
            .observe(this){
                if (it != null && it.state.isFinished){
                    val result = it.outputData.getInt("result", 10000)
                    Log.d("WorkManagerActivity", result.toString())
                }
            }

        //=================================================================================

        val workManager2 = OneTimeWorkRequestBuilder<WorkManager2>().build()
        WorkManager.getInstance(this).enqueue(workManager2)
    }
}
