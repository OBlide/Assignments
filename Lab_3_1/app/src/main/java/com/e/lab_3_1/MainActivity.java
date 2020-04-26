package com.e.lab_3_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

View view;
TextView message;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {
        switch (item.getItemId()) {

            case R.id.colorRed:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.red);
                TextView redText = (TextView) findViewById(R.id.colorText);
                String redMessage = getString(R.string.red);
                redText.setText(redMessage);
                return true;

            case R.id.colorGreen:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.green);
                TextView greenText = (TextView) findViewById(R.id.colorText);
                String greenMessage = getString(R.string.green);
                greenText.setText(greenMessage);
                return true;

            case R.id.colorBlue:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.blue);
                TextView blueText = (TextView) findViewById(R.id.colorText);
                String blueMessage = getString(R.string.blue);
                blueText.setText(blueMessage);
                return true;

            case R.id.colorYellow:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.yellow);
                TextView yellowText = (TextView) findViewById(R.id.colorText);
                String yellowMessage = getString(R.string.yellow);
                yellowText.setText(yellowMessage);
                return true;

            default:
                return super.onOptionsItemSelected(item);
    }

    }
}
