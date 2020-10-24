package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class level2 extends AppCompatActivity {
    private ImageView btn1, btn2, btn3, btn4, btn5, btn6;
    private TextView tv1, tv2;
    private int puntaje, estadoAnt, estadoAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        puntaje = 0;
        estadoAnt = 0;
        estadoAct = 0;

        btn1 = (ImageView)findViewById(R.id.iv1);
        btn2 = (ImageView)findViewById(R.id.iv2);
        btn3 = (ImageView)findViewById(R.id.iv3);
        btn4 = (ImageView)findViewById(R.id.iv4);
        btn5 = (ImageView)findViewById(R.id.iv5);
        btn6 = (ImageView)findViewById(R.id.iv6);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
    }

    public void AnimalOso1(View view)
    {
        btn1.setImageResource(R.mipmap.oso);
        estadoAct = 1;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
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

    public void AnimalOso2(View view)
    {
        btn3.setImageResource(R.mipmap.oso);
        estadoAct = 1;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 1)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn3.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 1;
        }
    }

    public void AnimalMapache1(View view)
    {
        btn2.setImageResource(R.mipmap.mapache);
        estadoAct = 2;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 2)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn2.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 2;
        }
    }

    public void AnimalMapache2(View view)
    {
        btn4.setImageResource(R.mipmap.mapache);
        estadoAct = 2;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 2)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn4.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 2;
        }
    }

    public void Animalcuerpoespin1(View view)
    {
        btn5.setImageResource(R.mipmap.cuerpoespin);
        estadoAct = 3;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 3)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn5.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 3;
        }
    }

    public void Animalcuerpoespin2(View view)
    {
        btn6.setImageResource(R.mipmap.cuerpoespin);
        estadoAct = 3;

        if(estadoAnt == estadoAct)
        {
            puntaje = puntaje + 50;
            Toast.makeText(this, " Correcto !", Toast.LENGTH_SHORT).show();
            tv2.setText("Puntaje : " +String.valueOf(puntaje) );
            estadoAnt = 0;
            if(puntaje == 150)
            {
                Toast.makeText(this, " Felicidades termino el juego !", Toast.LENGTH_SHORT).show();
            }
        }
        else if(estadoAnt != 0 && estadoAnt != 3)
        {
            Toast.makeText(this, "Incorrecto: Vuelve a Intentar!..." , Toast.LENGTH_SHORT).show();
            btn6.setImageResource(R.mipmap.fondoi);
            //estadoAnt = 0;
        }
        else if(estadoAnt == 0)
        {
            estadoAnt = 3;
        }
    }
}