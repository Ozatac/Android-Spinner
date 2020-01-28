package com.tunahanozatac.kiskampikinciodev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IkinciActivity extends AppCompatActivity {

    Intent intent;
    Bilgi bilgi ,b2;
    TextView tvSonuc, txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci);

        intent = getIntent();
        bilgi = intent.getParcelableExtra("bilgi");
        b2 = intent.getParcelableExtra("b2");

        tvSonuc = findViewById(R.id.tvSonuc);
        txtSonuc = findViewById(R.id.txtSonuc);

        tvSonuc.setText(bilgi.toString());
        txtSonuc.setText(b2.toString());
    }

    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        Toast.makeText(this, "Başarılı", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        finish();
    }
}
