package com.abisayuti.learnrequestapi.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit {
    public static final String BASE_URL =
            "http://127.0.0.1/portal_berita-master/tampil_berita.php";
    public static final String IMAGES = BASE_URL + "images/";
    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }

}
