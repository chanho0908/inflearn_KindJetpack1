package com.inhatc.inflearn_kindjetpack.workManager.manager

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay

class WorkManagerTest(context: Context, workerParameters: WorkerParameters): CoroutineWorker(context, workerParameters) {

    companion object{
        const val HowMuch = "progress"
    }

    override suspend fun doWork(): Result {

        for (i in 1..10){

            val result = workDataOf(HowMuch to i*10)

            setProgress(result)

            delay(1000)
        }


        return Result.success()
    }
}