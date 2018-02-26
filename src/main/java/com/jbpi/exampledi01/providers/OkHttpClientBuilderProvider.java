package com.jbpi.exampledi01.providers;

import okhttp3.OkHttpClient;

public class OkHttpClientBuilderProvider {

    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient.Builder();
    }
}
