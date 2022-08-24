package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Zimou Sun
 * Tue Aug 23 2022
 *
 * Homework1
 */
public class Main {

    public static String[] String_Problem_1 ()
    {
        String input="Algorithms";

        return new String[]{input.substring(2, 3), input.substring(0, 3)};


    }
    public static boolean String_Problem_2(String str1, String str2)
    {
        return str1.equals(str2) && str1.compareTo(str2)==0;
    }
    public static List<String> String_Problem_3()
    {
        String input ="https://www.amazon.com/demo?test=abc";
        String regex = "[:/+.?=]";
        StringTokenizer st= new StringTokenizer(input,regex);
        List<String> tokens = new ArrayList<String>();

        while(st.hasMoreTokens())
        {
            tokens.add(st.nextToken());
        }

        return tokens;
    }

    public static StringBuilder String_Problem_4( List<String[]> listOfStringArray)
    {
        StringBuilder s= new StringBuilder();
        for(String[] sa: listOfStringArray)
        {
            for(String str : sa)
            {
                s.append(str);
            }
        }
    return s;
    }

    public static void main(String[] args) {

        //Problem 1

        //Problem 2

        //Problem 3


    }
}