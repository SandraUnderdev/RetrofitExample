package com.example.weatherapplication

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.time.Duration

class RetrofitBuilder {
    companion object {
        var retrofitServices: RetrofitServices? = null
        fun getInstance(): RetrofitServices {
            if(retrofitServices == null) {
                val logger =
                    HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

                val client = OkHttpClient.Builder().addInterceptor(logger).build()


                retrofitServices = Retrofit.Builder()
                    .baseUrl("https://api.weatherapi.com")
                    .client(client)
                    //this converts the response to data objects. Gson is most popular. KotlinxSerialization is newest.
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(RetrofitServices::class.java)
            }
            return retrofitServices!!
        }
    }
}
