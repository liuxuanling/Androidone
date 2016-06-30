package com.example.hehe;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/25.
 */
public class JsonUtils {

   public static List<Game> parseJson(String jsonString) {

       List<Game> data2 = new ArrayList<>();
       Game game;
       try {
           JSONObject jsonObject = new JSONObject(jsonString);
           game = new Game();

           for (int i = 0; i < 10; i++) {
               String str = +i + "";
               JSONObject object2 = jsonObject.getJSONObject(str);

               String title = object2.getString("title");
               String shorttitle = object2.getString("shorttitle");
               String source = object2.getString("source");
               String keywords = object2.getString("keywords");
               String description = object2.getString("description");
               String typename = object2.getString("typename");
               String arcurl = object2.getString("arcurl");
               data2.add(game);
           }
       } catch (JSONException e) {
           e.printStackTrace();
       }
       return data2;
   }

     /*  public static List<Game>parseJson(String jsonString){

        List<Game>data2=new ArrayList<>();
        Game game;
        try {

            JSONObject jsonObject=new JSONObject(jsonString);
            for (int i=0;i<10;i++){
                game=new Game();
                String str=+i+"";
                JSONObject object2 = jsonObject.getJSONObject(str);
                 game.title=object2.getString("title");
                 game.shorttitle=object2.getString("shorttitle");
                 game.source=object2.getString("source");
                 game.keywords=object2.getString("keywords");
                game.description=object2.getString("description");
                game.typename=object2.getString("typename");
                data2.add(game);


            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data2;
    }*/
}
