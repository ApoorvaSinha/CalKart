package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashres);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (Exception t){}
                finally {
                    Intent obj = new Intent(splashres.this,welcome.class);
                    startActivity(obj);
                    finish();
                }
            }
        };
        th.start();
    }
}
