package com.jbpi.exampledi01;

import com.jbpi.exampledi01.data.ApiResponseStreams;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

class StreamsDownloader {

    private final TwitchWebApiService twitchWebApiService;

    StreamsDownloader(TwitchWebApiService twitchWebApiService) {

        this.twitchWebApiService = twitchWebApiService;
    }

    void download(Consumer<ApiResponseStreams> action) {

        Observable<ApiResponseStreams> streamsHomm3 = this.twitchWebApiService.getStreamsHomm3();
        streamsHomm3.subscribe(action);
    }
}
