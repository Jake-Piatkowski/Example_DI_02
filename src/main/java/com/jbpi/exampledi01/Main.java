package com.jbpi.exampledi01;

import com.jbpi.exampledi01.data.ApiStream;
import com.jbpi.exampledi01.providers.*;

public class Main {

    public static void main(String[] args) {

        final RetrofitBuilderProvider retrofitBuilderProvider = new RetrofitBuilderProvider();
        final OkHttpClientBuilderProvider okHttpClientBuilderProvider = new OkHttpClientBuilderProvider();
        final HttpLoggingInterceptorProvider httpLoggingInterceptorProvider = new HttpLoggingInterceptorProvider();
        final OkHttpClientProvider okHttpClientProvider = new OkHttpClientProvider(okHttpClientBuilderProvider.provideOkHttpClientBuilder(),
                httpLoggingInterceptorProvider.provideHttpLoggingInterceptor());
        final GsonProvider gsonProvider = new GsonProvider();
        final RetrofitProvider retrofitProvider = new RetrofitProvider(retrofitBuilderProvider.provideRetrofitBuilder(),
                okHttpClientProvider.provideOkHttpClient(), gsonProvider.provideGson());
        final TwitchWebApiServiceProvider twitchWebApiServiceProvider = new TwitchWebApiServiceProvider(retrofitProvider.provideRetrofit());
        final StreamsDownloader streamsDownloader = new StreamsDownloader(twitchWebApiServiceProvider.provideTwitchWebApiService());

        streamsDownloader.download(apiResponseStreams -> {

            System.out.println("Stream count: " + apiResponseStreams.getData().size());

            for (ApiStream apiStream : apiResponseStreams.getData()) {
                System.out.println(apiStream.getTitle());
            }
        });
    }
}
