package com.example.a123.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by a123 on 2017/2/22.
 */

public class Weather {
    public String status;

    public Basic basic;

    public  AQI aqi;

    public  Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
