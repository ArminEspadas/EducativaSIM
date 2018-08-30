package com.example.armin.educativasim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class secciones_exani extends AppCompatActivity {

    private ImageButton btn_matematica, btn_analitica, btn_lengua, btn_lectora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secciones_exani);
    }



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
