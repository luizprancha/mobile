package com.example.mainactivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //File f;
        //f = ./res/Layout;
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        //Button b = new Button( this);
        //b.setText("asdf");
        //setContentView(b);

    }
}