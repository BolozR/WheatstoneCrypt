package ru.crypt.util;

import ru.crypt.models.Point;

public class Util {

    public static String[] bigram(String str){
        if(str.length()%2 != 0){
            str = str.concat(str.substring(str.length()-1));
        }
        return str.split("(?<=\\G.{2})");
    }

    public static Point searchCharInSquare(String character, String[][] square){
        for(int i = 0; i < square.length; i++){
            for (int j = 0; j < square[0].length; j++){
                if(square[i][j].equals(character)){
                    return new Point(j, i);
                }
            }
        }
        return new Point(-1, -1);
    }
}
