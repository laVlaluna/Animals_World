package com.example.animalsworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.animalsworld.adapter.AnimalAdapter;
import com.example.animalsworld.model.Animal;
import com.example.animalsworld.model.AnimalList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] nameList = {   "แมว (Cat)",
                "สุนัข (Dog)",
                "โลมา (Dolphin)",
                "โคล่า (Koala)",
                "นกฮูก (Owl)",
                "กระต่าย (Rabbit)",
                "เพนกวิน (Penguin)",
                "เสือ (Tiger)",
                "สิงโต (Lion)",
                "หมู (Pig)"};
        int[] imageList={       R.drawable.cat,
                R.drawable.dog,
                R.drawable.dolphin,
                R.drawable.koala,
                R.drawable.owl,
                R.drawable.rabbit,
                R.drawable.penguin,
                R.drawable.tiger,
                R.drawable.lion,
                R.drawable.pig};
        int[] desciptionList = {
                R.string.details_cat,
                R.string.details_dog,
                R.string.details_dolphin,
                R.string.details_koala,
                R.string.details_owl,
                R.string.details_rabbit,
                R.string.details_penguin,
                R.string.details_tiger,
                R.string.details_lion,
                R.string.details_pig};
        ArrayList<Animal> animalList = AnimalList.getContext();
        for (int i = 0;i< nameList.length;i++){
            animalList.add(new Animal(nameList[i],desciptionList[i],imageList[i]));
        }
        AnimalAdapter animalAdapter = new AnimalAdapter(this,R.layout.animal_item,animalList);
        ListView titleListView = (ListView) this.findViewById(R.id.main_list);
        titleListView.setAdapter(animalAdapter);
        /* from now on is to make popup */
        titleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("animalId",i);
                startActivity(intent);
            }
        });
    }
    }