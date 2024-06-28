package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiplication extends AppCompatActivity {

    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);
        ed1=(EditText) findViewById(R.id.mulnum1);
        ed2=(EditText) findViewById(R.id.mulnum2);
        b1=(AppCompatButton) findViewById(R.id.mulbutton);
        b2=(AppCompatButton) findViewById(R.id.mulbacktomenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int getnum1 = Integer.parseInt(ed1.getText().toString());
                    int getnum2 = Integer.parseInt(ed2.getText().toString());
                    int mulresult = getnum1 * getnum2;
                    Toast.makeText(getApplicationContext(), "The product is " + String.valueOf(mulresult), Toast.LENGTH_LONG).show();
                }
                 catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}