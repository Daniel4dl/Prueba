package com.example.prueba2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("v2/5d6da6813000008eb78fbc44")
    public Call<List<ApiObject>> getAllPost();
}
