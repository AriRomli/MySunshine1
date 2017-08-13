package com.example.abuazfa.mysunshine1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mMainWeather;
    private TextView mMainWeatber;
    private RecyclerView mMainWeatberRv;
    private WeatherAdapter mMainWeatberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
    mMainWeatberRv = (RecyclerView)findViewById(R.id.rv_weather_list);

       //layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mMainWeatberRv.setLayoutManager(layoutManager);
        mMainWeatberRv.setHasFixedSize(true);
        mMainWeatberAdapter = new WeatherAdapter();
        mMainWeatberRv.setAdapter(mMainWeatberAdapter);


    }
}
