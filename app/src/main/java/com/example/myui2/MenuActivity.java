package com.example.myui2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private Button mbackButton;
    private RecyclerView mRecycler;
    private SongAdapter mAdapter;
    private List<Song> mySongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mySongs = new ArrayList<>();
        mySongs.add(new Song("Renaud", "Mistral Gagnant"));
        mySongs.add(new Song("Dalida", "Mourir sur scène"));
        mySongs.add(new Song("Serge Lama", "Je suis malade"));
        mySongs.add(new Song("Charles Aznavour", "Emmenez-moi"));
        mySongs.add(new Song("Barbara", "L'aigle noir"));
        mySongs.add(new Song("Jean Ferrat", "Les poètes"));
        mySongs.add(new Song("Jean Ferrat", "La Montagne"));
        mySongs.add(new Song("Dalida", "Bambino"));
        mySongs.add(new Song("Barbara", "Ma plus belle histoire d'amour, c'est vous"));
        mySongs.add(new Song("Georges Brassens", "Gare au gorille"));
        mySongs.add(new Song("Georges Moustaki", "Le métèque"));
        mySongs.add(new Song("Serge Reggiani", "Sarah"));

        mAdapter = new SongAdapter(mySongs);

        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        mRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecycler.setAdapter(mAdapter);

        Log.d("tag", String.valueOf(mRecycler.getAdapter()));

        mbackButton = (Button) findViewById(R.id.back_button);
        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backActivity);
                finish();
            }
        });
    }
}