package com.example.medbot;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface HealthAPI {

    @GET("/posts")
    Call<ArrayList<Test>> getAnswer();

    @POST("/chat")
    Call<ApiResponseClass> getAnswer2(@Body Input Question);

    @POST("users")

        //on below line we are creating a method to post our data.
    Call<DataModal> createPost(@Body DataModal dataModal);
}
