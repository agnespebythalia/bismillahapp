package com.bismillah.app.data.remote

import com.bismillah.app.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface NewsService {
    @GET("api/manga/page/1")
    fun listNews(): Call<NewsList>

    @GET ("detail/")
    fun detailNews(@Query("url") url: String) :Call<NewsList>

    @GET("search/")
    fun searchNews(@Query("q") query: String) : Call<NewsList>

}