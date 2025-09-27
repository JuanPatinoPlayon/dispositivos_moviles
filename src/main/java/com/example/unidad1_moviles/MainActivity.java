package com.example.unidad1_moviles;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ahora sí encuentra el TextView porque existe en el XML
        TextView tvBienvenido = findViewById(R.id.tvBienvenido);
        tvBienvenido.setText("¡Bienvenido a la aplicación!");
    }
}


