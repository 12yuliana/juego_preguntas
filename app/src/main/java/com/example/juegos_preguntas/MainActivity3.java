package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    //declaramos variables
    RadioGroup rgpregunta1;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    MediaPlayer sonido1, sonido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //referenciamos
        referencia();
    }
    private void referencia() {
        sonido1 = MediaPlayer.create(this,  R.raw.sonido1);
        sonido2 =MediaPlayer.create(this,  R.raw.sonido2);
        rgpregunta1=findViewById(R.id.rgpregunta1);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);

        rgpregunta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int chechedId) {
                switch (chechedId){
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity3.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        sonido2.start();

                        break;
                        case R.id.radioButton2:
                            Toast.makeText(MainActivity3.this,"Correcta",Toast.LENGTH_LONG).show();
                            Intent radioButton2 = new Intent(MainActivity3.this, MainActivity4.class);
                            startActivity(radioButton2);
                            sonido1.start();
                            MainActivity.punto=MainActivity.punto+1;
                            Toast.makeText(MainActivity3 .this,"El resultado es:"+MainActivity.punto,Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity3.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        sonido2.start();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity3.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        sonido2.start();
                        break;

                }

























































            }
        });
    }

}