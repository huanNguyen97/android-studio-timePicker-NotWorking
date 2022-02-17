package com.example.timerexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    // Data initialize
    TextView time;
    TimePicker simpleTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View's initialize
        time = findViewById(R.id.time);
        simpleTimePicker = (TimePicker) findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);

        // Perform set on the time change
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(
                TimePicker view,
                int hourOfDay,
                int minute
            ) {
                Toast.makeText(
                    getApplicationContext(),
                    hourOfDay + " " + minute,
                    Toast.LENGTH_SHORT
                ).show();
                time.setText("Time is: " + hourOfDay + minute);
            }
        });
    }
}