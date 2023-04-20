package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
    Button boton;
    ImageView imageView_2 ,imageView_3 ,  imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        referencia();


        Button jugar = (Button) findViewById(R.id.boton);
        jugar.setOnClickListener( (v)->{
            Intent jugar1 = new Intent(MainActivity6.this, MainActivity.class);
            startActivity(jugar1);
        });

    }

    private void referencia() {
        boton = findViewById(R.id.boton);
        imageView_2 = findViewById(R.id.imageView_2);
        imageView_3 = findViewById(R.id.imageView_3);
        imageView1=findViewById(R.id.imgview1);

    }

    public void facebook(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://facebook.com/"));
        startActivity(intent);
    }
    public void whatsapp(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://web.whatsapp.com/"));
        startActivity(intent);
    }
    public void googlemaps(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://es-la.facebook.com/"));
        startActivity(intent);
    }
    public void correo(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,"ASUNTO");
        intent.putExtra((Intent.EXTRA_TEXT),"HOLA COMO ESTAN");
    }
}