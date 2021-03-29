package com.praktikum.praktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button simpan, hapus;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpan = findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Data Tersimapan", Toast.LENGTH_LONG).show();
            }
        });
        hapus= findViewById(R.id.hapus);
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setTitle("Peringatan !!");

            alertDialogBuilder.setMessage("Apakah Anda Yakin ?")

            .setIcon(R.drawable.amikom)
            .setCancelable(false)
            .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"Data Terhapus", Toast.LENGTH_SHORT).show();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();

            alertDialog.show();
            }
        });
        pass = findViewById(R.id.pass);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass.getText().toString().length()==0){
                    pass.setError("Password Tidak Boleh Kosong");
                }else{
                    Toast.makeText(MainActivity.this,"Password Berhasil",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}