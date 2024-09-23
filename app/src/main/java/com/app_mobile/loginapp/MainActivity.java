package com.app_mobile.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    Button btnLogin;
    EditText edtPhone;
    EditText edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // Set layout cho Main Screen la activity_main layout
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Lien ket thanh phan Button trong XML voi Button trong code Java
        // thong qua method findViewById
        btnLogin = (Button) findViewById(R.id.btn_login);

        edtPhone = (EditText)findViewById(R.id.edt_phone) ;

        edtPassword = (EditText)findViewById(R.id.edt_password) ;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edtPhone.getText().toString().equals("0965741051")
                        && edtPassword.getText().toString().equals("A123456@"))
                {

                    Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
                    startActivity(intent);


                }else {


                    Toast.makeText(getApplicationContext(), "Phone or password is incorrect",
                            Toast.LENGTH_LONG).show();
                }



            }
        });



    }
}