package com.jienihou.skypalette.api

import android.util.Log
import com.jienihou.skypalette.data.ForecastList
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class Service(private val host: String = "") {
    companion object {
        private const val TAG = "Service"
    }

    private val weatherApi: WeatherApi by lazy {
        val retrofit = Retrofit.Builder()
            .client(OkHttpClient.Builder()
                .build())
            .baseUrl(host)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create<WeatherApi>(WeatherApi::class.java)
    }

    fun retrieveWeatherForecast(callback: (result: Result<ForecastList>) -> Unit) {
        try {
            val response: Response<ForecastList> = weatherApi.weatherForecast().execute()
            if (response.isSuccessful) {
                callback.invoke(Success(response.body()))
            } else {
                callback.invoke(Failure(response.message()))
            }
        } catch (e: IOException) {
            Log.e(TAG, "Weather Retrieval Failed", e)
            callback.invoke(Failure(e.message ?: ""))
        }
    }
}