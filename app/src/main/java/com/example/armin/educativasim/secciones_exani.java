package com.example.armin.educativasim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class secciones_exani extends AppCompatActivity {

    private ImageButton btn_matematica, btn_analitica, btn_lengua, btn_lectora;
    public static String SECCION="ID_SECCION";
    public static String ACTIVITY_ID="ID_ACTIVITY";

    private  int request_code1=1, request_code2=2, request_code3=3, request_code4=4;
    private int ID_ACTIVITY= 0, ID_CURSO=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secciones_exani);

        btn_matematica = (ImageButton)findViewById(R.id.btn_matematico);
        btn_analitica = (ImageButton)findViewById(R.id.btn_analitico);
        btn_lectora = (ImageButton)findViewById(R.id.btn_lectora);
        btn_lengua = (ImageButton)findViewById(R.id.btn_lenguaje);


        Intent intent_receive = getIntent();
        ID_CURSO = intent_receive.getIntExtra(menu_exani_1.EXANI_1 ,0); // indicador del curso


        btn_matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Activity_pregunta.class);
                i.putExtra( menu_exani_1.EXANI_1 , ID_CURSO );
                i.putExtra(secciones_exani.SECCION, 1 );
                startActivityForResult(i, request_code1);

            }
        });


        btn_analitica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Activity_pregunta.class);
                i.putExtra( menu_exani_1.EXANI_1 , ID_CURSO );
                i.putExtra(secciones_exani.SECCION, 2 );
                startActivityForResult(i, request_code2);

            }
        });

        btn_lectora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Activity_pregunta.class);
                i.putExtra( menu_exani_1.EXANI_1 , ID_CURSO );
                i.putExtra(secciones_exani.SECCION, 4 );
                startActivityForResult(i, request_code3);

            }
        });

        btn_lengua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Activity_pregunta.class);
                i.putExtra( menu_exani_1.EXANI_1 , ID_CURSO );
                i.putExtra(secciones_exani.SECCION, 3 );
                startActivityForResult(i, request_code4);

            }
        });


    }// on create



    @Override
    public void onBackPressed() {

       // Toast.makeText(getApplicationContext(), "Pressed", Toast.LENGTH_LONG).show();

        super.onBackPressed();
      //  moveTaskToBack(true);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        //Toast.makeText(getApplicationContext(), "No OK :(", Toast.LENGTH_SHORT).show();

    }



}
