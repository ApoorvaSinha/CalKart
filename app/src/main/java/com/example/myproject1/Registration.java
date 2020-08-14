package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity implements View.OnClickListener {

    EditText e1,e2,e4,e5,e6;
    Button b1;
    TextView b2;
    App_db obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        e1 = findViewById(R.id.editText5);
        e2 = findViewById(R.id.editText9);
        e4 = findViewById(R.id.editText10);
        e5 = findViewById(R.id.editText11);
        e6 = findViewById(R.id.editText);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.imageButton3);
        obj=new App_db(Registration.this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            obj.user_register(e1.getText().toString(),e2.getText().toString(),e4.getText().toString(),e5.getText().toString(),e6.getText().toString());
            if (e1.getText().length()== 0 || e2.getText().length() == 0 ||  e4.getText().length() == 0 ||  e5.getText().length() == 0 ||  e6.getText().length() == 0) {
                Toast.makeText(this, "invalid input", Toast.LENGTH_SHORT).show();
            } else {
                cln();
                Intent obj3 = new Intent(Registration.this,MainActivity.class);
                startActivity(obj3);
            }
        }
        if(v.getId()==R.id.imageButton3){
            Intent obj4 = new Intent(Registration.this,MainActivity.class);
            startActivity(obj4);
        }
    }

    private void cln() {
        e1.setText(null);
        e2.setText(null);
        e4.setText(null);
        e5.setText(null);
        e6.setText(null);
    }

}
