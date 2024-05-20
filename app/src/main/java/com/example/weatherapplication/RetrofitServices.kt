package com.example.weatherapplication

import com.example.weatherapplication.datamodel.WeatherResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitServices {
    @GET("v1/current.json?key=1bff2eea8efc43cc9d804812242005&")
   suspend fun getWeatherDetail(
        @Query("q") city:String
    ): Response<WeatherResponseModel>

}

//https://api.weatherapi.com/v1/current.json?key=1bff2eea8efc43cc9d804812242005&q=London

/**
{
"location": {
"name": "London",
"region": "City of London, Greater London",
"country": "United Kingdom",
"lat": 51.52,
"lon": -0.11,
"tz_id": "Europe/London",
"localtime_epoch": 1716167403,
"localtime": "2024-05-20 2:10"
},
"current": {
"last_updated_epoch": 1716166800,
"last_updated": "2024-05-20 02:00",
"temp_c": 12,
"temp_f": 53.6,
"is_day": 0,
"condition": {
"text": "Clear",
"icon": "//cdn.weatherapi.com/weather/64x64/night/113.png",
"code": 1000
},
"wind_mph": 6.9,
"wind_kph": 11.2,
"wind_degree": 30,
"wind_dir": "NNE",
"pressure_mb": 1015,
"pressure_in": 29.97,
"precip_mm": 0,
"precip_in": 0,
"humidity": 88,
"cloud": 0,
"feelslike_c": 11.1,
"feelslike_f": 51.9,
"vis_km": 10,
"vis_miles": 6,
"uv": 1,
"gust_mph": 9.8,
"gust_kph": 15.8
}
}
*/