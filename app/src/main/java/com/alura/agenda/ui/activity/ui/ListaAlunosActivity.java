package com.alura.agenda.ui.activity.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.alura.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lista de Alunos");
       setContentView(R.layout.lista_alunos_activity);

       List<String> alunos = new ArrayList<>(Arrays.asList("Gabriel", "Pedro", "Jose", "Carlos"));

       ListView lista = findViewById(R.id.activity_main_lista_de_alunos);
       lista.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));
    }
}
