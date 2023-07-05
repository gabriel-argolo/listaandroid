package com.alura.agenda.activity.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.alura.agenda.dao.AlunoDAO;
import com.alura.agenda.R;
import com.alura.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        final AlunoDAO dao = new AlunoDAO();

        setTitle("Formulario para Preenchimento");
        EditText campoNome = findViewById(R.id.activity_main_formulario_aluno_nome);
        EditText campoTelefone = findViewById(R.id.activity_main_formulario_aluno_telefone);
        EditText campoEmail = findViewById(R.id.activity_main_formulario_aluno_email);

        Button botaoSalvar = findViewById(R.id.activity_main_formulario_aluno_salvar);


        botaoSalvar.setOnClickListener(view -> {
            String nome = campoNome.getText().toString();
            String telefone = campoTelefone.getText().toString();
            String email = campoEmail.getText().toString();

            Aluno alunoCriado = new Aluno(nome, telefone, email);
            dao.salva(alunoCriado);
            startActivity(new Intent(FormularioAlunoActivity.this, ListaAlunosActivity.class));
        });
    }
}