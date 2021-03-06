package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.PopupMenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText Nama, Mail, Telephone, Password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Password = findViewById(R.id.editPass);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (Nama.getText().toString().equals("") && Mail.getText().toString().equals("") && Telephone.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Isi Semua Data!", Toast.LENGTH_LONG).show();
                }
                else if (Nama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nama Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                }
                else if (Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Password Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.A){
            startActivity(new Intent(this, Menu1.class));
        }else if (item.getItemId() == R.id.B){
            startActivity(new Intent(this, Menu2.class));
        }else if (item.getItemId() == R.id.C){
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }
}
