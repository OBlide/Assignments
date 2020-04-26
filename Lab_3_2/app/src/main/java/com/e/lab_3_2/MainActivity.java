package com.e.lab_3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.mapBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = null;

                   intent=new Intent(android.content.Intent.ACTION_VIEW);
                   intent.setData(Uri.parse("geo:65.0593177,25.4641048"));
                   startActivity(intent);

            }
        });

        button = (Button) findViewById(R.id.callBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+358 55 555 55"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.webBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserInternet=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oamk.fi/fi/koulutus"));
                startActivity(browserInternet);
            }
        });


    }
}
