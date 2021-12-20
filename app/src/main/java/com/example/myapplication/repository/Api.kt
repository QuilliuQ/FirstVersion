package com.example.myapplication.repository

import com.example.myapplication.repository.model.ResponseData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST("client/content")
    fun getParams(
     @Body hashMap: HashMap<String, Any>
    ):Call<ResponseData>
}