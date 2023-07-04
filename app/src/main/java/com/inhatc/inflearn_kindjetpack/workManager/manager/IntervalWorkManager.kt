package com.inhatc.inflearn_kindjetpack.workManager.manager

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date

class IntervalWorkManager(context: Context, workerParameters: WorkerParameters):
    CoroutineWorker(context, workerParameters) {

    companion object{
        const val HowMuch = "progress"
    }

    override suspend fun doWork(): Result {

        Log.d("IntervalWorkManager", "doWork")

        val format = SimpleDateFormat("hh:mm:ss")
        val currentTime = format.format(Date())

        Log.d("IntervalWorkManager", currentTime)

        return Result.success()
    }
}