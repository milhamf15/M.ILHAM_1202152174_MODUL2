package com.fauzi.ilham.milham_1202152174_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {

public Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        b2 = (Button) findViewById(R.id.pilihpesanan);
    }

    public void move(View view) {
        Intent move = new Intent(TakeAway.this, DaftarMenu.class);
        startActivity(move);
    }
}

