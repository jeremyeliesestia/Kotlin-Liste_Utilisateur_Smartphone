package com.example.todolist.retrofitApi

import com.example.todolist.model.Task
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface RetrofitApi {
    @GET("todos")
    fun getAllTasks() : Call<List<Task>>
    @POST("todos")
    fun addTask(@Body taskData: Task): Call<Task>
    @DELETE("todos/{id}")
    fun deleteTask(@Path("id") id: String): Call<String>




    companion object {
        var retrofitService: RetrofitApi? = null

        fun getInstance() : RetrofitApi {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://dmi-gobelins.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitApi::class.java)
            }
            return retrofitService!!
        }
    }
}