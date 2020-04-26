package com.e.lab_3_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View view;
    ImageView btnImg;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.species_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {
        switch (item.getItemId()) {

            case R.id.mammalsAnimal:
                ((ImageView)findViewById(R.id.picView1)).setImageResource(R.drawable.bear);
                btnImg = (ImageView)findViewById(R.id.picView1);
                final MediaPlayer mpb =MediaPlayer.create(this, R.raw.bear);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpb.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView2)).setImageResource(R.drawable.wolf);
                btnImg = (ImageView)findViewById(R.id.picView2);
                final MediaPlayer mpw =MediaPlayer.create(this, R.raw.wolf);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpw.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView3)).setImageResource(R.drawable.elephant);
                btnImg = (ImageView)findViewById(R.id.picView3);
                final MediaPlayer mpe =MediaPlayer.create(this, R.raw.elephant);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpe.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView4)).setImageResource(R.drawable.lamb);
                btnImg = (ImageView)findViewById(R.id.picView4);
                final MediaPlayer mpl =MediaPlayer.create(this, R.raw.lamb);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpl.start();
                    }
                });
                return true;

            case R.id.birdAnimal:
                ((ImageView)findViewById(R.id.picView1)).setImageResource(R.drawable.img_huuhkaja);
                btnImg = (ImageView)findViewById(R.id.picView1);
                final MediaPlayer mp1 =MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp1.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView2)).setImageResource(R.drawable.peippo);
                btnImg = (ImageView)findViewById(R.id.picView2);
                final MediaPlayer mp2 =MediaPlayer.create(this, R.raw.peippo_chaffinch);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp2.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView3)).setImageResource(R.drawable.peukaloinen);
                btnImg = (ImageView)findViewById(R.id.picView3);
                final MediaPlayer mp3 =MediaPlayer.create(this, R.raw.peukaloinen_wren);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp3.start();
                    }
                });

                ((ImageView)findViewById(R.id.picView4)).setImageResource(R.drawable.punatulkku);
                btnImg = (ImageView)findViewById(R.id.picView4);
                final MediaPlayer mp4 =MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
                btnImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp4.start();
                    }
                });
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
