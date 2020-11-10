package com.example.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUserName;
    private EditText editUserPassword;
    private  Button button;
    private TextView loginMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUserName = findViewById(R.id.editUserName);
        editUserPassword = findViewById(R.id.editPassword);
        button = findViewById(R.id.button);
        loginMessage = findViewById(R.id.loginMessage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editUserName.getText().toString();
                String password = editUserPassword.getText().toString();

                if (name.equals("matheus") && password.equals("123")) {
                    loginMessage.clearComposingText();
                    loginMessage.setText("Login efetuado com sucesso!");
                }else {
                    loginMessage.setText("Usuário ou Senha inválido.");
                }
            }
        });
    }
}