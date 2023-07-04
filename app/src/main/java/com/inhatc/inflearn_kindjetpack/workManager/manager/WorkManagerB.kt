package com.inhatc.inflearn_kindjetpack.workManager.manager

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class WorkManagerB(context: Context, workerParameters: WorkerParameters):
    Worker(context, workerParameters) {
    override fun doWork(): Result {

        val a = inputData.getInt("a", 10000)
        val b = inputData.getInt("b", 2000)
        val c = inputData.getInt("b", 3000)

        Log.d("workManagerB", a.toString())
        Log.d("workManagerB", b.toString())
        Log.d("workManagerB", c.toString())

        val output: Data = workDataOf(
            "result" to 10
        )

        return Result.success()
    }
}