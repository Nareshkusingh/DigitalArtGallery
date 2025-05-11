package com.naresh.digitalartgallery;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ArtworkAdapter extends RecyclerView.Adapter<ArtworkAdapter.ArtworkViewHolder> {

    private Context context;
    private List<Artwork> artworkList;

    public ArtworkAdapter(Context context, List<Artwork> artworkList) {
        this.context = context;
        this.artworkList = artworkList;
    }

    @Override
    public ArtworkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_artwork, parent, false);
        return new ArtworkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArtworkViewHolder holder, int position) {
        Artwork artwork = artworkList.get(position);
        holder.titleTextView.setText(artwork.getTitle());
        holder.artistTextView.setText(artwork.getArtist());
        holder.imageView.setImageResource(artwork.getImageResId());
    }

    @Override
    public int getItemCount() {
        return artworkList.size();
    }

    public static class ArtworkViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;
        TextView artistTextView;

        public ArtworkViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            artistTextView = itemView.findViewById(R.id.artistTextView);
        }
    }
}