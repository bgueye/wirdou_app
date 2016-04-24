package com.gueyendongo.wirdou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Get a new instance of Calendar
        final Calendar c= Calendar.getInstance();
        int hourOfDay = c.get(c.HOUR_OF_DAY); //Current Hour
        int minute = c.get(c.MINUTE); //Current Minute
        int second = c.get(c.SECOND); //Current Second

        //Get the widgets reference from XML layout
        final TextView tv = (TextView) findViewById(R.id.tv);
        TimePicker tp = (TimePicker) findViewById(R.id.tp);

        //Display the TimePicker initial time
        tv.setText("Initial Time\nH:M:S | " + hourOfDay + ":" + minute + ":" + second);

        //Set a TimeChangedListener for TimePicker widget
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                //Display the new time to app interface
                tv.setText("Time changed\nH:M | "+hourOfDay + ":" + minute);
            }
        });
    }
}
