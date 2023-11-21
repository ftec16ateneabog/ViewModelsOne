package com.atenea.firstviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MyViewModel myViewModel;
    private MyViewModelHash myViewModelHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModelHash = new ViewModelProvider(this).get(MyViewModelHash.class);
        myViewModelHash.addItem("clave1","valor1");
        myViewModelHash.addItem("clave2","valor2");

        String valor1 = myViewModelHash.getValue("clave1");
        String valor2 = myViewModelHash.getValue("clave2");


        /*Intent intent = new Intent(this, ListaElementosActivity.class);
        startActivity(intent);*/
        /*
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        myViewModel.setNombre("Juan");
        myViewModel.setEdad(25);

        TextView textView = (TextView) findViewById(R.id.mYTextView);
        textView.setText("Nombre " + myViewModel.getNombre()+ " Edad: "+ myViewModel.getEdad());*/
    }
}




