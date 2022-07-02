package com.project.data.repository

import com.project.data.storage.room.dao.WeatherDao
import com.project.forecast.domain.models.WeatherModel

import com.project.forecast.domain.repository.WeatherRepository

//Тут будет реализация сохранения в бд
class WeatherRepositoryImpl(private val weatherDao: WeatherDao) : WeatherRepository {

    override suspend fun saveWeather(weatherModel: WeatherModel) {
        weatherDao.insert()
    }

    override suspend fun getAllWeather(): List<WeatherModel> {
        var weatherList : MutableList<WeatherModel>
        weatherList.addAll()
        return
    }
}