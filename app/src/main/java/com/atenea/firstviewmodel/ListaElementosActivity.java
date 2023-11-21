package com.atenea.firstviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListaElementosActivity extends AppCompatActivity {
    ListaElementosViewModel listaElementosViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_elementos);

        listaElementosViewModel = new ViewModelProvider(this).get(ListaElementosViewModel.class);

        listaElementosViewModel.agregarElemento("Elemento 1");
        listaElementosViewModel.agregarElemento("Elemento 2");
        listaElementosViewModel.agregarElemento("Elemento 3");

        List<String> elementos = listaElementosViewModel.getElementos();

        ListView listView = findViewById(R.id.MyListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, elementos);
        listView.setAdapter(adapter);

    }
}