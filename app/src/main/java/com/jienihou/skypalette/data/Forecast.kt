package com.jienihou.skypalette.data

import com.google.gson.annotations.SerializedName

data class ForecastList(val list: List<Forecast>)

data class Forecast(@SerializedName("main") val mainDetails: WeatherDetails, val weather: List<Weather>, @SerializedName("dt_txt") val time: String)

data class WeatherDetails (@SerializedName("temp_min") val minTemp: Double, @SerializedName("temp_max") val maxTemp: Double)

data class Weather(@SerializedName("main") val overallWeather: String, @SerializedName("description") val detailedWeather: String)
