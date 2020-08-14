package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.Collections.addAll;

public class Bill extends AppCompatActivity {

    TextView t,t1,t2,t3,t16,t17,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    Button b1;
    ImageButton b;
   SharedPreferences sharedPref,vsharedPref,ssharedPref,dsharedPref,bsharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        sharedPref=this.getSharedPreferences("calis",Context.MODE_PRIVATE);
        vsharedPref=this.getSharedPreferences("vcalis",Context.MODE_PRIVATE);
        ssharedPref=this.getSharedPreferences("scalis",Context.MODE_PRIVATE);
        dsharedPref=this.getSharedPreferences("dcalis",Context.MODE_PRIVATE);
        bsharedPref=this.getSharedPreferences("bcalis",Context.MODE_PRIVATE);
        t = findViewById(R.id.textView);
        t1 = findViewById(R.id.textView5);
        t2 = findViewById(R.id.textView10);
        t3 = findViewById(R.id.textView15);
        t4 = findViewById(R.id.textView6);
        t5 = findViewById(R.id.textView11);
        t6 = findViewById(R.id.textView16);
        t7 = findViewById(R.id.textView7);
        t8 = findViewById(R.id.textView12);
        t9 = findViewById(R.id.textView17);
        t10 = findViewById(R.id.textView8);
        t11 = findViewById(R.id.textView13);
        t12 = findViewById(R.id.textView18);
        t13 = findViewById(R.id.textView9);
        t14 = findViewById(R.id.textView14);
        t15 = findViewById(R.id.textView19);
        t16 = findViewById(R.id.textView20);
        t17 = findViewById(R.id.textView21);
        b = findViewById(R.id.button22);
        b1 = findViewById(R.id.button23);
        String res = sharedPref.getString("k1",null);
        String res1 = sharedPref.getString("k2",null);
        String res2 = sharedPref.getString("k3",null);
        Integer res15 = sharedPref.getInt("k4",0);
        String vres = vsharedPref.getString("k1",null);
        String vres1 = vsharedPref.getString("k2",null);
        String vres2 = vsharedPref.getString("k3",null);
        Integer vres15 = vsharedPref.getInt("k4",0);
        String sres = ssharedPref.getString("k1",null);
        String sres1 = ssharedPref.getString("k2",null);
        String sres2 = ssharedPref.getString("k3",null);
        Integer sres15 = ssharedPref.getInt("k4",0);
        String dres = dsharedPref.getString("k1",null);
        String dres1 = dsharedPref.getString("k2",null);
        String dres2 = dsharedPref.getString("k3",null);
        Integer dres15 = dsharedPref.getInt("k4",0);
        String bres = bsharedPref.getString("k1",null);
        String bres1 = bsharedPref.getString("k2",null);
        String bres2 = bsharedPref.getString("k3",null);
        Integer bres15 = bsharedPref.getInt("k4",0);
        t1.setText(res);
        t2.setText(res1);
        t3.setText(res2);
        t4.setText(vres);
        t5.setText(vres1);
        t6.setText(vres2);
        t7.setText(sres);
        t8.setText(sres1);
        t9.setText(sres2);
        t10.setText(dres);
        t11.setText(dres1);
        t12.setText(dres2);
        t13.setText(bres);
        t14.setText(bres1);
        t15.setText(bres2);
        t16.setText("Total Price:");
        int total2 = res15+vres15+sres15+dres15+bres15;
        t17.setText(String.valueOf(total2));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Bill.this, Menu.class);
                startActivity(obj);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1 = new Intent(Bill.this, MainActivity.class);
                startActivity(obj1);
            }
        });
    }

}
