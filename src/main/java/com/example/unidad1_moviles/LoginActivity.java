package com.example.unidad1_moviles;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etUsuario, etContrasena;
    Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etUsuario = findViewById(R.id.etUsuario);
        etContrasena = findViewById(R.id.etContrasena);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistro = findViewById(R.id.btnRegistro);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuario.getText().toString();
                String contrasena = etContrasena.getText().toString();

                if(usuario.equals("admin") && contrasena.equals("1234")){
                    Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Aquí se abriría el registro", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override protected void onStart() { super.onStart(); Log.d("CICLO_VIDA", "LoginActivity - onStart"); }
    @Override protected void onResume() { super.onResume(); Log.d("CICLO_VIDA", "LoginActivity - onResume"); }
    @Override protected void onPause() { super.onPause(); Log.d("CICLO_VIDA", "LoginActivity - onPause"); }
    @Override protected void onStop() { super.onStop(); Log.d("CICLO_VIDA", "LoginActivity - onStop"); }
    @Override protected void onRestart() { super.onRestart(); Log.d("CICLO_VIDA", "LoginActivity - onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d("CICLO_VIDA", "LoginActivity - onDestroy"); }

}