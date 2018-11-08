package com.abisayuti.learnrequestapi.network;

import com.abisayuti.learnrequestapi.model.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    // TODO: 06/11/18 cara request
    @GET("tampil_berita.php")
    Call<ResponseBerita> getDataBerita();
}
