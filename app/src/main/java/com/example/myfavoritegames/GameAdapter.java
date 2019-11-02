package com.example.myfavoritegames;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ListViewHolder> {
    private ArrayList<Games> listGames;

    public GameAdapter(ArrayList<Games> list) {
        this.listGames = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_game_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Games games = listGames.get(position);
        Glide.with(holder.itemView.getContext())
                .load(games.getGamePhoto())
                .apply(new RequestOptions().override(118, 154))
                .into(holder.imgPhoto);
        holder.tvGameName.setText(games.getGameName());
        holder.tvGameDev.setText(games.getGameDev());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Detail_Games.class);
                intent.putExtra(Detail_Games.GAME_NAME,games.getGameName());
                intent.putExtra("Image",games.getGamePhoto());
                intent.putExtra(Detail_Games.GAME_DETAIL,games.getGameDetail());
                intent.putExtra(Detail_Games.GAME_DEV,games.getGameDev());
                intent.putExtra(Detail_Games.GAME_GENRE,games.getGameGenre());
                intent.putExtra(Detail_Games.GAME_PUBLISHER,games.getGamePublisher());
                intent.putExtra(Detail_Games.GAME_RELEASE,games.getGameRelease());
                intent.putExtra(Detail_Games.GAME_MODE,games.getGameModes());
                intent.putExtra(Detail_Games.GAME_PLATFORM,games.getGamePlatform());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listGames.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvGameName, tvGameDev;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.game_images);
            tvGameName = itemView.findViewById(R.id.tv_game_name);
            tvGameDev = itemView.findViewById(R.id.tv_game_dev);
        }
    }
}