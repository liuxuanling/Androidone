package com.example.items;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/25.
 */
public class GameSqliteDao {

    GameSqliteOpenHelper helper;

    public GameSqliteDao(Context context) {
        helper = new GameSqliteOpenHelper(context);


    }

    //    添加
    public boolean insert(Game game) {
        SQLiteDatabase db = null;
        //获取SQLiteDatabase的对象

        try {

            db = helper.getReadableDatabase();
            ContentValues values = new ContentValues();

            values.put("typeid", game.getTypeid());
            values.put("click", game.getClick());
            values.put("title", game.getTitle());
            values.put("shorttitle", game.getShorttitle());
            values.put("source", game.getSource());
            values.put("litipc", game.getLitpic());
            values.put("writer", game.getWriter());
            values.put("keywords", game.getKeywords());
            values.put("description", game.getDescription());
            values.put("typename", game.getTypename());
            values.put("nameryle2", game.getNamerule2());
            values.put("arcurl", game.getArcurl());

            long id = db.insert("game", null, values);
            return true;
        } catch (Exception e) {

        } finally {
            if (db != null && db.isOpen()) {
                db.close();
            }


            return false;
        }
    }

  //  获取所有的Game 的list集合
    public List<Game> getAllGameList() {
        SQLiteDatabase db = null;

        Cursor cursor = null;
        List<Game> data = new ArrayList<>();
        try {

            db = helper.getReadableDatabase();
            cursor = db.query("game", null, null, null, null, null, null);

            while (cursor.moveToNext()) {
                int gmId=cursor.getInt(cursor.getColumnIndex("gmId"));
                String typeid = cursor.getString(cursor.getColumnIndex("typeid"));
                String click = cursor.getString(cursor.getColumnIndex("click"));
                String title = cursor.getString(cursor.getColumnIndex("title"));
                String shorttitle = cursor.getString(cursor.getColumnIndex("shortitle"));
                String source = cursor.getString(cursor.getColumnIndex("source"));
                String litpic = cursor.getString(cursor.getColumnIndex("litpic"));
                String writer = cursor.getString(cursor.getColumnIndex("writer"));
                String keywords = cursor.getString(cursor.getColumnIndex("keywords"));
                String description = cursor.getString(cursor.getColumnIndex("description"));
                String typename = cursor.getString(cursor.getColumnIndex("typename"));
                String namerule2 = cursor.getString(cursor.getColumnIndex("namerule2"));
                String typeurl = cursor.getString(cursor.getColumnIndex("typeurl"));
                String arcurl = cursor.getString(cursor.getColumnIndex("arcurl"));

                Game game=new Game();
/*

                Game game = new Game(typeid, click, title, shorttitle, source, litpic, writer, keywords, description,
                        typename, namerule2, typeurl);
*/

                data.add(game);
            }
            return data;

        } catch (Exception e) {

        } finally {
            if (cursor != null && !cursor.isClosed()) { // &&短路与
                cursor.close();
            }
            if (db != null && db.isOpen()) { // &&短路与
                db.close();
            }
        }
        return null;

    }
//分页获取数据
    public List<Game>getAllStudentListByPage(int pageSize, int pageIndex){
    SQLiteDatabase db=null;
        Cursor cursor=null;
        List<Game>data=new ArrayList<>();

        try {
            //获取sqlitedatabase 的对象
       db=helper.getReadableDatabase();
            int offset = (pageIndex - 1) * pageSize;
            cursor=db.query("game",null,null,null,null,null,"gmId",String.valueOf(offset)+","+String.valueOf(pageSize));

             while (cursor.moveToNext()){
                 int gmId=cursor.getInt(cursor.getColumnIndex("gmId"));
                 String typeid = cursor.getString(cursor.getColumnIndex("typeid"));
                 String click = cursor.getString(cursor.getColumnIndex("click"));
                 String title = cursor.getString(cursor.getColumnIndex("title"));
                 String shorttitle = cursor.getString(cursor.getColumnIndex("shortitle"));
                 String source = cursor.getString(cursor.getColumnIndex("source"));
                 String litpic = cursor.getString(cursor.getColumnIndex("litpic"));
                 String writer = cursor.getString(cursor.getColumnIndex("writer"));
                 String keywords = cursor.getString(cursor.getColumnIndex("keywords"));
                 String description = cursor.getString(cursor.getColumnIndex("description"));
                 String typename = cursor.getString(cursor.getColumnIndex("typename"));
                 String namerule2 = cursor.getString(cursor.getColumnIndex("namerule2"));
                 String typeurl = cursor.getString(cursor.getColumnIndex("typeurl"));
                 String arcurl = cursor.getString(cursor.getColumnIndex("arcurl"));

         /*        Game game=new Game(click,title,shorttitle,source,litpic,writer,keywords,description,
                         typename,namerule2,typeurl,arcurl);*/
             }


        }catch (Exception e){

        }

        return null;
    }

}
















