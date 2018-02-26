package com.jbpi.exampledi01.providers;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitProvider {

    private final Retrofit.Builder retrofitBuilder;
    private final OkHttpClient okHttpClient;
    private final Gson gson;

    public RetrofitProvider(Retrofit.Builder retrofitBuilder, OkHttpClient okHttpClient, Gson gson) {
        this.retrofitBuilder = retrofitBuilder;
        this.okHttpClient = okHttpClient;
        this.gson = gson;
    }

    public Retrofit provideRetrofit() {

        return this.retrofitBuilder
                .baseUrl("https://api.twitch.tv/")
                .client(this.okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(this.gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
