package student.adapter.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/6/29.
 */
public class StudentSqliteOpenHelper extends SQLiteOpenHelper{

        public StudentSqliteOpenHelper(Context context) {
            super(context, "student.db", null, 1);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            //1创建表
            db.execSQL("create table if not exists student(stuNo integer primary key," +
                    "stuName varchar(20)," +
                    "address varchar(50)," +
                    "money double," +
                    "age int)");
            //2初始化数据
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"小黑", "郑州二七", 10000, 20});
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"小白", "郑州金水区", 1000, 22});
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"老张", "北京", 20000, 23});
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"老王", "郑州二七", 100000, 25});
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"小黄", "郑州高新区", 10000, 20});
            db.execSQL("insert into student(stuName,address,money,age) values(?,?,?,?)", new Object[]{"小亮", "东莞", 30000, 20});
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub

        }

    }

