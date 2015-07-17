package com.next.stormy.ui;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.next.stormy.R;
import com.next.stormy.adapters.DayAdapter;
import com.next.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {
    private Day[]  mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }

}