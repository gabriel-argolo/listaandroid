package com.alura.agenda.ui.activity.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alura.agenda.R;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle("Formulario para Preenchimento");
    }
}