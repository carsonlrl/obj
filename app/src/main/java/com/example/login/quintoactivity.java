package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quintoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quintoactivity);
    }
    public void Siguiente (View view) {
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
}
