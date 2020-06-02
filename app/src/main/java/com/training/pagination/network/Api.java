package com.training.pagination.network;

import com.training.pagination.model.StackApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("answers")
    Call<StackApiResponse> getanswers(
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("site") String site
    );
}
