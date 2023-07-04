package com.inhatc.inflearn_kindjetpack.workManager.manager

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

class WorkManager1(context: Context, workerParameters: WorkerParameters): CoroutineWorker(context, workerParameters) {
    override suspend fun doWork(): Result {


        return Result.success()
    }

}