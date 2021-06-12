package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("/api/users?page=2/")
    Call<Model> getAlldata();
}
