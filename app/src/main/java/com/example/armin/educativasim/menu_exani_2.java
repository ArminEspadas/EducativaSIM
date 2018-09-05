package com.example.armin.educativasim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by armin on 04/09/2018.
 */

public final class menu_exani_2 extends AppCompatActivity {


    private ImageButton btn_secciones, btn_practica, btn_simulacion;
    private int request_code=1, request_code2=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exani_1);


        btn_secciones= (ImageButton) findViewById(R.id.btn_seccion_exani1);
        btn_practica= (ImageButton) findViewById(R.id.btn_practicas_exani1);
        btn_simulacion= (ImageButton) findViewById(R.id.btn_simulacion_exani1);

        btn_secciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), secciones_exani.class);
                i.putExtra(menu_exani_1.EXANI_1, 2 );
                startActivityForResult(i, request_code);

            }
        });

        btn_practica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Activity_pregunta.class);
                i.putExtra(menu_exani_1.EXANI_1, 2 );
                startActivityForResult(i, request_code2);

            }
        });


    } //on create end

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu4,menu);

        return true;

    }


    @Override
    public void onBackPressed() {


        super.onBackPressed();
        //  moveTaskToBack(true);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



    }




}
