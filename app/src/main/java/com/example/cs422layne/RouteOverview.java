package com.example.cs422layne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RouteOverview extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_overview);

        Button roBackButton = findViewById(R.id.ROBackButton);
        roBackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteOverview.this, RecommendedRoutes.class));
            }

        });

        Button roGoButton = findViewById(R.id.ROGoButton);
        roGoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteOverview.this, FakeActivity.class));
            }

        });

        View header = findViewById(R.id.ROheader);
        header.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RouteOverview.this, MapsActivity.class));
            }
        });
    }
}
