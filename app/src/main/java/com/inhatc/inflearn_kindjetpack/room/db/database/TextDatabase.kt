package com.inhatc.inflearn_kindjetpack.room.db.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.inhatc.inflearn_kindjetpack.room.db.dao.TextDAO
import com.inhatc.inflearn_kindjetpack.room.db.dao.WordDAO
import com.inhatc.inflearn_kindjetpack.room.db.entity.TextEntity
import com.inhatc.inflearn_kindjetpack.room.db.entity.WordEntity

@Database(entities = [TextEntity::class, WordEntity::class], version = 2)
abstract class TextDatabase : RoomDatabase() {

    abstract fun textDao() : TextDAO
    abstract fun wordDao() : WordDAO

    companion object {
        @Volatile
        private var INSTANCE : TextDatabase? = null

        fun getDatabase(
            context : Context
        ) : TextDatabase {
            return INSTANCE ?:synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TextDatabase::class.java,
                    "text_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }

    }

}