package com.example.unidad1_moviles;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvBienvenida;
    ListView lvUsuarios;
    ArrayAdapter<String> adapter;
    List<Usuario> usuarios;
    List<String> nombresUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBienvenida = findViewById(R.id.tvBienvenida);
        lvUsuarios = findViewById(R.id.lvUsuarios);

        // Si pasamos el nombre desde LoginActivity
        String nombreUsuario = getIntent().getStringExtra("nombreUsuario");
        if(nombreUsuario != null){
            tvBienvenida.setText("Bienvenido, " + nombreUsuario);
        }

        listarUsuarios();

        // Click largo para editar o eliminar usuario
        lvUsuarios.setOnItemLongClickListener((parent, view, position, id) -> {
            mostrarOpcionesUsuario(position);
            return true;
        });
    }

    // Listar usuarios
    private void listarUsuarios() {
        usuarios = Usuario.listAll(Usuario.class);
        nombresUsuarios = new ArrayList<>();
        for (Usuario u : usuarios) {
            nombresUsuarios.add(u.getNombre());
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombresUsuarios);
        lvUsuarios.setAdapter(adapter);
    }

    // Opciones de editar o eliminar
    private void mostrarOpcionesUsuario(int position) {
        final Usuario usuario = usuarios.get(position);

        CharSequence[] opciones = {"Editar", "Eliminar"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(usuario.getNombre());
        builder.setItems(opciones, (dialog, which) -> {
            if (which == 0) {
                mostrarDialogoEditar(usuario);
            } else if (which == 1) {
                usuario.delete();
                Toast.makeText(MainActivity.this, "Usuario eliminado", Toast.LENGTH_SHORT).show();
                listarUsuarios();
            }
        });
        builder.show();
    }

    // Editar usuario
    private void mostrarDialogoEditar(Usuario usuario) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Editar Usuario");

        EditText input = new EditText(this);
        input.setText(usuario.getNombre());
        builder.setView(input);

        builder.setPositiveButton("Guardar", (dialog, which) -> {
            String nuevoNombre = input.getText().toString().trim();
            if(!nuevoNombre.isEmpty()){
                usuario.setNombre(nuevoNombre);
                usuario.save();
                Toast.makeText(MainActivity.this, "Usuario actualizado", Toast.LENGTH_SHORT).show();
                listarUsuarios();
            } else {
                Toast.makeText(MainActivity.this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancelar", null);
        builder.show();
    }

    // Métodos del ciclo de vida correctamente indentados
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO_VIDA", "MainActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CICLO_VIDA", "MainActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLO_VIDA", "MainActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CICLO_VIDA", "MainActivity - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO_VIDA", "MainActivity - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO_VIDA", "MainActivity - onDestroy");
    }
}



