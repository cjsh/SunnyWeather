package com.cj.sunnyweather.logic.network

import com.cj.sunnyweather.SunnyWeatherApplication
import retrofit2.http.Query
import com.cj.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}