package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listView);

        PlanetaController pcontroler=new PlanetaController();

        AdapterPlaneta adaptador = new AdapterPlaneta(
                this,
                //redssfghç
                pcontroler.listaPlanetas();
        )

        lv.setAdapter(adaptador);
    }
}