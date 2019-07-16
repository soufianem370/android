package com.app.demopfe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import static com.app.demopfe.Utils.getVilles;

public class ListActivity extends AppCompatActivity implements VilleViewHolder.ClickItem {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toolbar toolbar=findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.title));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        VilleAdapter villeAdapter = new VilleAdapter(this);
        villeAdapter.setList(getVilles(this));
        recyclerView.setAdapter(villeAdapter);
    }

    @Override
    public void onClickItem(int position) {
        Intent eventIntent=new Intent(this, DetailCityActivity.class);
        eventIntent.putExtra("VILLE",position);
        startActivity(eventIntent);
    }
}
