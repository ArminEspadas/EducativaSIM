package com.example.armin.educativasim;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.armin.educativasim.Rededucativa.db.Categorias;
import com.example.armin.educativasim.Rededucativa.db.Cursos;
import com.example.armin.educativasim.Rededucativa.db.Inventory;
import com.example.armin.educativasim.Rededucativa.db.Opciones;
import com.example.armin.educativasim.Rededucativa.db.Preguntas;
import com.example.armin.educativasim.Rededucativa.db.Respuestas;

import java.util.List;
import java.util.Random;

public class Activity_pregunta extends AppCompatActivity {


    private LinearLayout linearLayout_a, linearLayout_b, linearLayout_c, linearLayout_d;
    private Inventory inventory;
    private EditText txt_pregunta;
    private int contador=0;
    private ImageButton btn_pregunta_atras, btn_pregunta_adelante;
    private ImageView img_pregunta, img_opcion_a,img_opcion_b,img_opcion_c,img_opcion_d;
    private TextView pregunta_a, pregunta_b, pregunta_c, pregunta_d, txt_seccion;
    private int Pregunta_ID=0;
    private Opciones opciones;
    private Respuestas respuestas;
    private static final int  A=1, B=2, C=3, D=4;
    private int request_code = 1;
    public static String ID_PREGUNTA="KEY_ID_PREGUNTA";
    private List<Preguntas> user_to_profiles;
    private Categorias categorias;
    private int random_select;
    private int ID_EXANI=0;
    private int ID_SECCCION=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);

        linearLayout_a = (LinearLayout) findViewById(R.id.layout_a);
        linearLayout_b = (LinearLayout) findViewById(R.id.layout_b);
        linearLayout_c = (LinearLayout) findViewById(R.id.layout_c);
        linearLayout_d = (LinearLayout) findViewById(R.id.layout_d);

        txt_pregunta = (EditText) findViewById(R.id.txt_pregunta);
        btn_pregunta_adelante = (ImageButton) findViewById(R.id.btn_pregunta_adelante);
        btn_pregunta_atras = (ImageButton) findViewById(R.id.btn_pregunta_atras);

        pregunta_a = (TextView) findViewById(R.id.txt_a);
        pregunta_b = (TextView) findViewById(R.id.txt_b);
        pregunta_c = (TextView) findViewById(R.id.txt_c);
        pregunta_d = (TextView) findViewById(R.id.txt_d);
        txt_seccion = (TextView) findViewById(R.id.text_seccion);

        img_pregunta = (ImageView) findViewById(R.id.img_pregunta);
        img_opcion_a = (ImageView) findViewById(R.id.img_opcion_a);
        img_opcion_b = (ImageView) findViewById(R.id.img_opcion_b);
        img_opcion_c = (ImageView) findViewById(R.id.img_opcion_c);
        img_opcion_d = (ImageView) findViewById(R.id.img_opcion_d);


        Intent intent_receive = getIntent();
        ID_EXANI = intent_receive.getIntExtra(menu_exani_1.EXANI_1, 0);
        ID_SECCCION = intent_receive.getIntExtra(secciones_exani.SECCION, 0);

      //generar orden aleatorio

      // random_select= (int) (Math.random()*4);
      // Random aleatorio = new Random(System.currentTimeMillis());
      // // Producir nuevo int aleatorio entre 0 y 99
      // int intAletorio = aleatorio.nextInt(4);

      // // Refrescar datos aleatorios
      // aleatorio.setSeed(System.currentTimeMillis());

       inventory = new Inventory(getApplicationContext());


       if (ID_EXANI==1){ // EXANI 1

           if (ID_SECCCION==0)
           {
               user_to_profiles = inventory.getAllFromCourse(String.valueOf(ID_EXANI));

           }else {

               user_to_profiles = inventory.getAllFromCourseAndCategory(String.valueOf(ID_EXANI), String.valueOf(ID_SECCCION));
           }

       }else if ( ID_EXANI==2){

           if (ID_SECCCION==0)
           {
               user_to_profiles = inventory.getAllFromCourse(String.valueOf(ID_EXANI));

           }else {

               user_to_profiles = inventory.getAllFromCourseAndCategory(String.valueOf(ID_EXANI), String.valueOf(ID_SECCCION));
           }
       }
       else if (ID_EXANI==3){

           if (ID_SECCCION==0)
           {
               user_to_profiles = inventory.getAllFromCourse(String.valueOf(ID_EXANI));

           }else {

               user_to_profiles = inventory.getAllFromCourseAndCategory(String.valueOf(ID_EXANI), String.valueOf(ID_SECCCION));
           }

       }





       Actualizar_pregunta();

      //  txt_pregunta.setText( user_to_profiles.get(contador).getDescripcion() );



        //____________________________________ ADELANTAAR PREGUNTA____________________________________________________________________________

        btn_pregunta_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  if (contador==0) { }
                else { contador--; }

                Actualizar_pregunta();


            }
        });

        btn_pregunta_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user_to_profiles.size()==contador+1)
                {
                    contador=0;
                }else {

                    contador++;

                }


                Actualizar_pregunta();

            }
        });





        //____________________________________OPCIONES A, B, C, D____________________________________________________________________________

        linearLayout_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                respuestas = inventory.getOneAnswer(String.valueOf(user_to_profiles.get(contador).getId()));
                // 1 A 2 B 3 C 4 D

                if ( respuestas.getRespuesta()==A)
                {

                    Intent i = new Intent(getApplicationContext(), respuesta_window.class);
                    i.putExtra(Activity_pregunta.ID_PREGUNTA, user_to_profiles.get(contador).getId());
                    startActivityForResult(i, request_code);

                    if (user_to_profiles.size()==contador+1)
                    {
                        contador=0;
                    }else {

                        contador++;

                    }

                    linearLayout_a.setBackgroundResource(R.drawable.round_correct);

                }else{
                  //  Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                    linearLayout_a.setBackgroundResource(R.drawable.round_wrong);

                }

            }
        });



        linearLayout_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                respuestas = inventory.getOneAnswer(String.valueOf(user_to_profiles.get(contador).getId()));
                // 1 A 2 B 3 C 4 D

                if ( respuestas.getRespuesta()==B)
                {
                    Intent i = new Intent(getApplicationContext(), respuesta_window.class);
                    i.putExtra(Activity_pregunta.ID_PREGUNTA, user_to_profiles.get(contador).getId());
                    startActivityForResult(i, request_code);

                    if (user_to_profiles.size()==contador+1)
                    {
                        contador=0;
                    }else {

                        contador++;

                    }

                    linearLayout_b.setBackgroundResource(R.drawable.round_correct);

                }else{
                  //  Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                    linearLayout_b.setBackgroundResource(R.drawable.round_wrong);

                }

            }
        });

        linearLayout_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                respuestas = inventory.getOneAnswer(String.valueOf(user_to_profiles.get(contador).getId()));
                // 1 A 2 B 3 C 4 D

                if ( respuestas.getRespuesta()==C)
                {
                    Intent i = new Intent(getApplicationContext(), respuesta_window.class);
                    i.putExtra(Activity_pregunta.ID_PREGUNTA, user_to_profiles.get(contador).getId());
                    startActivityForResult(i, request_code);

                    if (user_to_profiles.size()==contador+1)
                    {
                        contador=0;
                    }else {

                        contador++;

                    }
                    linearLayout_c.setBackgroundResource(R.drawable.round_correct);

                }else{
                    //Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                    linearLayout_c.setBackgroundResource(R.drawable.round_wrong);

                }

            }
        });

        linearLayout_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                respuestas = inventory.getOneAnswer(String.valueOf(user_to_profiles.get(contador).getId()));
                // 1 A 2 B 3 C 4 D

                if ( respuestas.getRespuesta()==D)
                {
                    Intent i = new Intent(getApplicationContext(), respuesta_window.class);
                    i.putExtra(Activity_pregunta.ID_PREGUNTA, user_to_profiles.get(contador).getId());
                    startActivityForResult(i, request_code);

                    if (user_to_profiles.size()==contador+1)
                    {
                        contador=0;
                    }else {

                        contador++;

                    }
                    linearLayout_d.setBackgroundResource(R.drawable.round_correct);

                }else{
                   // Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                    linearLayout_d.setBackgroundResource(R.drawable.round_wrong);

                }

            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == request_code && resultCode == RESULT_OK)) {


            //Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
        }
        Actualizar_pregunta();

    }



    void Actualizar_pregunta () {


        linearLayout_a.setBackgroundResource(R.drawable.round);
        linearLayout_b.setBackgroundResource(R.drawable.round);
        linearLayout_c.setBackgroundResource(R.drawable.round);
        linearLayout_d.setBackgroundResource(R.drawable.round);


        txt_pregunta.setText(user_to_profiles.get(contador).getDescripcion());

        categorias = inventory.getCategoria(String.valueOf(user_to_profiles.get(contador).getCategory_id()));
        txt_seccion.setText(categorias.getCategories());

        if (user_to_profiles.get(contador).getImagen() == 1) {  // si la pregunta tiene imagen

            img_pregunta.setVisibility(View.VISIBLE);
            final int resID = getResources().getIdentifier(user_to_profiles.get(contador).getName_img(), "drawable", getPackageName());
            img_pregunta.setImageResource(resID);

        } else {
            img_pregunta.setVisibility(View.GONE);


        }

        opciones = inventory.getOneOpciones(String.valueOf(user_to_profiles.get(contador).getId()));

        if (opciones.getImg_status() == 1) {
            img_opcion_a.setVisibility(View.VISIBLE);
            img_opcion_b.setVisibility(View.VISIBLE);
            img_opcion_c.setVisibility(View.VISIBLE);
            img_opcion_d.setVisibility(View.VISIBLE);

            pregunta_a.setText("");
            pregunta_b.setText("");
            pregunta_c.setText("");
            pregunta_d.setText("");

            final int res_A = getResources().getIdentifier(opciones.getImagen_a_id(), "drawable", getPackageName());
            img_opcion_a.setImageResource(res_A);

            final int res_B = getResources().getIdentifier(opciones.getImagen_b_id(), "drawable", getPackageName());
            img_opcion_b.setImageResource(res_B);

            final int res_C = getResources().getIdentifier(opciones.getImagen_c_id(), "drawable", getPackageName());
            img_opcion_c.setImageResource(res_C);

            final int res_D = getResources().getIdentifier(opciones.getImagen_d_id(), "drawable", getPackageName());
            img_opcion_d.setImageResource(res_D);


        } else {

            img_opcion_a.setVisibility(View.GONE);
            img_opcion_b.setVisibility(View.GONE);
            img_opcion_c.setVisibility(View.GONE);
            img_opcion_d.setVisibility(View.GONE);


            pregunta_a.setText(opciones.getOpcion_a());
            pregunta_b.setText(opciones.getOpcion_b());
            pregunta_c.setText(opciones.getOpcion_c());
            pregunta_d.setText(opciones.getOpcion_d());
        }


    } //end funcion void





} // OFF CLASSS
