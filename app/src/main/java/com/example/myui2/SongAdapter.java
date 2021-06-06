package com.example.myui2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class SongAdapter extends RecyclerView.Adapter<SongAdapter.MyViewHolder> {

    List<Song> mySongs;

    public SongAdapter(List<Song> mySongs) {
        this.mySongs = mySongs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater = LayoutInflater.from(parent.getContext());
        View view = layoutinflater.inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( SongAdapter.MyViewHolder holder, int position) {
        holder.display(mySongs.get(position));
    }

    @Override
    public int getItemCount() {
        return mySongs.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView mTextTitle;
        private TextView mTextArtist;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextArtist = (TextView) itemView.findViewById(R.id.artist);
            mTextTitle = (TextView) itemView.findViewById(R.id.name);
        }

        void display(Song song) {
            Log.d("Oh the tag", (String) mTextTitle.getText());
            mTextArtist.setText(song.getArtist());
            mTextTitle.setText(song.getTitle());
        }
    }
}
