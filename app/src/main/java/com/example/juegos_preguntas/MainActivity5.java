package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
        TextView textView_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        referencia();
    }

    private void referencia() {
        textView_1=findViewById(R.id.textView_1);
        textView_1.setText("los resultados son "+MainActivity.punto);
    }
}