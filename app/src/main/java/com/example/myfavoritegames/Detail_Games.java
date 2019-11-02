package com.example.myfavoritegames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Games extends AppCompatActivity {

    public static final String GAME_NAME = "game_name";
    public static final String GAME_DETAIL = "game_detail";
    public static final String GAME_DEV = "game_dev";
    public static final String GAME_PUBLISHER = "game_publisher";
    public static final String GAME_RELEASE = "game_release";
    public static final String GAME_PLATFORM = "game_platform";
    public static final String GAME_GENRE = "game_genre";
    public static final String GAME_MODE = "game_mode";

    TextView tvGameName;
    ImageView ivGamePhoto;
    TextView tvGameDetail;
    TextView tvGameDev;
    TextView tvGamePublisher;
    TextView tvGameRelease;
    TextView tvGamePlatform;
    TextView tvGameGenre;
    TextView tvGameMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_games);

        tvGameName = findViewById(R.id.tv_game_name);
        ivGamePhoto = findViewById(R.id.game_images);
        tvGameDetail = findViewById(R.id.tv_game_detail);
        tvGameDev = findViewById(R.id.tv_game_dev);
        tvGameGenre = findViewById(R.id.tv_game_genre);
        tvGameMode = findViewById(R.id.tv_game_mode);
        tvGamePublisher = findViewById(R.id.tv_game_publisher);
        tvGameRelease = findViewById(R.id.tv_game_release);
        tvGamePlatform = findViewById(R.id.tv_game_platform);

        tvGameName.setText(getIntent().getStringExtra(GAME_NAME));
        ivGamePhoto.setImageResource(getIntent().getIntExtra("Image",0));
        tvGameDetail.setText(getIntent().getStringExtra(GAME_DETAIL));
        tvGameDev.setText(getIntent().getStringExtra(GAME_DEV));
        tvGameGenre.setText(getIntent().getStringExtra(GAME_GENRE));
        tvGameMode.setText(getIntent().getStringExtra(GAME_MODE));
        tvGamePublisher.setText(getIntent().getStringExtra(GAME_PUBLISHER));
        tvGameRelease.setText(getIntent().getStringExtra(GAME_RELEASE));
        tvGamePlatform.setText(getIntent().getStringExtra(GAME_PLATFORM));
    }
}
