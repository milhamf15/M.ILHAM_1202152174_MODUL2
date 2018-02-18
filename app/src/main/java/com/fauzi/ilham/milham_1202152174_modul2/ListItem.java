package com.fauzi.ilham.milham_1202152174_modul2;

import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by ASUS on 18/02/2018.
 */

public class ListItem {

    private TextView cumi;
    private TextView udang;
    private TextView kepiting;
    private TextView kerang;

    public ListItem(TextView cumi, TextView udang, TextView kepiting, TextView kerang) {
        this.cumi = cumi;
        this.udang = udang;
        this.kepiting = kepiting;
        this.kerang = kerang;
    }

    public TextView getCumi() {
        return cumi;
    }

    public TextView getUdang() {
        return udang;
    }

    public TextView getKepiting() {
        return kepiting;
    }

    public TextView getKerang() {
        return kerang;
    }
}
