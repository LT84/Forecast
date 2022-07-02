package com.project.data.storage


//Отдельный класс для сохранения данных в базу дынных. Для получения данных с апи нужно сделать
// отдельный интерфейс и передать его в констурктор сюда. SaveWeatherToDb - как связующее звено
class SaveWeatherToDbStorage(private val weatherStorage: WeatherStorage) : WeatherStorage {
}