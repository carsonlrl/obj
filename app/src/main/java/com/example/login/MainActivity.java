package com.example.login;

import android.content.Intent;
import android.os.VibrationEffect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo de los boton siguiente

    public void Siguiente (View view) {
        Intent siguiente = new Intent(this, segundoactivity.class);
        startActivity(siguiente);
    }
}
