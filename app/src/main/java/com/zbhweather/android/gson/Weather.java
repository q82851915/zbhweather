package com.zbhweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 30484 on 2017/12/13.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //public Forecast forecast;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
