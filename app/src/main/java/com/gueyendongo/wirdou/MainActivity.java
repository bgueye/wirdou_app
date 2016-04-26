package com.gueyendongo.wirdou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =   (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//Get a new instance of Calendar
        final Calendar c= Calendar.getInstance();
        int jour = c.get(c.DAY_OF_WEEK); //Jour de la semaine
        int day = c.get(c.DAY_OF_MONTH); //jour
        int mois = c.get(c.MONTH); //Mois
        int annee = c.get(c.YEAR); //année

        //Get the widgets reference from XML layout
        final TextView tv = (TextView) findViewById(R.id.tv);


        //Display the TimePicker initial time
        tv.setText("Date du jour\n" + jour + ", " + day + " " + mois + " " + annee );

    }
}
