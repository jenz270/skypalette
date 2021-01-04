package com.jienihou.skypalette.api
import com.jienihou.skypalette.data.ForecastList
import com.jienihou.skypalette.data.WeatherPalette
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface WeatherApi {
    companion object {
        //private val API_KEY = BuildConfig.API_KEY
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
    }

    // Need to make sure to grab lat and long information from the user's current location
        @GET("forecast?laat=35&lon=139")
        fun weatherForecast(@Query("appid") appId: String = "37631d84dfb636c78d434b9314cd4f84", @Query("units") units: String = "metric"): Outcome<ForecastList>
}