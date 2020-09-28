package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtNila, edtNilb;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNila = (EditText) findViewById((R.id.edtNila));
        edtNilb = (EditText) findViewById((R.id.edtNilb));
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilA = Integer.parseInt(edtNila.getText().toString());
                int nilb = Integer.parseInt(edtNilb.getText().toString());

                int Hasil = nilA + nilb;
                txtHasil.setText(String.valueOf(Hasil));
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nilA = Integer.parseInt(edtNila.getText().toString());
                        int nilb = Integer.parseInt(edtNilb.getText().toString());

                        int Hasil = nilA - nilb;
                        txtHasil.setText(String.valueOf(Hasil));
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilA = Integer.parseInt(edtNila.getText().toString());
                int nilb = Integer.parseInt(edtNilb.getText().toString());

                int Hasil = nilA * nilb;
                txtHasil.setText(String.valueOf(Hasil));
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilA = Integer.parseInt(edtNila.getText().toString());
                int nilb = Integer.parseInt(edtNilb.getText().toString());

                int Hasil = nilA / nilb;
                txtHasil.setText(String.valueOf(Hasil));
            }
        });
    }
}