package com.inhatc.inflearn_kindjetpack.workManager.manager

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date

class UniqueWorkManager(context: Context, workerParameters: WorkerParameters):
    CoroutineWorker(context, workerParameters) {


    override suspend fun doWork(): Result {

        Log.d("UniqueWorkManager", "doWork")

        for (i in 1..3){
            Log.d("UniqueWorkManager", i.toString())
        }

        Log.d("UniqueWorkManager", "endWork")


        return Result.success()
    }
}