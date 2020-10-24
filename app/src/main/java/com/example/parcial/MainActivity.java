package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ImageView btn1, btn2, btn3, btn4;
    private TextView tv1, tv2;
    private int puntaje, estadoAnt, estadoAct;
    private boolean complete;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntaje = 0;
        estadoAnt = 0;
        estadoAct = 0;
        complete = false;
        btn1 = (ImageView)findViewById(R.id.iv1);
        btn2 = (ImageView)findViewById(R.id.iv2);
        btn3 = (ImageView)findViewById(R.id.iv3);
        btn4 = (ImageView)findViewById(R.id.iv4);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
    }

    public void Animalciervo1(View view)
    {
        btn1.setImageResource(R.mipmap.ciervo);
        estadoAct = 1;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 100)
            {
                Intent nextlevel = new Intent(this, level2.class);
                startActivity(nextlevel);
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 1)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn1.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 1;
        }
    }

    public void Animalperro1(View view)
    {
        btn2.setImageResource(R.mipmap.perro);
        estadoAct = 2;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 100)
            {
                Intent nextlevel = new Intent(this, level2.class);
                startActivity(nextlevel);
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 2)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn2.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else
        {
            estadoAnt = 2;
        }
    }

    public void Animalciervo2(View view)
    {
        btn3.setImageResource(R.mipmap.ciervo);
        estadoAct = 1;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 100)
            {
                Intent nextlevel = new Intent(this, level2.class);
                startActivity(nextlevel);
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 1)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn3.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else
        {
            estadoAnt = 1;
        }
    }

    public void Animalperro2(View view)
    {
        btn4.setImageResource(R.mipmap.perro);
        estadoAct = 2;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 100)
            {
                Intent nextlevel = new Intent(this, level2.class);
                startActivity(nextlevel);
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 2)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn4.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else
        {
            estadoAnt = 2;
        }
    }
}