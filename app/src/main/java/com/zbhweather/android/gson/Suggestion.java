package com.zbhweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 30484 on 2017/12/13.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class Carwash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
