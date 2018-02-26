package com.jbpi.exampledi01.providers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonProvider {

    public Gson provideGson() {

        GsonBuilder gsonBuilder = new GsonBuilder();

        return gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
    }
}
