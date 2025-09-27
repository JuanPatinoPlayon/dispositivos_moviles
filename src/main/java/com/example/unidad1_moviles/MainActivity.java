package com.example.unidad1_moviles;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
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

    @Override protected void onStart() { super.onStart(); Log.d("CICLO_VIDA", "MainActivity - onStart"); }
    @Override protected void onResume() { super.onResume(); Log.d("CICLO_VIDA", "MainActivity - onResume"); }
    @Override protected void onPause() { super.onPause(); Log.d("CICLO_VIDA", "MainActivity - onPause"); }
    @Override protected void onStop() { super.onStop(); Log.d("CICLO_VIDA", "MainActivity - onStop"); }
    @Override protected void onRestart() { super.onRestart(); Log.d("CICLO_VIDA", "MainActivity - onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d("CICLO_VIDA", "MainActivity - onDestroy"); }
}



