package com.lebudev.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView forecast_listview = (ListView) findViewById(R.id.lv_forecast);

        String[] forecast_array = {
                "Monday - Cloudy - 18/26",
                "Today - Sunny - 17/28",
                "Tomorrow - Foggy - 16/23",
                "Wednesday - Rainy - 15/24",
                "Thursday - Sunny - 19/27",
                "Friday - Heavy rain - 15/23",
                "Saturday - Hurricane - 15/19",
                "Sunday - Armageddon - 38/42"};

        List forecast_list = new ArrayList<>(Arrays.asList(forecast_array));

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.forecast_list_item, R.id.tv_forecast_list_item, forecast_list);
        forecast_listview.setAdapter(adapter);

    }
}
