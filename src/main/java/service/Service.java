package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Service {
    public static List<Integer> run(String search, String query, List<Character> delimiters){
        List<Integer> result = new ArrayList<>();

        int queryLength = query.length();

        //1. convert query to queryCharactersSum of char;
        System.out.println("\nStream with chars");
        char[] queryChars = new char[queryLength];
        query.getChars(0, queryLength, queryChars, 0);

        Integer queryCharsSum = 0;
        for (Character c : queryChars) {
            queryCharsSum += c;
        }
        System.out.println("queryCharsSum = " + queryCharsSum);


        System.out.println("\nStream with Characters");
        Character[] queryCharacters = new Character[queryLength];
        int j = 0;
        for (Character c : queryChars) {
            queryCharacters[j++] = c;
        }
        int queryCharactersSum = Arrays.stream(queryCharacters).mapToInt(ch -> ch).sum();

//        Stream<Character> stream1 = Arrays.stream(queryCharacters);
//        stream1.forEach(x -> System.out.println(x));
        System.out.println("queryCharactersSum = " + queryCharactersSum);





        //2. Start to search in main string with len of query queryCharactersSum, if queryCharactersSum is file select chars, if query is found - increment result

        int searchStringTempSum = 0;

        for (int i = 0; i < search.length(); i++){


        }


        //3. Implement enhanced algorithm for sliding
        //4. What to do if we have aaaaaaa / a - corner cases

        return result;
    }
}
