package com.example.items;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
public class JsonUtils {


    public static List<Game> parseJson(Object jsonString) {

         List<Game> data2 = new ArrayList<>();
        Game game=null;

        try {
            JSONObject jsonObject=new JSONObject();

            JSONObject obj1 = jsonObject.getJSONObject("data");

            for (int i=0;i<10;i++){
              game=new Game();

              String str=+i +"";
             // JSONObject obj2=array.getJSONObject(i).getJSONObject("data");
              JSONObject object2 = obj1.getJSONObject(str);

                game.title=object2.getString("id");
                game.click=object2.getString("click");
                game.typeid=object2.getString("typeid");
                game.shorttitle=object2.getString("shorttitle");
                game.source=object2.getString("source");
                game.litpic=object2.getString("lipic");
                 game.writer=object2.getString("writer");
                game.keywords=object2.getString("keywords");
                game.description=object2.getString("description");
                game.namerule2=object2.getString("namerule2");
                game.typeurl=object2.getString("typeurl");
                game.arcurl=object2.getString("arcurl");

            /*  String id=obj1.getString("id");
              String typeid=obj1.getString("typeid");
              String click=obj1.getString("click");
              String title=obj1.getString("title");
              String shorttitle=obj1.getString("shorttitle");
              String source=obj1.getString("source");
              String litpic=obj1.getString("litpic");
              String writer=obj1.getString("writer");
              String keywords=obj1.getString("keywords");
              String description=obj1.getString("description");
              String namerule2=obj1.getString("namerule2");
              String typeurl=obj1.getString("typeurl");
              String arcurl=obj1.getString("arcurl");*/

            data2.add(game);
          }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data2;
    }
}