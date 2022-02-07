package com.example.myapplication

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getAllCharacters(@Url url:String):retrofit2.Response<ResponseJson>
}