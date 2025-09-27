package com.example.unidad1_moviles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000); // 3 segundos
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO_VIDA", "SplashActivity - onStart llamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CICLO_VIDA", "SplashActivity - onResume llamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLO_VIDA", "SplashActivity - onPause llamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CICLO_VIDA", "SplashActivity - onStop llamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO_VIDA", "SplashActivity - onRestart llamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO_VIDA", "SplashActivity - onDestroy llamado");
    }

}
