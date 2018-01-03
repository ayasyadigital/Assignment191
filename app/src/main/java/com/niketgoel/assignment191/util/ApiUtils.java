package com.niketgoel.assignment191.util;


import com.niketgoel.assignment191.data.remote.RetrofitClient;
import com.niketgoel.assignment191.data.remote.SOService;



public class ApiUtils {

    public static final String BASE_URL = "http://samples.openweathermap.org/data/2.5/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}