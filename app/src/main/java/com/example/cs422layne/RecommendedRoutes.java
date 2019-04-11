package com.example.cs422layne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RecommendedRoutes extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_routes);

        Button goBtn = findViewById(R.id.RMGoButton);
        goBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RecommendedRoutes.this, FakeActivity.class));
            }

        });

        Button ellip1Btn = findViewById(R.id.RMEllipses1Button);
        ellip1Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RecommendedRoutes.this, RouteOverview.class));
            }

        });
        Button ellip2Btn = findViewById(R.id.RMEllipses2Button);
        ellip2Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RecommendedRoutes.this, RouteOverview.class));
            }

        });
        Button ellip3Btn = findViewById(R.id.RMEllipses3Button);
        ellip3Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RecommendedRoutes.this, RouteOverview.class));
            }

        });

        View header = findViewById(R.id.RMheader);
        header.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RecommendedRoutes.this, MapsActivity.class));
            }
        });

    }
}
