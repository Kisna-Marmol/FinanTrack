package com.example.finantrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    //Botones
    private Button btnLogin, btnRegister;

    // Paneles
    private LinearLayout panelLogin, panelRegistro;

    // Panel Login
    private EditText etEmail, etPassword;
    private ImageView ivTogglePassword;
    private TextView tvOlvidePassword;
    private Button btnIniciarSesion;

    // Panel Registro
    private EditText etNombre, etEmailRegistro, etPasswordRegistro, etConfirmarPassword;
    private ImageView ivTogglePwdReg, ivTogglePwdConfirm;
    private Button btnCrearCuenta;
    private TextView tvIrLogin;

    private boolean pwdVisible = false;
    private boolean pwdRegVisible = false;
    private boolean pwdConfirmVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarViews();
        botonesListeners();
    }

    private void inicializarViews() {
        btnLogin    = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        panelLogin   = findViewById(R.id.panel_login);
        panelRegistro = findViewById(R.id.panel_registro);

        // Login
        etEmail          = findViewById(R.id.et_email);
        etPassword       = findViewById(R.id.et_password);
        ivTogglePassword = findViewById(R.id.iv_toggle_password);
        tvOlvidePassword = findViewById(R.id.tv_olvide_password);
        btnIniciarSesion = findViewById(R.id.btn_iniciar_sesion);

        // Registro
        etNombre             = findViewById(R.id.et_nombre);
        etEmailRegistro      = findViewById(R.id.et_email_registro);
        etPasswordRegistro   = findViewById(R.id.et_password_registro);
        etConfirmarPassword  = findViewById(R.id.et_confirmar_password);
        ivTogglePwdReg       = findViewById(R.id.iv_toggle_pwd_reg);
        ivTogglePwdConfirm   = findViewById(R.id.iv_toggle_pwd_confirm);
        btnCrearCuenta       = findViewById(R.id.btn_crear_cuenta);
        tvIrLogin            = findViewById(R.id.tv_ir_login);
    }

    private void botonesListeners() {
        btnLogin.setOnClickListener(v -> mostrarPanelLogin());
        btnRegister.setOnClickListener(v -> mostrarPanelRegistro());
        tvIrLogin.setOnClickListener(v -> mostrarPanelLogin());
    }

    private void mostrarPanelLogin() {
        panelLogin.setVisibility(View.VISIBLE);
        panelRegistro.setVisibility(View.GONE);
        btnLogin.setBackgroundResource(R.drawable.bg_button_activo);
        btnLogin.setTextColor(getColor(android.R.color.white));
        btnRegister.setBackgroundResource(R.drawable.bg_button_inactivo);
        btnRegister.setTextColor(getColor(R.color.texto_secundario));
    }

    private void mostrarPanelRegistro() {
        panelLogin.setVisibility(View.GONE);
        panelRegistro.setVisibility(View.VISIBLE);
        btnRegister.setBackgroundResource(R.drawable.bg_button_activo);
        btnRegister.setTextColor(getColor(android.R.color.white));
        btnLogin.setBackgroundResource(R.drawable.bg_button_inactivo);
        btnLogin.setTextColor(getColor(R.color.texto_secundario));
    }


}