package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        referencia();
    }

    private void referencia() {
        boton = findViewById(R.id.boton);

    }

    public void facebook(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://facebook.com/"));
        startActivity(intent);
    }
    public void whatsapp(View view){
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("http://facebook.com/"));
        startActivity(intent);
    }
    public void googlemaps(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://facebook.com/"));
        startActivity(intent);
    }
    public void correo(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,"ASUNTO");
        intent.putExtra((Intent.EXTRA_TEXT),"HOLA COMO ESTAN");
    }
}