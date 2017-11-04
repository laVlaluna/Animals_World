package com.example.animalsworld;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animalsworld.model.Animal;
import com.example.animalsworld.model.AnimalList;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private int animalId;
    private Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        /*from now on is to make popup */
        ArrayList<Animal> animalList = AnimalList.getContext();
        Intent intent = this.getIntent();
        this.animalId = intent.getIntExtra("animalId",0);
        this.animal = animalList.get(animalId);
        /*ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle(this.animal.name);
        actionBar.setDisplayHomeAsUpEnabled(true);*/
        this.getSupportActionBar().setTitle(this.animal.name);
        TextView desciptionTextView = (TextView) this.findViewById(R.id.detail_desciption);
        ImageView pictureView = (ImageView) this.findViewById(R.id.detail_pic);
        desciptionTextView.setText(this.getString(this.animal.description));
        pictureView.setImageResource(this.animal.pic);

    }
    /*public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
    }

