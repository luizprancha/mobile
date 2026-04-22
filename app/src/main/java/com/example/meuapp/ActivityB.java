package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class ActivityB extends AppCompatActivity {

    Button fechar;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b);
        fechar = findViewById(R.id.fechar);
        tv = findViewById(R.id.textView);

        Intent i= getIntent();
        Bundle b = i.getExtras();
        String msg = b.getString("msg");
//      String txt=getIntent().getExtras().getString( "msg");

        tv.setText(msg);

        fechar.setOnClickListener(v -> {
            finish();
        });

    }
}