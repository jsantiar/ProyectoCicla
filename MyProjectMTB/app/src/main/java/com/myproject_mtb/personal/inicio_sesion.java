package com.myproject_mtb.personal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inicio_sesion extends AppCompatActivity {

    Button btnVolverHome2;
    Button btnIniciarSesion;

    EditText inputCorreoInicio;
    EditText inputContrasenaInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        inputCorreoInicio = findViewById(R.id.input_inicio_sesion);
        inputContrasenaInicio = findViewById(R.id.input_password_inicio_sesion);
        btnIniciarSesion = findViewById(R.id.btn_ingresar);
        btnVolverHome2 = findViewById(R.id.btn_volver_home2);

    }

    public void volverHomeDesdeInicioSesion(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void ingresarDashboard(){
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }



}