package com.project.forecast.app

import android.app.Application
import com.project.data.storage.room.AppDataBase

class App : Application() {

    private lateinit var dataBase: AppDataBase

    override fun onCreate() {
        super.onCreate()

        dataBase = AppDataBase.buildDataBase(applicationContext, DATABASE_NAME)
    }

    companion object {
        private const val DATABASE_NAME = "forecast_app.db"
    }
}