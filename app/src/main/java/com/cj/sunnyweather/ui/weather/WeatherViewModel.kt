package com.cj.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.cj.sunnyweather.logic.Repository
import com.cj.sunnyweather.logic.model.Location

class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""
    var locationLat = ""
    var placeNmae = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { it ->
        Repository.refreshWeather(it.lng, it.lat)
    }

    fun refershWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }

}