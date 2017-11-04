package com.example.animalsworld.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animalsworld.R;
import com.example.animalsworld.model.Animal;

import java.util.List;

/**
 * Created by Lenovo on 4/11/2560.
 */
public class AnimalAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private List object;

    public AnimalAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.object = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        LayoutInflater layout = LayoutInflater.from(context);
        View view = layout.inflate(this.resource,null);
        Animal animal = (Animal) this.object.get(position);
        TextView nameView = (TextView) view.findViewById(R.id.animal_name);
        nameView.setText(animal.name);
        ImageView picView = (ImageView) view.findViewById(R.id.animal_pic);
        picView.setImageResource(animal.pic);
        return view;




    }
}