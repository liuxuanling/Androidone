package com.example.items;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/6/25.
 */
   public class GameSqliteOpenHelper extends SQLiteOpenHelper{

   public GameSqliteOpenHelper(Context context){
       super(context,"game.db",null,1);

   }
    @Override
    public void onCreate(SQLiteDatabase db) {

        //创建表
        db.execSQL("create table if not exists game(stuNo integer primarykey+" +
                "  typeid varchar(20)," +
                "click varchar(20)" +
                ")title String " +
                "shorttitle Stirng" +
                "source String " +
                "litpic String" +
                "writer String" +
                "keywords String" +
                "description String " +
                "typename String" +
                "typeurl String" +
                "namerule2 String");

        //初始化数据
        db.execSQL("insert into game(typeid,click,titlr,shorttitle,source,litpic,writer" +
                "keywords,description,typename,typeurl,namerule2) value=(?,?,?,?,?,?,?,?,?,?,?,?)"
                ,new Object[]{"?","?","?","?","?","?","?","?","?","?","?","?"});

        db.execSQL("insert into game(typeid,click,titlr,shorttitle,source,litpic,writer" +
                        "keywords,description,typename,typeurl,namerule2) value=(?,?,?,?,?,?,?,?,?,?,?,?)"
                ,new Object[]{"?","?","?","?","?","?","?","?","?","?","?","?"});

        db.execSQL("insert into game(typeid,click,titlr,shorttitle,source,litpic,writer" +
                        "keywords,description,typename,typeurl,namerule2) value=(?,?,?,?,?,?,?,?,?,?,?,?)"
                ,new Object[]{"?","?","?","?","?","?","?","?","?","?","?","?"});

        db.execSQL("insert into game(typeid,click,titlr,shorttitle,source,litpic,writer" +
                        "keywords,description,typename,typeurl,namerule2) value=(?,?,?,?,?,?,?,?,?,?,?,?)"
                ,new Object[]{"?","?","?","?","?","?","?","?","?","?","?","?"});

        db.execSQL("insert into game(typeid,click,titlr,shorttitle,source,litpic,writer" +
                        "keywords,description,typename,typeurl,namerule2) value=(?,?,?,?,?,?,?,?,?,?,?,?)"
                ,new Object[]{"?","?","?","?","?","?","?","?","?","?","?","?"});
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
