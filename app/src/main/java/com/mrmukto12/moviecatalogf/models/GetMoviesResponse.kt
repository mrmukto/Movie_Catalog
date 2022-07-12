package com.mrmukto12.moviecatalogf.models

import com.google.gson.annotations.SerializedName
import com.mrmukto12.moviecatalogf.models.Movie

data class GetMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)