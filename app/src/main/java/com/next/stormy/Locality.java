package com.next.stormy;

import android.app.Application;

/**
 * Created by manfredi on 24/07/15.
 */
public class Locality extends Application {

    private static Locality mInstance;


    public String mCity;
    public String mAdminArea;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static Locality getInstance() {
        return mInstance;
    }


    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getAdminArea() {
        return mAdminArea;
    }

    public void setAdminArea(String adminArea) {
        mAdminArea = adminArea;
    }
}
