package com.e.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] COUNTRIES = new String[] {
                "Albania", "Argentina", "Armenia", "Belgium", "Brazil", "Bulgaria",
                "Canada", "China", "Colombia", "Croatia", "Denmark", "Dominican Republic",
                "Egypt", "Estonia", "Finland", "France", "Germany", "Greece", "Guyana",
                "Haiti", "Hungary", "Iceland", "India", "Ireland", "Italy", "Jamaica", "Japan",
                "Korea", "Latvia", "Liechtenstein", "Luxembourg", "Mexico", "Netherlands",
                "New Zealand", "Norway", "Oman", "Poland", "Portugal", "Qatar", "Romania",
                "Russia", "Sweden", "Thailand", "Turkey", "Ukraine", "United Kingdom",
                "Venezuela", "Vietnam", "Yemen", "Zimbabwe"
        };
        ListView myListView = (ListView) findViewById(R.id.country_list_view);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);

    }
}
