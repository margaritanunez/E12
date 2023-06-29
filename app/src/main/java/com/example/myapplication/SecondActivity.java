package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> menuList = new ArrayList<>();
        menuList.add("Langosta a la North West");
        menuList.add("Tortilla española");
        menuList.add("Kimzuela");
        menuList.add("Sopa de Kanye West");
        menuList.add("Khloequetas");
        menuList.add("Pan y cosas pal pan");
        menuList.add("Pollo stormy atormentando");
        menuList.add("Rata de dos patas con ensalada");
        menuList.add("Sardinas sin nada");
        menuList.add("El agua es para las plantas con arroz");
        menuList.add("Costillar a la wine not");
        menuList.add("Ensalada Kardashian");
        menuList.add("Puré de calabazas");
        menuList.add("Torta de quenuncafalteelcopete");

        ArrayAdapter adapter= new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, menuList);
        binding.menuListView.setAdapter(adapter);




    }

}