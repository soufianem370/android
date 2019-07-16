package com.app.demopfe;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class VilleAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private VilleViewHolder.ClickItem clickItem;

    VilleAdapter(VilleViewHolder.ClickItem clickItem) {
        this.clickItem = clickItem;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ville_item,viewGroup,false);
        return new VilleViewHolder(view,clickItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((VilleViewHolder)viewHolder).fillVille((list.get(position)),position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    private List<Ville> list;

    public void setList(List<Ville> list) {
        this.list = list;
    }

}
