package com.example.kot104.service

import com.example.kot104.model.MovieRequest
import com.example.kot104.model.StatusResponse
import com.example.kot104.response.MovieResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MovieService {
    @GET("user")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("user/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("user")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("user/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("user/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}
