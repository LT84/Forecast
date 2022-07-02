package com.project.data.storage.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.project.data.storage.room.dao.WeatherDao
import com.project.data.storage.room.models.WeatherModelForDb

@Database(
    entities = [WeatherModelForDb::class], version = 1
)
abstract class AppDataBase : RoomDatabase() {

    abstract fun weatherDao(): WeatherDao

    companion object {
        fun buildDataBase(context: Context, dbName: String): AppDataBase {
            return Room.databaseBuilder(context, AppDataBase::class.java, dbName).build()
        }
    }


}