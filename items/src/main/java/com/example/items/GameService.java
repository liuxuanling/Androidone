package com.example.items;

import android.content.Context;

/**
 * Created by Administrator on 2016/6/25.
 */
public class GameService {

    private GameSqliteDao gameSqliteDao;

    public GameService(Context context) {
        // TODO Auto-generated constructor stub
        gameSqliteDao = new GameSqliteDao(context);
    }
    /**
     * 获取所有的Game   list集合
     */
   /* public List<Game> getAllStudentList() {
        return GameSqliteDao.get
    }
*/

}
