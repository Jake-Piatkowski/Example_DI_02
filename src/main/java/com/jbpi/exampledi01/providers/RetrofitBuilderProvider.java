package com.jbpi.exampledi01.providers;

import retrofit2.Retrofit;

public class RetrofitBuilderProvider {

    public Retrofit.Builder provideRetrofitBuilder() {
        return new Retrofit.Builder();
    }
}
