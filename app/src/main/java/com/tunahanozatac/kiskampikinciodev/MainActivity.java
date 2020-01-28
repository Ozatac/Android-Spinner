package com.tunahanozatac.kiskampikinciodev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        Bilgi b1 = new Bilgi("Tunaahan Özataç",25);
        Bilgi b2 = new Bilgi("Furkan Güleç",12);

        intent = new Intent(this,IkinciActivity.class);

        intent.putExtra("bilgi",b1);
        intent.putExtra("b2",b2);
        startActivity(intent);

    }

    public void onClickListe(View view) {

        Intent intent = new Intent(this,UcuncuActivity.class);
        startActivity(intent);
    }
}
