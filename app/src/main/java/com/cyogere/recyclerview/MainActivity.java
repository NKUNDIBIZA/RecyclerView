package com.cyogere.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String[] data = {"one", "two", "three", "four", "five", "six","one", "two", "three", "four",
                "five", "six","one", "two", "three", "four", "five", "six","one", "two", "three",
                "four", "five", "six", "three", "four", "five", "six","one", "two", "three",
                 "three", "four", "five", "six","one", "two", "three","three", "four", "five",
                "six","one", "two", "three", "three", "four", "five", "six","one", "two", "three",};
        adapter = new CountriesAdapter(data);
        recyclerView.setAdapter(adapter);

        ImageView imageView = findViewById(R.id.image);
        Glide.with(this).load("https://cdn.pixabay.com/photo/2017/05/18/21/54/tower-bridge-2324875_1280.jpg")
                .asBitmap()
                .into(imageView);
    }
}
