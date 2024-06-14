package com.example.recipesandhealth.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceRetrofit {

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Companion.BASE_URL)
        .build()

    companion object {
        private const val BASE_URL = "https://spoonacular.com/"
    }

}