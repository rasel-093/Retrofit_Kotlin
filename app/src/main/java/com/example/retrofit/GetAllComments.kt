package com.example.retrofit

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun getAllComments(){
    RetrofitInstance.api.getComments().enqueue(object: Callback<List<Comment>> {
        override fun onResponse(call: Call<List<Comment>>, response: Response<List<Comment>>) {
            if(response.isSuccessful){
                response.body()?.let {
                    for (comment in it){
                        Log.d(RetrofitInstance.TAG,"onSuccess: ${comment.name}")
                    }
                }
            }
        }
        override fun onFailure(call: Call<List<Comment>>, t: Throwable) {
            Log.i(RetrofitInstance.TAG,"onFailure: ${t.message}")
        }
    })
}