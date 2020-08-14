package com.example.myproject1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class App_db extends SQLiteOpenHelper {
    public App_db(@Nullable Context context) {
        super(context, "RCEW", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String tab="create table register(id integer primary key autoincrement,user text,email text,mobile text,postal_address text,password text)";
        db.execSQL(tab);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void user_register(String u,String em,String mb,String pa,String p){

        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("user",u);
        cv.put("email",em);
        cv.put("mobile",mb);
        cv.put("postal_address",pa);
        cv.put("password",p);
        db.insert("register",null,cv);
        db.close();

    }

    public Cursor user_login(String u){
        SQLiteDatabase db=this.getWritableDatabase();
        String lg="select* from register where user='"+u+"'";
        Cursor c=db.rawQuery(lg,null);
        return  c;
    }
}
