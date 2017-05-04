package com.tsr.android.hospital;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tsult on 05-May-17.
 */

class DistrictAdapter extends RecyclerView.Adapter<DistrictAdapter.ViewHolder> {

    private ArrayList<DistrictList> districtLists;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView districtName;
        public ViewHolder(TextView v) {
            super(v);
            districtName = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public DistrictAdapter(ArrayList<DistrictList> districtLists) {
        this.districtLists = districtLists;
    }

    @Override
    public DistrictAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_hospital, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.districtName.setText(districtLists.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return districtLists.size();
    }
}
