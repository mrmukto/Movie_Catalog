package com.mrmukto12.moviecatalogf

import com.mrmukto12.moviecatalogf.models.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "53a3fedaca98c4bcf210a970522c3e89",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "53a3fedaca98c4bcf210a970522c3e89",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "53a3fedaca98c4bcf210a970522c3e89",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}