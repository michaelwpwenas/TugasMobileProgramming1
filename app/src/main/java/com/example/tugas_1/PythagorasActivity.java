package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PythagorasActivity extends AppCompatActivity {
    Button btHitung;
    EditText etAB,etAC,etBC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythagoras);

        etAB=(EditText) findViewById(R.id.editTextAB);
        etAC=(EditText) findViewById(R.id.editTextAC);
        etBC=(EditText) findViewById(R.id.editTextBC);
        btHitung=(Button) findViewById(R.id.buttonHitungPythagoras);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float AB=Float.parseFloat(etAB.getText().toString());
                float AC=Float.parseFloat(etAC.getText().toString());
                double hasil=Math.sqrt(Math.pow(AB,2)+Math.pow(AC,2));
                etBC.setText(String.valueOf(hasil));
            }
        });
    }
}