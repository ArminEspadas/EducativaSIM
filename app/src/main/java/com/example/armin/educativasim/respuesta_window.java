package com.example.armin.educativasim;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.armin.educativasim.Rededucativa.db.Inventory;
import com.example.armin.educativasim.Rededucativa.db.Preguntas;
import com.example.armin.educativasim.Rededucativa.db.Respuestas;
import com.example.armin.educativasim.Rededucativa.db.Solucion;

import java.util.List;

public class respuesta_window extends Activity {

    private Button btn_ok, btn_solucion;
    private int id_pregunta;
    private Inventory inventory;
    private Respuestas respuestas;
    private Solucion solucion;
    private TextView txt_solucion_descriptiva;
    private ImageView img_solucion;
    private LinearLayout linearLayout_solucion;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta_window);

        btn_ok = (Button) findViewById(R.id.btn_ok) ;
        btn_solucion = (Button) findViewById(R.id.btn_solucion) ;

        txt_solucion_descriptiva = (TextView) findViewById(R.id.txt_solucion_descriptiva) ;
        img_solucion = (ImageView) findViewById(R.id.img_solucion) ;
        linearLayout_solucion= (LinearLayout) findViewById(R.id.layout_solucion) ;
        scrollView = (ScrollView) findViewById(R.id.scroll_solucion);


        Intent intent_receive = getIntent();
        id_pregunta = intent_receive.getIntExtra(Activity_pregunta.ID_PREGUNTA,0);

      //  Toast.makeText(getApplicationContext(), String.valueOf(id_pregunta), Toast.LENGTH_SHORT).show();


        inventory = new Inventory(getApplicationContext());
        respuestas= inventory.getOneAnswer(String.valueOf(id_pregunta));
        solucion= inventory.getOneSolution(String.valueOf(id_pregunta));
        final int resID = getResources().getIdentifier(solucion.getImagen(), "drawable", getPackageName());


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


        btn_solucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // linearLayout_solucion.setVisibility(View.VISIBLE);

                if (scrollView.getVisibility()==View.VISIBLE){

                    scrollView.setVisibility(View.GONE);

                }else {
                    scrollView.setVisibility(View.VISIBLE);

                    if (respuestas.getImagen() == 1) {

                        img_solucion.setVisibility(View.VISIBLE);
                        txt_solucion_descriptiva.setText(solucion.getDescripcion());
                        img_solucion.setImageResource(resID);
                    }else{

                        img_solucion.setVisibility(View.GONE);
                        txt_solucion_descriptiva.setText(solucion.getDescripcion());

                    }

                } //end else


            }
        });





    } // end Oncreate
}
