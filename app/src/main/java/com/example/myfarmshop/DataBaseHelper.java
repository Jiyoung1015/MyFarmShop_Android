package com.example.myfarmshop;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final int version = 1;
    public static String dbName = "Farm.db";   // Name of our database
    public static final String TABLE_NAME_FARM = "Farm";
    public static final String TABLE_NAME_PRODUCT = "Product";
    public static final String TABLE_NAME_OFFERING = "Offering";


    public DataBaseHelper(Context context) {
        super(context, dbName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }


    //View Data without search condition(Search all data)
    public Cursor viewData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor;
        cursor = db.rawQuery("select * from " + TABLE_NAME_FARM, null);

        if(cursor != null ){
            cursor.moveToFirst();
        }
        return cursor;
    }
    //View Data with search condition
    public Cursor viewData(String key, String value){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = null;
        //Select SQL
        cursor = db.rawQuery("select f.* from " + TABLE_NAME_FARM + " f INNER JOIN " +
                                    TABLE_NAME_OFFERING + " o ON f.id=o.farmId INNER JOIN " +
                                    TABLE_NAME_PRODUCT + " p ON p.id=o.productId where p."
                + key + " = '" + value +"'", null);
//        cursor = db.rawQuery("select * from " + TABLE_NAME_PRODUCT + " where "
//                + key + " = '" + value +"'", null);
        if(cursor != null ){
            cursor.moveToFirst();
        }
        return cursor;
    }
}
