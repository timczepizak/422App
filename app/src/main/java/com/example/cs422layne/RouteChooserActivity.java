package com.example.cs422layne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RouteChooserActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_chooser);

        Button nextButton = findViewById(R.id.RCNextButton);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteChooserActivity.this, RecommendedRoutes.class));
            }

        });

        Button preferenceBtn = findViewById(R.id.PreferencesButton);
        preferenceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteChooserActivity.this, PreferencesActivity.class));
            }

        });

        View header = findViewById(R.id.RCheader);
        header.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteChooserActivity.this, MapsActivity.class));
            }
        });
    }
}
