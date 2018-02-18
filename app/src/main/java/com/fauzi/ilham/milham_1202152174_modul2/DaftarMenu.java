package com.fauzi.ilham.milham_1202152174_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> foto;
    private RecyclerView.LayoutManager layoutManager;
    private TextView x, y ;

    private String[] judul = {"Cumi Lezat!", "Udang Lezat!", "Kepiting Lezat!", "Kerang Lezat!"};
    private String[] harga = {"Rp. 40.000", "Rp. 50.000", "Rp. 80.000", "Rp. 55.000"};
    private int[] Foto = {R.drawable.cumi, R.drawable.udang, R.drawable.kepiting, R.drawable.kerang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //mendeklarasikan array list untuk menu
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        foto = new ArrayList<>();
        DaftarItem();

        recyclerView = (RecyclerView) findViewById(R.id.recylceview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MyAdapter( dataMenu, dataHarga, foto);
        recyclerView.setAdapter(adapter);

    }
    //untuk mengambil data
    private void DaftarItem() {
        for (int w=0; w<judul.length; w++){
            dataMenu.add(judul[w]);
            dataHarga.add(harga[w]);
            foto.add(Foto[w]);
        }
    }
}
