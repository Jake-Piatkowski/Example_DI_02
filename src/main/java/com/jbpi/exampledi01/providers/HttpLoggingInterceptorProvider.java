package com.jbpi.exampledi01.providers;

import okhttp3.logging.HttpLoggingInterceptor;

public class HttpLoggingInterceptorProvider {

    public HttpLoggingInterceptor provideHttpLoggingInterceptor() {

        final HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return httpLoggingInterceptor;
    }
}
