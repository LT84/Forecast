package com.project.data.storage.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.project.data.storage.room.models.WeatherModelForDb

@Dao
interface WeatherDao {

    @Insert
    suspend fun insert(weatherForDb: WeatherModelForDb)

    @Query("SELECT * FROM ${WeatherModelForDb.TABLE_NAME}")
    suspend fun getAllWeatherModels()
}