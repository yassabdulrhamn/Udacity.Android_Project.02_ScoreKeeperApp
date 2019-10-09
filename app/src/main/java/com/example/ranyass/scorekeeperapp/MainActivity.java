package com.example.ranyass.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Gools_A,Yellowc_A,Redc_A;
    TextView Gools_B,Yellowc_B,Redc_B;
    Button AddGool_A,AddYcard_A,AddRcard_A;
    Button AddGool_B,AddYcard_B,AddRcard_B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gools_A=(TextView)findViewById(R.id.Gools_A);
        Yellowc_A=(TextView)findViewById(R.id.Yellowc_A);
        Redc_A=(TextView)findViewById(R.id.Redc_A);
        Gools_B=(TextView)findViewById(R.id.Gools_B);
        Yellowc_B=(TextView)findViewById(R.id.Yellowc_B);
        Redc_B=(TextView)findViewById(R.id.Redc_B);

        AddGool_A=(Button)findViewById(R.id.AddGool_A);
        AddYcard_A=(Button)findViewById(R.id.AddYcard_A);
        AddRcard_A=(Button)findViewById(R.id.AddRcard_A);
        AddGool_B=(Button)findViewById(R.id.AddGool_B);
        AddYcard_B=(Button)findViewById(R.id.AddYcard_B);
        AddRcard_B=(Button)findViewById(R.id.AddRcard_B);


        AddGool_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gools_A.setText( String.valueOf(Integer.parseInt(Gools_A.getText().toString())+1));
            }
        });
        AddYcard_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yellowc_A.setText( String.valueOf(Integer.parseInt(Yellowc_A.getText().toString())+1));
            }
        });
        AddRcard_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redc_A.setText( String.valueOf(Integer.parseInt(Redc_A.getText().toString())+1));
            }
        });
        AddGool_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gools_B.setText( String.valueOf(Integer.parseInt(Gools_B.getText().toString())+1));
            }
        });
        AddYcard_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yellowc_B.setText( String.valueOf(Integer.parseInt(Yellowc_B.getText().toString())+1));
            }
        });
        AddRcard_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redc_B.setText( String.valueOf(Integer.parseInt(Redc_B.getText().toString())+1));
            }
        });

    }
}
