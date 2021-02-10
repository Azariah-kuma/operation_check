package com.example.databasebasic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SimpleDatabaseHelper extends SQLiteOpenHelper {
    static final private String DBNAME = "sample.sqlite";
    static final private int VERSION = 1;

    SimpleDatabaseHelper(Context context){
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE books(" +
                "isbn TEXT PRIMARY KEY, title TEXT, price INTEGER)");
        db.execSQL("INSERT INTO books(isbn, title, price)" +
                "VALUES('978-4-7980-4512-2', 'はじめてのASP.NET Webフォーム', 3000)");
        db.execSQL("INSERT INTO books(isbn, title, price)" +
                "VALUES('978-4-7980-4179-7', 'ASP.NET MVC 5実践プログラミング', 3500)");
        db.execSQL("INSERT INTO books(isbn, title, price)" +
                "VALUES('978-4-7741-8030-4', 'Javaポケットリファレンス', 2680)");
        db.execSQL("INSERT INTO books(isbn, title, price)" +
                "VALUES('978-4-7741-9617-6', 'Swiftポケットリファレンス', 2880)");
        db.execSQL("INSERT INTO books(isbn, title, price)" +
                "VALUES('978-4-7981-3547-2', '独習PHP 第3版', 3200)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS books");
        onCreate(db);
    }
}
