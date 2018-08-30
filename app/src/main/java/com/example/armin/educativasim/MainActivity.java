package com.example.armin.educativasim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button btn_exani1, btn_exani2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_exani1= (Button)findViewById(R.id.btn_exani_1);
        btn_exani2= (Button)findViewById(R.id.btn_exani_2);


        //-------------------------------------------------------------------------

        btn_exani1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_exani1= new Intent(getApplicationContext(), menu_exani_1.class);
                startActivityForResult(intent_exani1, 4 );


            }
        });

        //-------------------------------------------------------------------------





    }// end on create
} // end class
