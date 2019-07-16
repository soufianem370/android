package com.app.demopfe;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

 class Utils {

     static List<Ville> getVilles(Context context){
        String filename = "villes.json";

        byte[] buffer = null;
        try (InputStream is = context.getAssets().open(filename)) {
            int size = is.available();
            buffer = new byte[size];
            is.read(buffer);

        } catch (IOException e) {
            Log.e("Erreur", e.getMessage());

        }
        // releases system resources associated with this stream
        assert buffer != null;


        try {
            return new Gson().fromJson(new String(buffer, "UTF-8"), new TypeToken<List<Ville>>() {}.getType());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }

    }
     static int getPicture(int position) {
         int drawable=0;
         switch (position) {
             case 0:
                 drawable= R.drawable.oujda;
                 break;
             case 1:
                 drawable= R.drawable.marrakech;
                 break;
             case 2:
                 drawable= R.drawable.rabat;
                 break;
             case 10:
                 drawable= R.drawable.oujda_10;
                 break;
             case 11:
                 drawable= R.drawable.oujda_11;
                 break;
             case 20:
                 drawable= R.drawable.kech_20;
                 break;
             case 21:
                 drawable= R.drawable.kech_21;
                 break;
             case 30:
                 drawable= R.drawable.rabat_30;
                 break;
             case 31:
                 drawable= R.drawable.rabat_31;
                 break;
             default:
                 return R.drawable.marrakech;
         }
         return drawable;
     }
}
