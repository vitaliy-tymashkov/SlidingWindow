package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper {
    public static String getMainString(){
        return new String("Alpha beta gamma. Test alpha, beta Gammalpha.");
    }

    public static String getQueryString(){
        return new String("alpha");
    }

    public static List<Character> getWordsDelimiter(){
        return new ArrayList<Character>(Arrays.asList(' ', ',', '.', '!', '?'));
    }



}
