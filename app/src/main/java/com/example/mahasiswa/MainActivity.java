package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mahasiswaBtn = findViewById(R.id.btnMahasiswa);
        Button ListButton = findViewById(R.id.btnList);
        Button btnKelola = findViewById(R.id.btnKelola);
        btnKelola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,KelolaMahasiswaActivity.class);
                startActivity(i);
            }
        });

        mahasiswaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        ListButton.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);

            }
        });
        }
    }


