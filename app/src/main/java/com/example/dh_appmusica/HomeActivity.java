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

public class HomeActivity extends AppCompatActivity {

    private TextInputLayout inputMusic;
    private FloatingActionButton btnAddMusic;
    private TextView textNomeMusic;
    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        inputMusic = findViewById(R.id.textInputLayoutNomeMusica);
        btnAddMusic = findViewById(R.id.floatingActionButtonAdd);
        textNomeMusic = findViewById(R.id.textViewMusica);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnAddMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String musica = inputMusic.getEditText().getText().toString();

                if (musica.isEmpty() || musica == ""){
                    inputMusic.setError("O campo não pode ser nulo!");
                } else {
                    textNomeMusic.setText(musica);
                    Snackbar.make(inputMusic, "Música adicionada!", Snackbar.LENGTH_LONG).show();
                }
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, FinalizarActivity.class));
            }
        });
    }
}
