package com.rendyprayoga.n_wisnu_a_uts.service;

import com.rendyprayoga.n_wisnu_a_uts.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}

