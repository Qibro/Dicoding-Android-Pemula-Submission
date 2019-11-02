package com.example.myfavoritegames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ArrayList<Games> listGames = new ArrayList<>();
    RecyclerView rvGames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listGames.addAll(GamesData.getListData());
        showRecyclelist();
    }

    private void showRecyclelist() {
        rvGames = findViewById(R.id.recycler_view);
        rvGames.setHasFixedSize(true);
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        GameAdapter adapter = new GameAdapter(listGames);
        rvGames.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.action_about){
            Intent intent = new Intent(MainActivity.this,Profile.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
