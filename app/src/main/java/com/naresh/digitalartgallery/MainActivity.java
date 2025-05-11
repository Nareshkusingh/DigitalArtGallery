package com.naresh.digitalartgallery;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArtworkAdapter adapter;
    private List<Artwork> artworkList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        artworkList = new ArrayList<>();
        // Sample data: replace R.drawable.sample1 with your image resources
        artworkList.add(new Artwork("RoboBond", "Gaurav Kumar", R.drawable.robo));
        artworkList.add(new Artwork("Glimpes into Entanchment", "Yetendra Kumar", R.drawable.glimpes));
        artworkList.add(new Artwork("Dreamscape", "Yetendra Kumar", R.drawable.dream));
        artworkList.add(new Artwork("Sunset Overdrive", "Gaurav Kumar", R.drawable.sunset));
        artworkList.add(new Artwork("Urban Jungle", "Yatendra Kumar", R.drawable.jungle));
        artworkList.add(new Artwork("Relax", "Naresh Kumar", R.drawable.relax));





        adapter = new ArtworkAdapter(this, artworkList);
        recyclerView.setAdapter(adapter);
    }
}