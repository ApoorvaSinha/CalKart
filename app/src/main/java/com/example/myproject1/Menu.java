package com.example.myproject1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Menu extends AppCompatActivity {

    TextView nonveg,veg,snacks,desert,beverges;
    ViewPager viewPager;
    PageViewAdapter pageViewAdapter;
    public FloatingActionButton b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        b4 = findViewById(R.id.fab);
        nonveg=(TextView)findViewById(R.id.nonveg);
        veg=(TextView)findViewById(R.id.veg);
        snacks=(TextView)findViewById(R.id.snacks);
        desert=(TextView)findViewById(R.id.desert);
        beverges=(TextView)findViewById(R.id.beverges);
        viewPager=(ViewPager)findViewById(R.id.fragment_container);
        pageViewAdapter=new PageViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageViewAdapter);

        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        beverges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj4 = new Intent(Menu.this, Bill.class);
                Fragment_nonveg.getInstance().calcu();
                Fragment_veg.vgetInstance().vcalcu();
                Fragment_snacks.sgetInstance().scalcu();
                Fragment_desert.dgetInstance().dcalcu();
                Fragment_beverges.bgetInstance().bcalcu();
                startActivity(obj4);
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {
        if(position==0){

            nonveg.setBackground(getDrawable(R.drawable.ripple3change));
            nonveg.setTextColor(getColor(R.color.bright_color));

            veg.setBackground(getDrawable(R.drawable.custom_button));
            veg.setTextColor(getColor(R.color.dark_color));

            snacks.setBackground(getDrawable(R.drawable.custom_button));
            snacks.setTextColor(getColor(R.color.dark_color));

            desert.setBackground(getDrawable(R.drawable.custom_button));
            desert.setTextColor(getColor(R.color.dark_color));

            beverges.setBackground(getDrawable(R.drawable.custom_button));
            beverges.setTextColor(getColor(R.color.dark_color));
        }
        if(position==1){

            nonveg.setBackground(getDrawable(R.drawable.custom_button));
            nonveg.setTextColor(getColor(R.color.dark_color));

            veg.setBackground(getDrawable(R.drawable.ripple3change));
            veg.setTextColor(getColor(R.color.bright_color));

            snacks.setBackground(getDrawable(R.drawable.custom_button));
            snacks.setTextColor(getColor(R.color.dark_color));

            desert.setBackground(getDrawable(R.drawable.custom_button));
            desert.setTextColor(getColor(R.color.dark_color));

            beverges.setBackground(getDrawable(R.drawable.custom_button));
            beverges.setTextColor(getColor(R.color.dark_color));
        }
        if(position==2){

            nonveg.setBackground(getDrawable(R.drawable.custom_button));
            nonveg.setTextColor(getColor(R.color.dark_color));

            veg.setBackground(getDrawable(R.drawable.custom_button));
            veg.setTextColor(getColor(R.color.dark_color));

            snacks.setBackground(getDrawable(R.drawable.ripple3change));
            snacks.setTextColor(getColor(R.color.bright_color));

            desert.setBackground(getDrawable(R.drawable.custom_button));
            desert.setTextColor(getColor(R.color.dark_color));

            beverges.setBackground(getDrawable(R.drawable.custom_button));
            beverges.setTextColor(getColor(R.color.dark_color));
        }
        if(position==3){

            nonveg.setBackground(getDrawable(R.drawable.custom_button));
            nonveg.setTextColor(getColor(R.color.dark_color));

            veg.setBackground(getDrawable(R.drawable.custom_button));
            veg.setTextColor(getColor(R.color.dark_color));

            snacks.setBackground(getDrawable(R.drawable.custom_button));
            snacks.setTextColor(getColor(R.color.dark_color));

            desert.setBackground(getDrawable(R.drawable.ripple3change));
            desert.setTextColor(getColor(R.color.bright_color));

            beverges.setBackground(getDrawable(R.drawable.custom_button));
            beverges.setTextColor(getColor(R.color.dark_color));
        }
        if(position==4){

            nonveg.setBackground(getDrawable(R.drawable.custom_button));
            nonveg.setTextColor(getColor(R.color.dark_color));

            veg.setBackground(getDrawable(R.drawable.custom_button));
            veg.setTextColor(getColor(R.color.dark_color));

            snacks.setBackground(getDrawable(R.drawable.custom_button));
            snacks.setTextColor(getColor(R.color.dark_color));

            desert.setBackground(getDrawable(R.drawable.custom_button));
            desert.setTextColor(getColor(R.color.dark_color));

            beverges.setBackground(getDrawable(R.drawable.ripple3change));
            beverges.setTextColor(getColor(R.color.bright_color));
        }
    }

}
