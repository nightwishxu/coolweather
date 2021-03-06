package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jack on 2017/11/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weather;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
