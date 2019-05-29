package com.example.demo.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  Question 1
 */
public class test1 {
    public static void calculateIterationLetters(int[] na, int n)
    {
        String[] array = { "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz" };

        ArrayList<String> list = iterationLetters(na, n, array);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<String> iterationLetters(int[] na, int n, String[] array)
    {
        ArrayList<String> list = new ArrayList<>();

        Queue<String> q = new LinkedList<>();
        q.add("");

        while(!q.isEmpty())
        {
            String s = q.remove();

            if (s.length() == n)
                list.add(s);
            else
            {
                String val = array[na[s.length()]];
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }



    public static void main(String args[])
    {
        int[] na = { 9 };
        int n = na.length;
        calculateIterationLetters(na, n);
    }
}


