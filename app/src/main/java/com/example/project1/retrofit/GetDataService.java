package com.example.project1.retrofit;

import com.example.project1.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
