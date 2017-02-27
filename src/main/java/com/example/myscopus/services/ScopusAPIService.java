package com.example.myscopus.services;

import com.example.myscopus.models.scopusapi.ScopusSearchResponse;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Retrofit Service.
 */
public interface ScopusAPIService {

    @POST("/content/search/scopus")
    @Headers("Content-Type: application/json")
    ScopusSearchResponse getByAuthor(@Query("query") String query, @Query("apiKey") String apiKey);

    @POST("/content/search/scopus")
    @Headers("Content-Type: application/json")
    ScopusSearchResponse getByAuthor(@Query("start") int start, @Query("count") int count,
                                     @Query("query") String query, @Query("apiKey") String apiKey);
}
