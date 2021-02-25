package com.cj.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.cj.sunnyweather.SunnyWeatherApplication
import com.cj.sunnyweather.logic.model.Place
import com.google.gson.Gson

object PlaceDao {

    private fun sharedPreference() = SunnyWeatherApplication.context.
            getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        sharedPreference().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavePlace(): Place {
        val placeJson = sharedPreference().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreference().contains("place")

}