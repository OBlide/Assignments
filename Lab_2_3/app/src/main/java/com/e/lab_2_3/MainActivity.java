package com.e.lab_2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<AddCountry> AddCountry = new ArrayList<AddCountry>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.add_button).setOnClickListener(this);

        final String[] COUNTRIES = new String[]{
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
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_button) {
            EditText editor = findViewById(R.id.text_editor);
            String text = editor.getText().toString();
            AddCountry newItem = new AddCountry();
            newItem.setItemText(text);
            AddCountry.add(newItem);
            updateListUi();

        }
    }

    public class Animal {
        String color;
        public void eat() {}
    }


    public class Dog extends Animal {
        String breed;
        public void bark() {}
    }
    public class Cat extends Animal {
        int age;
        public void purr() {}
    }
    

    private void updateListUi() {
        ListView country_list_view = findViewById(R.id.country_list_view);

        ArrayList<String> itemTexts =new ArrayList<String>();
        for (int i = 0; i < AddCountry.size(); i++) {
            itemTexts.add(AddCountry.get(i).getItemText());
        }

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, itemTexts);

        country_list_view.setAdapter(countryAdapter);
    }
}
