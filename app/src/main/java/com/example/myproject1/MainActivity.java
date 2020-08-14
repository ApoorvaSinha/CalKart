package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText e1, e2;
    Button b1;
    ImageButton b2;
    TextView t;
    App_db obj2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText6);
        e2 = findViewById(R.id.editText);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.imageButton);
        t = findViewById(R.id.textView29);
        obj2=new App_db(MainActivity.this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button) {
            try {
                String s = e1.getText().toString();
                String s1 = e2.getText().toString();
                Cursor cursor = obj2.user_login(s);
                cursor.moveToFirst();
                String password = cursor.getString(5);
                if (password.equals(s1)) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                    cln();
                    Intent obj = new Intent(MainActivity.this, Menu.class);
                    obj.putExtra("k", s);
                    startActivity(obj);
                }else if(e1.getText()==null || e2.getText()==null) {
                    Toast.makeText(this, "invalid user", Toast.LENGTH_SHORT).show();
                    cln();
                } else{
                   cln();
                    Toast.makeText(this, "invalid user", Toast.LENGTH_SHORT).show();
                }
            } catch (Exception t) {
                cln();
                Toast.makeText(MainActivity.this, "invalid user", Toast.LENGTH_SHORT).show();
            }
        }
        else if(v.getId()==R.id.textView29){
            Intent obj2 = new Intent(MainActivity.this, Registration.class);
            startActivity(obj2);
        }
        else if(v.getId()==R.id.imageButton){
            Intent obj2 = new Intent(MainActivity.this, welcome.class);
            startActivity(obj2);
        }
    }
    public void cln(){

        e1.setText(null);
        e1.requestFocus();
        e2.setText(null);
    }
}
