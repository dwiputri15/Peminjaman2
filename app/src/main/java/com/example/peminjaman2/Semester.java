package com.example.peminjaman2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Semester extends AppCompatActivity {

    Spinner smstr, matkul;
    Button btn_selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        smstr = findViewById(R.id.spiner_smstr);
        matkul = findViewById(R.id.spinner_matkul);
        btn_selanjutnya = findViewById(R.id.selanjutnya_semester);

        btn_selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester.this,Alat.class);
                startActivity(intent);
            }
        });
    }
}