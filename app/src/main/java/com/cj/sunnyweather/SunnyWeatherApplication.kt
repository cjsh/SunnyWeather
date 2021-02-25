package com.cj.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "DjEGvY2Qgw8SXFKc"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}