package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class segundoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundoactivity);
    }
    public void Siguiente (View view) {
        Intent siguiente = new Intent(this, terceractivity.class);
        startActivity(siguiente);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}
