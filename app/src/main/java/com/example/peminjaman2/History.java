package com.example.peminjaman2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class History extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ModelAdapter adapter;
    private ArrayList<ModelClass> modelclassArraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


//        addData();
//
//        recyclerView = (RecyclerView) findViewById(R.id.rv_list);
//        adapter = new ModelAdapter(modelclassArraylist);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(History.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//
//    }

//    void addData(){
//
//        modelclassArraylist = new ArrayList<>();
//        modelclassArraylist.add(new ModelClass("Dwi Putri", "1931130011","3A"));
//    }
    }
}