package com.project.data.storage.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.data.storage.room.models.WeatherModelForDb.Companion.TABLE_NAME

@Entity(
    tableName = TABLE_NAME
)
class WeatherModelForDb(
    @PrimaryKey
    val id: Int,
    val temperature: String,
    val weatherName: String,
    val windSpeed: String,
    val pressure: String
) {

    companion object {
        const val TABLE_NAME = "WeatherTable"

        const val ID = "Id"
        const val TEMPERATURE = "Temperature"
        const val WEATHER_NAME = "WeatherName"
        const val WIND_SPEED = "WindSpeed"
        const val PRESSURE = "Pressure"
    }


}
