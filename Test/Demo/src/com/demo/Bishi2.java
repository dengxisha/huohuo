package com.demo;

import java.util.Scanner;

/*
给定一串字符，里面有些字符有连续出现的特点，
请寻找这些连续出现字符中最长的串，如果最长的字符串有多个，
请输出字符ASCII码最小的那一串
 */
public class Bishi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(method(s));


    }

    private static String method(String s) {
        if (s==null||s.length()==0)
            return "";
        int first=0,end=1,maxFirst=0,maxEnd=1,leng=0;
        char[] chars = s.toCharArray();
        for (int i = 1; i <= chars.length; i++) {
            if (((i!=chars.length)&&(chars[i-1]!=chars[i]))||(i==chars.length)){
                end=i;
                leng=end-first;
                if ((leng>(maxEnd-maxFirst))||((leng==(maxEnd-maxFirst)&&((int)chars[first]<(int)chars[maxFirst])))){
                    maxEnd=end;
                    maxFirst=first;
                }
                first=end;
            }
        }
        return s.substring(maxFirst,maxEnd);
    }
}
