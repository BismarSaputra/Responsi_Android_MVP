package com.responsi.mvp.Service;


import com.responsi.mvp.Model.People2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PeopleService {

    @GET("people")
    Call<People2> getData();

//    @GET("people")
//    Call<People> getData(@Query("results") String result,
//                         @Query("nat") String nat);
}
