package com.example.armin.educativasim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity_pregunta extends AppCompatActivity {


    private LinearLayout linearLayout_a, linearLayout_b, linearLayout_c, linearLayout_d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);

        linearLayout_a= (LinearLayout) findViewById(R.id.layout_a);
        linearLayout_b= (LinearLayout) findViewById(R.id.layout_b);
        linearLayout_c= (LinearLayout) findViewById(R.id.layout_c);
        linearLayout_d= (LinearLayout) findViewById(R.id.layout_d);


        linearLayout_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Opción A", Toast.LENGTH_SHORT).show();
            }
        });


        linearLayout_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_dialog_answer= new Intent(getApplicationContext(), respuesta_window.class);
                startActivityForResult(intent_dialog_answer, 'k');
               // Toast.makeText(getApplicationContext(), "Opción B", Toast.LENGTH_SHORT).show();
            }
        });

        linearLayout_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Opción C", Toast.LENGTH_SHORT).show();
            }
        });

        linearLayout_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Opción D", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
