package com.example.mainactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button buttonAvancar, buttonVoltar;

    ImageView imageView;

    Integer imagens[] = new Integer[]{
            R.drawable.cachorro,
            R.drawable.gardem,
            R.drawable.happy,
            R.drawable.patinho,
            R.drawable.porquinho
    };
    int posicao=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonVoltar=findViewById(R.id.buttonVoltar);
        buttonAvancar=findViewById(R.id.buttonAvancar);
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(imagens[posicao]);

        buttonAvancar.setOnClickListener(v -> {
            posicao++;
            if (imagens.length ==posicao ){
                posicao = 0;
            }
            imageView.setImageResource(imagens[posicao]);
        });

        buttonVoltar.setOnClickListener(v -> {
            posicao--;
            if (posicao <=0 ) {
                posicao = imagens.length-1;
            }
            imageView.setImageResource(imagens[posicao]);

        });

    }
}