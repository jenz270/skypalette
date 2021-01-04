package com.jienihou.skypalette.homepage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.jienihou.skypalette.R
import com.jienihou.skypalette.data.WeatherPalette
import kotlinx.android.synthetic.main.weather_palette_item.view.*

class HomePageAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var weatherList : List<WeatherPalette> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WeatherPaletteViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.weather_palette_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    fun setWeatherList(resultList: List<WeatherPalette>){
        weatherList = resultList
    }


    class WeatherPaletteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val weekdayText: TextView = itemView.weekday_text
        val weekdayImage: ImageView = itemView.ic_color_one
        val weekdayImage2: ImageView = itemView.ic_color_two
        val weekdayImage3: ImageView = itemView.ic_color_three
        val weekdayImage4: ImageView = itemView.ic_color_four
        val weekdayIcon : ImageView = itemView.weather_icon
        val weatherPaletteItem : MaterialCardView = itemView.cv_weather_palette
    }
}