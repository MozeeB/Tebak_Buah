package com.example.mozeeb.buahapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class apel extends AppCompatActivity {
    //
    EditText b;
    Button proses;
    TextView hasil;
    String benar = "apel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apel);
        //
        b =(EditText)findViewById(R.id.buah);
        proses =(Button)findViewById(R.id.proses);
        hasil =(TextView)findViewById(R.id.hasil);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.length()==0){
                    Toast.makeText(getApplication(), "Nama Buah Harus isi", Toast.LENGTH_LONG).show();
                }else{
                    String jawaban = b.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda Benar";
                        hasil.setText(keterangan);
                    }else {
                        String keterangan = "Anda Salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });

    }}
