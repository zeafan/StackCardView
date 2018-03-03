package com.example.mohamed.stackcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
public class adapterClss extends ArrayAdapter<Integer> {
    Context context;
    public adapterClss(@NonNull Context context, int resource) {
        super(context, resource);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ImageView img=(ImageView)convertView.findViewById(R.id.imgid);
        img.setImageResource(getItem(position));
        return convertView;

    }
}
