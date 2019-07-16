package com.app.demopfe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import static com.app.demopfe.Utils.getPicture;
import static com.app.demopfe.Utils.getVilles;

public class DetailCityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_city);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_white_24);
        int ville = getIntent().getIntExtra("VILLE", 0);
        Ville v = getVilles(this).get(ville);
        getSupportActionBar().setTitle(v.getNom());
        ((TextView) findViewById(R.id.name_city)).setText(v.getNom());
        ((TextView) findViewById(R.id.description_city)).setText(v.getDescription());
        String placeToVisite = "";
        for (Recommmendation r : v.getRecommendation()
        ) {
            placeToVisite = placeToVisite.concat(r.getPlace() + "\n");
        }
        ((TextView) findViewById(R.id.description_places)).setText(placeToVisite);
        ((ImageView)findViewById(R.id.principal_pic)).setImageResource(getPicture(ville));
        ((ImageView)findViewById(R.id.pic1)).setImageResource(getPicture(Integer.valueOf(v.getPicture1())));
        ((ImageView)findViewById(R.id.pic2)).setImageResource(getPicture(Integer.valueOf(v.getPicture2())));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);

    }
}
