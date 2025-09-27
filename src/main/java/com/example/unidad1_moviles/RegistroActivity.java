package com.example.unidad1_moviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    EditText etUsuarioRegistro, etContrasenaRegistro;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etUsuarioRegistro = findViewById(R.id.etUsuarioRegistro);
        etContrasenaRegistro = findViewById(R.id.etContrasenaRegistro);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuarioRegistro.getText().toString().trim();
                String contrasena = etContrasenaRegistro.getText().toString().trim();

                // Validar campos vacíos
                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(RegistroActivity.this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Guardar usuario en la base de datos con Sugar ORM
                Usuario nuevoUsuario = new Usuario(usuario, contrasena);
                nuevoUsuario.save();

                Toast.makeText(RegistroActivity.this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();

                // Volver al LoginActivity
                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}