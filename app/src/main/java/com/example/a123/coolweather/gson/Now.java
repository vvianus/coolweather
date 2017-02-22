package com.example.a123.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by a123 on 2017/2/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public  String info;
    }
}
