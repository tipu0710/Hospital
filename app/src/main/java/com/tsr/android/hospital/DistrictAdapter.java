package com.tsr.android.hospital;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by tsult on 05-May-17.
 */

class DistrictAdapter extends RecyclerView.Adapter<DistrictAdapter.ViewHolder> {

    private ArrayList<DistrictList> districtLists;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView districtName;
        private View container;
        public ViewHolder(View v) {
            super(v);
            districtName = (TextView) v.findViewById(R.id.district_name);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public DistrictAdapter(Context context,ArrayList<DistrictList> districtLists) {
        this.districtLists = districtLists;
        this.context = context;
    }

    @Override
    public DistrictAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_hospital, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.districtName.setText(districtLists.get(position).getDistrictName());
    }

    @Override
    public int getItemCount() {
        return districtLists.size();
    }
}
