package com.example.and34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.and34.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private com.example.and34.Adapter adapter;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        recyclerView = findViewById(R.id.recicle_view);
        names = new ArrayList<>();
        names.add("Ali");
        names.add("Jack");
        names.add("John");
        names.add("Max");
        names.add("Alex");
        names.add("Bill");
        names.add("Anna");
        names.add("Smi");
        names.add("Mira");

    }
}