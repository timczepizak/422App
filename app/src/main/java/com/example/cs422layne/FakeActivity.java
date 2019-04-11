package com.example.cs422layne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FakeActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakeroute);


        Button help = findViewById(R.id.FakehelpButton);
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(FakeActivity.this, MapsActivity.class));
            }

        });

        Button menu = findViewById(R.id.FakesmenuButton);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(FakeActivity.this, MapsActivity.class));
            }

        });

    }

}
