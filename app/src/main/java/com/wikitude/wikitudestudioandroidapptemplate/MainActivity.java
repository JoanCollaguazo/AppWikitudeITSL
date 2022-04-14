package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView cardInicio,cardServicio, cardContactos, cardInstitucion, cardMallaCurricular, cardAcercade ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //OCULTAR ACTION BAR
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DEFINIR CARDS:
        cardInicio = (CardView) findViewById(R.id.cardINICIO);
        cardServicio = (CardView) findViewById(R.id.SERVICIO);
        cardContactos = (CardView) findViewById(R.id.CONTACTOS);
        cardInstitucion = (CardView) findViewById(R.id.INSTITUCION);
        cardMallaCurricular = (CardView) findViewById(R.id.MALLACURRICULAR);
        cardAcercade = (CardView) findViewById(R.id.ACERCADENOSOTROS);

        //AÑADIR CLICK A LAS CARDS
        cardInicio.setOnClickListener(this);
        cardServicio.setOnClickListener(this);
        cardContactos.setOnClickListener(this);
        cardInstitucion.setOnClickListener(this);
        cardMallaCurricular.setOnClickListener(this);
        cardAcercade.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //CON ESTE CODIGO PUEDO DAR FUNCION A LOS CARDS USANDO SWITCH
        //case R.id.cardINICIO: Toast.makeText(getApplicationContext(), "BOTON 1", Toast.LENGTH_SHORT).show();

        Intent i;

        switch (view.getId()){
                //CASO 1 - card 1
            case R.id.cardINICIO: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;
                //CASO 2 - card 2
            case R.id.SERVICIO: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;
                //CASO 3 - card 3
            case R.id.CONTACTOS: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;
                //CASO 4 - card 4
            case R.id.INSTITUCION: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;
                //CASO 5 - card 5
            case R.id.MALLACURRICULAR: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;
                //CASO 6 - card 6
            case R.id.ACERCADENOSOTROS: i = new Intent(this,RuntimePermissionRequestActivity.class);
                startActivity(i);
                break;

            default: break;
        }

    }
}