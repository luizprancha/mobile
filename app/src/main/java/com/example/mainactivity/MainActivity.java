package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    SQLiteDatabase db;
    ImageButton buttonSalvar;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSalvar = findViewById(R.id.imageButton);
        editText = findViewById(R.id.editText);

        buttonSalvar.setOnClickListener(v ->{
            ContentValues cv =new ContentValues();
            cv.put("titulo", editText.getText().toString());
            cv.put("nota", editText.getText().toString());
            db.insert("notas",null,cv);

        });

        db = openOrCreateDatabase("notas", MODE_PRIVATE, null);

        db.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, nota TEXT )");
//        String titulo="joão' ; TRUCATE TABLE;'";
//        sqLiteDatabase.execSQL("INSERT INTO notas VALUES (1, ' "+titulo+" ', '')");

//        ContentValues cv = new ContentValues();
//        cv.put("titulo", "joao");
//        cv.put("nota", "777777777777");
//        db.insert("notas", null, cv);


        Cursor c= db.rawQuery("SELECT id,id*10,titulo,nota FROM notas", null);
        c.moveToFirst();

        while (!c.isAfterLast()) {
            @SuppressLint("Range") int id = c.getInt(c.getColumnIndex("id"));
            @SuppressLint("Range") String titulo = c.getString(c.getColumnIndex("titulo"));
            @SuppressLint("Range") String nota = c.getString(c.getColumnIndex("nota"));
            Log.d("SELECT", Integer.toString(id) + "," + titulo + "," + nota);
            c.moveToNext();
        }
    }
}