package com.example.leccionui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void jugar (View view){

        Intent intent = new Intent(this, JuegoF.class);
        EditText nombre = (EditText) findViewById(R.id.editText);
        EditText apellido = (EditText) findViewById(R.id.editText2);

        String User=nombre.getText().toString();
        String Telefono=apellido.getText().toString();


        String[] Datos = new String[]{
                "  "+User,
                "  "+Telefono,
        };

        intent.putExtra("strings",Datos);
        startActivity(intent);
    }
}
