package com.example.feedzieapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NgoInfoAdapter extends ArrayAdapter<NgoInfo> {
    public NgoInfoAdapter(Activity context, ArrayList<NgoInfo> ngoInfo) {
        super(context, 0, ngoInfo);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.ngo_list_item, parent, false);
        }


        NgoInfo currentNgo = getItem(position);

        TextView NgoNameView = (TextView) listItemView.findViewById(R.id.ngoName);

        NgoNameView.setText((currentNgo.getNgoName()));


        TextView NgoInfoView = (TextView) listItemView.findViewById(R.id.ngoInfo);

        NgoInfoView.setText((currentNgo.getNgoInfo()));


        ImageView NgoImage = (ImageView) listItemView.findViewById(R.id.ngoImage);

        NgoImage.setImageResource(currentNgo.getImageResourceId());


        return listItemView;
    }

}
