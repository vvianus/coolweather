package com.example.a123.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by a123 on 2017/2/21.
 */

public class Province extends DataSupport {

    private int id;

    private String proviceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
