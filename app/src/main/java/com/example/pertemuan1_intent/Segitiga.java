package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText a,t;
    Button jumlah;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        a = (EditText)findViewById(R.id.input_alas);
        t = (EditText)findViewById(R.id.input_tinggi);
        jumlah = (Button) findViewById(R.id.btn_jumlah);
        hasil = (TextView)findViewById(R.id.output_hasil);

        jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if (a.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double a, double t){return a*t*0.5;}
}