package com.e.lab_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class DisplayMessageActivity extends AppCompatActivity {


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        final TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        int setTimer = Integer.parseInt(message) * 1000;

        new CountDownTimer(setTimer, 1000) {

            public void onTick(long millisUntilFinished) {
                long textField = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);
                textView.setText(String.valueOf(textField));
            }

            public void onFinish() {

                textView.setText("Times up!");
                Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone nSound = RingtoneManager.getRingtone(getApplicationContext(), notification);
                nSound.play();
                finish();

            }

        }.start();
    }
}
