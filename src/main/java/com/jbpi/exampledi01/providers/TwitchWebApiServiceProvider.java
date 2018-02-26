package com.jbpi.exampledi01.providers;

import com.jbpi.exampledi01.TwitchWebApiService;
import retrofit2.Retrofit;

public class TwitchWebApiServiceProvider {

    private final Retrofit retrofit;

    public TwitchWebApiServiceProvider(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public TwitchWebApiService provideTwitchWebApiService() {

        return this.retrofit.create(TwitchWebApiService.class);
    }
}
