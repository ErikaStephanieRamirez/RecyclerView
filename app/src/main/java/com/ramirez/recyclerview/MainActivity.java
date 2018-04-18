package com.ramirez.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series=new ArrayList<>();

        rv=findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager=new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter=new SeriesAdapter(series);
        rv.setAdapter(adapter);
    }

    public void prepareSeries(){
        String TAG = "Mensaje";
        series=new ArrayList<>();
        series.add(new Serie("Coco", "13", R.drawable.coco, "Pelicula creada por Disney" ));
        series.add(new Serie("Hotel Transilvania", "13", R.drawable.hotel, "Pelicula creada por Disney" ));
        series.add(new Serie("Kung Fu Panda", "13", R.drawable.kfp, "Pelicula creada por DreamWold" ));

    }
}
