package com.example.armin.educativasim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.armin.educativasim.Rededucativa.db.Inventory;
import com.example.armin.educativasim.Rededucativa.db.Cursos;

import java.util.List;

public class MainActivity extends AppCompatActivity {

   private Button btn_exani1, btn_exani2;
   private Inventory inventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_exani1= (Button)findViewById(R.id.btn_exani_1);
        btn_exani2= (Button)findViewById(R.id.btn_exani_2);

        inventory = new Inventory(getApplicationContext());


        List<Cursos> user_to_profiles= inventory.getAllCursos();


      //  Toast.makeText(getApplicationContext(), user_to_profiles.get(9).getName_Course() , Toast.LENGTH_LONG).show();

        //-------------------------------------------------------------------------

        btn_exani1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_exani1= new Intent(getApplicationContext(), menu_exani_1.class);
                startActivityForResult(intent_exani1, 4 );


            }
        });

        //-------------------------------------------------------------------------


        //-------------------------------------------------------------------------

        btn_exani2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_exani2= new Intent(getApplicationContext(), menu_exani_2.class);
                startActivityForResult(intent_exani2, 2 );


            }
        });

        //-------------------------------------------------------------------------



    }// end on create
} // end class
