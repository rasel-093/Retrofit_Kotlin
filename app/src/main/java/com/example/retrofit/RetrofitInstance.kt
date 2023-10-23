package com.example.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance{
    val BASE_URL = "https://jsonplaceholder.typicode.com/"
    val TAG: String = "CHECK_RESPONSE"
    val api =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)
}
