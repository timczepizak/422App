package com.example.cs422layne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;

public class PreferencesActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);


        Button saveBtn = findViewById(R.id.PrefSaveButton);
        saveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(PreferencesActivity.this, MapsActivity.class));
            }

        });



    }


}
