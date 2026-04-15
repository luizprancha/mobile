package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b);
        editText=findViewById(R.id.textView);
        b=findViewById(R.id.button);
        b.setOnClickListener( v -> {
            Intent i = new Intent(getApplicationContext(),ActivityB.class);
            String msg = editText.getText().toString();

            i.putExtra("msg",msg);
            startActivity(i);
        });



    }
}