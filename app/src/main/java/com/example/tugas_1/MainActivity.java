package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btPythagoras, btKalkulator, btMinMax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPythagoras=(Button) findViewById(R.id.buttonPythagoras);
        btMinMax=(Button) findViewById(R.id.buttonMinMax);
        btKalkulator=(Button) findViewById(R.id.buttonKalkulator);

        btMinMax.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent=new Intent(MainActivity.this,MinMaxActivity.class);
                startActivity(intent);
            }
        });
        btPythagoras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent=new Intent(MainActivity.this,PythagorasActivity.class);
                startActivity(intent);
            }
        });
        btKalkulator.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent=new Intent(MainActivity.this,KalkulatorActivity.class);
                startActivity(intent);
            }
        });
    }
}