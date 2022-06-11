package com.example.peminjaman2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginMhs extends AppCompatActivity {

    EditText nama,nim,kelas,prodi,kelompok;
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mhs);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        kelas = findViewById(R.id.kelas);
        prodi = findViewById(R.id.prodi);
        kelompok = findViewById(R.id.kelompok);

        selanjutnya = findViewById(R.id.btlogin);

        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ambilnama = nama.getText().toString();
                String ambilnim = nim.getText().toString();
                String ambilkelas = kelas.getText().toString();
                String ambilprodi = prodi.getText().toString();
                String ambilkelompok = kelompok.getText().toString();

                Intent pindahintent = new Intent(LoginMhs.this,MainActivity2.class);
                startActivity(pindahintent);

            }
        });
    }
}