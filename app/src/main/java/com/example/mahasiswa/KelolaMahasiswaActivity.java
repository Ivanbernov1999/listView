package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class KelolaMahasiswaActivity extends AppCompatActivity {

    String[] items={"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan",

            "Immanuel Harold Maga", "Eben Haezer Gultom",
            "Brian Eldrin Sombuk", "Yosua Erick Gunawan", "Yosua Erick Gunawan",
            "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari",
            "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha", "Lionrico Sanjay Exauvida Jeipy",
            "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased",
            "Valeriana Tanesha Indra S", "Ivan Bernov", "Friska F. Nainggolan",
            "Grace Hutabarat","Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_mahasiswa);

        ListView lv = (ListView)findViewById(R.id.lvlkelmhs);


        Button btnUpdate =findViewById(R.id.btnUpdate);
        Button btnInsert = findViewById(R.id.btnAdd);

        lv.setAdapter(new ArrayAdapter<String>(KelolaMahasiswaActivity.this,android.R.layout.simple_list_item_1,items));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(KelolaMahasiswaActivity.this,"Anda memilih " +
                        items[position], Toast.LENGTH_LONG).show();
            }
        });


        btnUpdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(KelolaMahasiswaActivity.this,EditActivity.class);
                startActivity(i);
            }
        });
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KelolaMahasiswaActivity.this,AddActivity.class);
                startActivity(i);
            }
        });
    }
}
