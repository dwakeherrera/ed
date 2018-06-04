package com.example.david.adivinanumero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Button bMas, bMenos, bComprobar;
    TextView tvNumero, tvTitulo;

    int numeroActual, numeroAdivinar, numeroIntentos;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        random = new Random();
        numeroAdivinar = random.nextInt(50) + 1;

        bComprobar = (Button) findViewById(R.id.bComprobar);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        tvNumero = (TextView) findViewById(R.id.tvNumero);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);

        numeroIntentos = 0;
        numeroActual = 0;
        tvNumero.setText("" + numeroActual);

        bComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroActual == numeroAdivinar) {
                    tvTitulo.setText(getString(R.string.texto_enhorabuena) + " " + numeroIntentos + " " + getString(R.string.texto_intentos));
                    bComprobar.setEnabled(false);
                    bMas.setEnabled(false);
                    bMenos.setEnabled(false);
                } else if (numeroActual > numeroAdivinar) {
                    tvTitulo.setText("Más bajo");
                    numeroIntentos++;
                } else if (numeroActual < numeroAdivinar) {
                    tvTitulo.setText("Más alto");
                    numeroIntentos++;
                }
            }
        });

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numeroActual < 50) {
                    numeroActual++;
                }
                tvNumero.setText("" + numeroActual);
            }
        });

        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numeroActual > 0) {
                    numeroActual--;
                }
                tvNumero.setText("" + numeroActual);
            }
        });
    }
}
