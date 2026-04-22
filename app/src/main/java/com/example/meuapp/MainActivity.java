package com.example.meuapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button b;
    EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);

        editText = findViewById(R.id.editText);
        b = findViewById(R.id.botao);

        b.setOnClickListener(v ->{
            Intent i = new Intent(getApplicationContext(), ActivityB.class);
            String msg = editText.getText().toString();
            i.putExtra("msg", msg);
            startActivity(i);
        });



    }
}