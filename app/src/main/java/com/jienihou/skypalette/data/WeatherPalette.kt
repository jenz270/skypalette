package com.jienihou.skypalette.data

import android.os.Parcelable
import com.jienihou.skypalette.model.DayOfWeek
import com.jienihou.skypalette.model.WeatherType
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WeatherPalette(
        var colors: List<String>,
        val highTempCelcius: Double,
        val lowTempCelcius: Double,
        val dayOfWeek: DayOfWeek,
        val weatherType: WeatherType
): Parcelable