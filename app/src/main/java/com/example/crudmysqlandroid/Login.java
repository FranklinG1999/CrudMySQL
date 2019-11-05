package com.example.crudmysqlandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText et_usuario, et_pass;
    Button btnlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_usuario=(EditText)findViewById((R.id.edit1));
        et_pass=(EditText)findViewById((R.id.edit2));
        btnlog=(Button) findViewById((R.id.btnlog));
// Esto e spara pantalla completa(ocuñta incluso la barra de estado
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usu = et_usuario.getText().toString();
                String pass = et_pass.getText().toString();
                if (usu.equals("profe")&& pass.equals("123")){
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    et_usuario.setText(null);
                    et_pass.setText(null);
                    Toast.makeText(Login.this, "Usuario o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
