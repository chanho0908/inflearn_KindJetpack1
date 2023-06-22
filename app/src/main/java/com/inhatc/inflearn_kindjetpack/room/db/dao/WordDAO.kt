package com.inhatc.inflearn_kindjetpack.room.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.inhatc.inflearn_kindjetpack.room.db.entity.TextEntity
import com.inhatc.inflearn_kindjetpack.room.db.entity.WordEntity

@Dao
interface WordDAO {

    @Query("SELECT * FROM word_table")
    fun getAllData(): List<WordEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(text: WordEntity)

    @Query("DELETE FROM TEXT_TABLE")
    fun deleteAllData()
}