package com.example.mozeeb.buahapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt_tebak(View view){
        Toast.makeText(MainActivity.this, "Aplikasi Mengenal Buah", Toast.LENGTH_LONG).show();
    }
    public void bt_jeruk(View view){
        Intent j = new Intent(MainActivity.this, jeruk.class);
        startActivity(j);
    }
    public void bt_nanas(View view){
        Intent n = new Intent(MainActivity.this, nanas.class);
        startActivity(n);
    }
    public void bt_apel(View view){
        Intent a = new Intent(MainActivity.this, apel.class);
        startActivity(a);
    }
    public void bt_anggur(View view){
        Intent ag = new Intent(MainActivity.this, anggur.class);
        startActivity(ag);
    }
}
