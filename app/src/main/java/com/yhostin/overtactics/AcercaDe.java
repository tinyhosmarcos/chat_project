package com.yhostin.overtactics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        Bundle bundle = getIntent().getExtras();
        String contacts=bundle.getString("names_contacts");
        setTitle(contacts);
    }

    public void salir(View v) {
        finish();
    }
}