package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton = (Button) findViewById(R.id.rollButton);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        TextView title = (TextView) findViewById(R.id.title);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int randy = random.nextInt(seekBar.getProgress())+1;
                resultTextView.setText(String.valueOf(randy));
            }
        });
    }
}
