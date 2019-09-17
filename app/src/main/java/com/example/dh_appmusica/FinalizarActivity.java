package com.example.dh_appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class FinalizarActivity extends AppCompatActivity {

    private TextInputLayout inputNomeUsuario;
    private FloatingActionButton btnCheck;
    private TextView textNomeUsuario;
    private Button btnNewMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar);

            inputNomeUsuario = findViewById(R.id.textInputLayoutNomeUsuario);
            btnCheck = findViewById(R.id.floatingActionButtonCheck);
            textNomeUsuario = findViewById(R.id.textViewNome);
            btnNewMusic = findViewById(R.id.buttonNewMusic);

            btnCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nome = inputNomeUsuario.getEditText().getText().toString();

                    if (nome.isEmpty() || nome == "") {
                        Snackbar.make(inputNomeUsuario, "Preencha o campo nome!", Snackbar.LENGTH_LONG).show();
                    } else {
                        textNomeUsuario.setText("Obrigado, " + nome + "!");
                    }
                }
            });

            btnNewMusic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(FinalizarActivity.this, HomeActivity.class));
                }
            });
    }
}
