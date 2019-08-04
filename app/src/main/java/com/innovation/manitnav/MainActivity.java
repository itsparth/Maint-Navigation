package com.innovation.manitnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner_source = (Spinner) findViewById(R.id.select_loaction_spinner);
        Spinner spinner_destination = (Spinner) findViewById(R.id.select_destination_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_source = ArrayAdapter.createFromResource(this, R.array.planets_array, R.layout.spinner_layout);
        adapter_source.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_source.setAdapter(adapter_source);
        ArrayAdapter<CharSequence> adapter_destination = ArrayAdapter.createFromResource(this, R.array.planets_array, R.layout.spinner_layout);
        adapter_destination.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_destination.setAdapter(adapter_destination);

    }
    public void buttonClick(View view){
        Intent intent = new Intent(this, MapView.class);
        startActivity(intent);
    }

}
