package com.atenea.firstviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        myViewModel.setNombre("Juan");
        myViewModel.setEdad(25);

        TextView textView = (TextView) findViewById(R.id.mYTextView);
        textView.setText("Nombre " + myViewModel.getNombre()+ " Edad: "+ myViewModel.getEdad());
    }
}




