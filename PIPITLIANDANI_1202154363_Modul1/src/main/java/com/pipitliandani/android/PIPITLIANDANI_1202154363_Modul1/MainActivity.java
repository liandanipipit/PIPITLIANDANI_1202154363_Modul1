package com.pipitliandani.android.PIPITLIANDANI_1202154363_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.pipitliandani.android.PIPITLIANDANI_1202154363_Modul1.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_TWO = "com.pipitliandani.android.PIPITLIANDANI_1202154363_Modul1.extra.MESSAGE_TWO";
    EditText edTxt1, edTxt2;
    Button btnEatbus, btnAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Log.d(LOG_TAG, "Button clicked!");
        edTxt1 = (EditText) findViewById(R.id.editTextMakanan);
        edTxt2 = (EditText) findViewById(R.id.editTextPorsi);
        btnEatbus = (Button) findViewById(R.id.buttonEatbus);
        btnAbnormal = (Button) findViewById(R.id.buttonAbnormal);

        btnEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity2.class);
                String menu = edTxt1.getText().toString();
                String porsi = edTxt2.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, menu);
                intent.putExtra(EXTRA_MESSAGE_TWO, porsi);
                intent.putExtra("type", "Eatbus");
                startActivity(intent);

            }

        });

        btnAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, activity2.class);
                String menu = edTxt1.getText().toString();
                String porsi = edTxt2.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, menu);
                intent.putExtra(EXTRA_MESSAGE_TWO, porsi);
                intent.putExtra("type", "Abnormal");
                startActivity(intent);

            }
        });

    }
}



