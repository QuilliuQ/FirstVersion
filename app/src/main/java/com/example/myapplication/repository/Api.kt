package com.example.myapplication.repository

import com.example.myapplication.repository.model.DataDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST("client/content")
    fun getParams(
     @Body hashMap: HashMap<String,String> = hashMapOf(
         "player_id" to "12344",
         "platform" to "Android",
         "version" to "11",
         "manufacturer" to "1",
         "model" to "Pixel 2",
         "serial" to "AB-20",
     )
    ):Call<DataDto>
}