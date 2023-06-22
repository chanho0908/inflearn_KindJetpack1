package com.inhatc.inflearn_kindjetpack.room.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.inhatc.inflearn_kindjetpack.room.db.entity.TextEntity

@Dao
interface TextDAO {

    @Query("SELECT * FROM TEXT_TABLE")
    fun getAllData(): List<TextEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(text: TextEntity)

    @Query("DELETE FROM TEXT_TABLE")
    fun deleteAllData()
}