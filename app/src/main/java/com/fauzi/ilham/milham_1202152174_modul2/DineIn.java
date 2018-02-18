package com.fauzi.ilham.milham_1202152174_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner spinner;
    TextView textView;
    String[] nomeja;
    public Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.noMeja);
        b2 = (Button) findViewById(R.id.btn_pilih);
        nomeja = getResources().getStringArray(R.array.nomeja);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(), "Meja " + parent.getItemAtPosition(position) + " telah terpilih", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(DineIn.this, DaftarMenu.class);
                startActivity(move);
            }
        });
    }

    }

