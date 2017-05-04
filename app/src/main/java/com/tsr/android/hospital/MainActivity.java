package com.tsr.android.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclDistrict;
    private RecyclerView.Adapter mDistrictAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<DistrictList>districtLists;
    private DistrictList districtList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclDistrict = (RecyclerView) findViewById(R.id.district_list);

        recyclDistrict.setHasFixedSize(false);
        mLayoutManager = new LinearLayoutManager(this);

        districtLists = new ArrayList<>();
        districtList = new DistrictList();
        districtLists = districtList.getDistrictList();
        mDistrictAdapter = new DistrictAdapter(districtLists);
        recyclDistrict.setAdapter(mDistrictAdapter);
    }
}
