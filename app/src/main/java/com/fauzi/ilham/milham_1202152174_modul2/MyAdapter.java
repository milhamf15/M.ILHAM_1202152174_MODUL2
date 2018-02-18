package com.fauzi.ilham.milham_1202152174_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 18/02/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

  private ArrayList<String> recycleData, recycleHarga;
  private ArrayList<Integer> foto;

    public MyAdapter(ArrayList<String> recycleData, ArrayList<String> recycleHarga, ArrayList<Integer> foto) {
        this.recycleData = recycleData;
        this.recycleHarga = recycleHarga;
        this.foto = foto;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = recycleData.get(position);
        final String harga = recycleHarga.get(position);
        final Integer Test = foto.get(position);
        holder.Title.setText(name);
        holder.Subtitle.setText(harga);
        holder.i.setImageResource(Test);

    }

    @Override
    public int getItemCount() {
        return recycleData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String dan Integer untuk tiap item
        public TextView Title;
        public TextView Subtitle;
        public ImageView i;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            Title = (TextView) v.findViewById(R.id.tv_title);
            Subtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            i = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            //agar isi dari array nya dapat pindah layout dengan membawa data sesuai dibawah
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMenu.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",recycleData.get(getAdapterPosition()));
                            intent.putExtra("harga",recycleHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Cumi,Telur, Kecap Manis, Saos, rasa cinta, rasa sayang";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",recycleData.get(getAdapterPosition()));
                            intent.putExtra("harga",recycleHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Udang, Saos, pete, tomat, ";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("judul",recycleData.get(getAdapterPosition()));
                            intent.putExtra("harga",recycleHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Kepiting, Tepung, Margarin, Air Telur, Bumbu rahasia";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",recycleData.get(getAdapterPosition()));
                            intent.putExtra("harga",recycleHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Kerang, Saos, Margarin, bawang bombay, Bumbu rahasia";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
}
