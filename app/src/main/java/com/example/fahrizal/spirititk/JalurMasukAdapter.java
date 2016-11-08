package com.example.fahrizal.spirititk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fahrizal on 10/20/16.
 */

public class JalurMasukAdapter extends RecyclerView.Adapter<JalurMasukAdapter.ViewHolder> {
    private List<Card> mCards;

    public JalurMasukAdapter(List<Card> dataModelList) {

        this.mCards = dataModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_info, parent,
                false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card cards = mCards.get(position);
        holder.name.setText(cards.getName());
        holder.image.setImageResource(cards.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public ImageView image;
        private final Context context;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name_card);
            image = (ImageView) view.findViewById(R.id.image_card);
            context = view.getContext();
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch (getLayoutPosition()) {
                case 0:
                    intent = new Intent(v.getContext(), SnmptnItk.class);
                    break;
                case 1:
                    intent = new Intent(context, SbmptnItk.class);
                    break;
                case 2:
                    intent = new Intent(context, UmItk.class);
                    break;
                default:
                    intent = new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);

        }
    }
}
