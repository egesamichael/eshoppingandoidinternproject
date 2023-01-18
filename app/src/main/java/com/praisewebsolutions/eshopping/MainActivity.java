package com.praisewebsolutions.eshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    String u , p ;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = user.getText().toString();
                p = pass.getText().toString();

                if(u.equals("demo") && p.equals("demo")){
                    startActivity(new Intent(MainActivity.this, Dashboard.class).putExtra("username", "demo"));
                } else {

                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}