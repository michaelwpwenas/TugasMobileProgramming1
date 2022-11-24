package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MinMaxActivity extends AppCompatActivity {
    EditText etA,etB,etC,etD,etE,etF,etG,etH;
    Button btMin,btMax;
    TextView tvHasil;
    int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_max);

        etA=(EditText) findViewById(R.id.editTextA);
        etB=(EditText) findViewById(R.id.editTextTextB);
        etC=(EditText) findViewById(R.id.editTextC);
        etD=(EditText) findViewById(R.id.editTextTextD);
        etE=(EditText) findViewById(R.id.editTextE);
        etF=(EditText) findViewById(R.id.editTextTextF);
        etG=(EditText) findViewById(R.id.editTextG);
        etH=(EditText) findViewById(R.id.editTextTextH);

        btMin=(Button) findViewById(R.id.buttonMin);
        btMax=(Button) findViewById(R.id.buttonMax);

        tvHasil=(TextView) findViewById(R.id.textViewHasilMinMax);

        btMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                isiVariabel();
                int hasil = -1000000000;
                if (hasil<A){
                    hasil=A;
                }
                if (hasil<B){
                    hasil=B;
                }
                if (hasil<C){
                    hasil=C;
                }
                if (hasil<D){
                    hasil=D;
                }
                if (hasil<E){
                    hasil=E;
                }
                if (hasil<F){
                    hasil=F;
                }
                if (hasil<G){
                    hasil=G;
                }
                if (hasil<H){
                    hasil=H;
                }
                tvHasil.setText("Hasil : "+String.valueOf(hasil));
            }
        });

        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                isiVariabel();
                int min=0;
                min=Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(A,B),C),D),E),F),G);
                tvHasil.setText("Hasil : "+String.valueOf(min));
                    }
                });

        }

    void isiVariabel(){
        A=Integer.parseInt(etA.getText().toString());
        B=Integer.parseInt(etB.getText().toString());
        C=Integer.parseInt(etC.getText().toString());
        D=Integer.parseInt(etD.getText().toString());
        E=Integer.parseInt(etE.getText().toString());
        F=Integer.parseInt(etF.getText().toString());
        G=Integer.parseInt(etG.getText().toString());
        H=Integer.parseInt(etH.getText().toString());

    }
}