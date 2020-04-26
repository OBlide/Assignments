package com.e.lab_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private int count = 0;
    Button gameButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(gameButton);

        count ++;

        Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button" + count);

    }

}
