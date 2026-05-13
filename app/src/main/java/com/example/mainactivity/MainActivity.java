package com.example.mainactivity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listView);

        PlanetaDAO.PlanetaController pcontroler=new PlanetaDAO.PlanetaController();

        AdapterPlaneta adaptador = new AdapterPlaneta(this, R.layout.item,
                pcontroler.listaPlanetas());

        lv.setAdapter(adaptador);


    }
}