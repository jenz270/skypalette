package com.jienihou.skypalette.api

sealed class Result<out T>
data class Success<T>(val response: T?) : Result<T>()
data class Failure(val errorResponse: String) : Result<Nothing>()
object Loading : Result<Nothing>()
