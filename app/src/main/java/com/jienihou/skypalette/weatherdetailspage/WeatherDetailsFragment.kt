package com.jienihou.skypalette.weatherdetailspage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jienihou.skypalette.R
import com.jienihou.skypalette.data.WeatherPalette
import com.jienihou.skypalette.databinding.FragmentWeatherDetailsPageBinding

/**
 * WeatherDetailsFragment shows all the details of the chosen weather palette
 */
class WeatherDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentWeatherDetailsPageBinding>(
            inflater, R.layout.fragment_weather_details_page, container, false
        )

        val weatherPalette = this.arguments?.getParcelable<WeatherPalette>("weather_palette")

        (activity as AppCompatActivity).supportActionBar?.setDisplayShowCustomEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.show()

        binding.tvWeekdayView.text = weatherPalette?.dayOfWeek.toString()

        // weekday icon
//        val icon = WeatherToIconMap.map[weatherPalette?.weatherType]
//        if (icon != null) {
//            binding.ivWeatherIcon.setImageDrawable(resources.getDrawable(icon))
//        }

        // temperature labels
        var temperatureCelcius = "${weatherPalette?.highTempCelcius}°C"
        binding.tvHighTemp.text = temperatureCelcius

        temperatureCelcius = "${weatherPalette?.lowTempCelcius}°C"
        binding.tvLowTemp.text = temperatureCelcius

        // color palette
        weatherPalette?.let {
            binding.vFirstColor.setBackgroundColor(weatherPalette.colors[0].toInt())
            binding.vSecondColor.setBackgroundColor(weatherPalette.colors[1].toInt())
            binding.vThirdColor.setBackgroundColor(weatherPalette.colors[2].toInt())
            binding.vFourthColor.setBackgroundColor(weatherPalette.colors[3].toInt())
        }

        // TODO: insert viewmodel initialization and shuffle button implementation here
        return binding.root
    }
}