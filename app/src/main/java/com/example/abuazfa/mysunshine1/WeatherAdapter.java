package com.example.abuazfa.mysunshine1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Abu Azfa on 13/08/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contenView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_list_layout,parent,false);
        return new WeatherViewHolder(contenView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final CardView mWeatherCartView;
        private final TextView
        mWeatherDay,
        mWeatherStatus,
        mWeatherTmperature;


        public WeatherViewHolder(View itemView) {
            super(itemView);
            mWeatherCartView=(CardView) itemView.findViewById(R.id.cv_weather_list);
            mWeatherDay=(TextView) itemView.findViewById(R.id.tv_list_weather_day);
            mWeatherStatus=(TextView) itemView.findViewById(R.id.tv_list_weather_status);
            mWeatherTmperature=(TextView)  itemView.findViewById(R.id.tv_list_weather_temperature);

            mWeatherDay.setText(mWeatherDay.getText());
            mWeatherStatus.setText(mWeatherStatus.getText());
            mWeatherTmperature.setText(mWeatherTmperature.getText());

           mWeatherCartView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(v.getContext(), "Position =" + position, Toast.LENGTH_SHORT).show();


        }
    }
}
