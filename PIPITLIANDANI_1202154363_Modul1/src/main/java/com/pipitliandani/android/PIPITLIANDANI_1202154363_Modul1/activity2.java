package com.pipitliandani.android.PIPITLIANDANI_1202154363_Modul1;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by User on 02/02/2018.
 */

public class activity2 extends MainActivity{
    TextView txtMakan, txtPorsi, txtHarga;
    double tvHarga;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String type = intent.getStringExtra("type");
        Context context = getApplicationContext();
        CharSequence msg = "";

        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TWO);
        txtMakan = (TextView)findViewById(R.id.textViewMakan);
        txtPorsi = (TextView)findViewById(R.id.textViewPorsi);
        txtHarga = (TextView)findViewById(R.id.textViewHarga);
        if (type=="Eatbus"){
            tvHarga =  (Double.valueOf(message2)) * 50000.0;
            msg = "Jangan disini makan malamnya uang kamu tidak cukup";
        } else {
            tvHarga =  (Double.valueOf(message2)) * 30000.0;
            msg = "Disini aja makan malamnya";
            
        }
        Toast.makeText(context, msg , Toast.LENGTH_SHORT).show();
        txtMakan.setText(message);
        txtPorsi.setText(message2);
        txtHarga.setText(String.valueOf(tvHarga));

    }
}
