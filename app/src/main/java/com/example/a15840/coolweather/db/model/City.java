package com.example.a15840.coolweather.db.model;

import org.litepal.crud.DataSupport;

/**
 * Created by 15840 on 2017/12/27.
 */

public class City extends DataSupport {
     private int cityId;
     private String cityName;
     private int cityCode;
     private int provinceId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}