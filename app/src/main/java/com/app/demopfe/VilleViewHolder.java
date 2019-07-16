package com.app.demopfe;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.app.demopfe.Utils.getPicture;

class VilleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ClickItem clickItem;
    private int position;

    public VilleViewHolder(View view, ClickItem clickItem) {
        super(view);

        this.clickItem = clickItem;
        view.setOnClickListener(this);
    }

    public void fillVille(Ville ville, int position) {
        this.position = position;
        ((TextView) itemView.findViewById(R.id.name_city)).setText(ville.getNom());
        ((ImageView) itemView.findViewById(R.id.image)).setImageResource(getPicture(position));

    }
    @Override
    public void onClick(View v) {
        clickItem.onClickItem(position);
    }

    interface ClickItem {
        void onClickItem(int position);
    }
}
