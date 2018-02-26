package com.jbpi.exampledi01.providers;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpClientProvider {

    private final OkHttpClient.Builder okHttpClientBuilder;
    private final HttpLoggingInterceptor httpLoggingInterceptor;

    public OkHttpClientProvider(OkHttpClient.Builder okHttpClientBuilder, HttpLoggingInterceptor httpLoggingInterceptor) {

        this.okHttpClientBuilder = okHttpClientBuilder;
        this.httpLoggingInterceptor = httpLoggingInterceptor;
    }

    public OkHttpClient provideOkHttpClient() {

        return okHttpClientBuilder.addInterceptor(this.httpLoggingInterceptor).build();
    }
}
