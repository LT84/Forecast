package com.project.forecast.domain.repository

import com.project.forecast.domain.models.WeatherModel

//Будет реализован в data слое
interface WeatherRepository {

    suspend fun saveWeather(weatherModel: WeatherModel)

    suspend fun getAllWeather(): List<WeatherModel>
}