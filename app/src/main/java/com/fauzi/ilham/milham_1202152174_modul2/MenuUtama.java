package com.fauzi.ilham.milham_1202152174_modul2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    RadioGroup g1;
    RadioButton dineIn, takeAway ;
    public Button b1;
    String button="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        g1=(RadioGroup) findViewById(R.id.g1);
        b1 = (Button)findViewById(R.id.btn_pesan);
        dineIn = (RadioButton) findViewById(R.id.dineIn);
        takeAway = (RadioButton) findViewById(R.id.takeAway);

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId==R.id.dineIn){
                    Toast.makeText(MenuUtama.this,"Dine In", Toast.LENGTH_SHORT).show();

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent move = new Intent(getApplicationContext(), DineIn.class);
                            startActivity(move);
                        }
                    });
                }

                if (checkedId==R.id.takeAway){
                    Toast.makeText(MenuUtama.this,"Take Away", Toast.LENGTH_LONG).show();

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent move = new Intent(MenuUtama.this, TakeAway.class);
                            startActivity(move);
                        }
                    });

                }
            }
        });
        Toast.makeText(this, "M.ILHAM_122152174", Toast.LENGTH_SHORT).show();
    }

}
