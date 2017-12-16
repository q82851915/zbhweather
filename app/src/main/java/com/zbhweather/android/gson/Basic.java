package com.zbhweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 30484 on 2017/12/13.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
