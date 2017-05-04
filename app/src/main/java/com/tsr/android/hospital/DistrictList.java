package com.tsr.android.hospital;

import java.util.ArrayList;

/**
 * Created by tsult on 05-May-17.
 */

class DistrictList {
    private String districtName;

    public DistrictList(String districtName) {
        this.districtName = districtName;
    }

    public DistrictList() {
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public ArrayList<DistrictList> getDistrictList (){
        ArrayList<DistrictList>districtLists = new ArrayList<>();
        districtLists.add(new DistrictList("Jessore"));
        districtLists.add(new DistrictList("Dhaka"));
        return districtLists;
    }
}
