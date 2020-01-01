package com.demo;
import java.util.Scanner;
public class Bishi {
    public static String maxRepat(String str) {
        if (str == null || str.length() == 0)
            return "";
        int start=0,end=1,maxStart=0,maxEnd=1,len=0;
        char[] chars = str.toCharArray();
        for (int i = 1; i <=chars.length; i++) {
            if(((i!=chars.length)&&(chars[i-1]!=chars[i]))||i==chars.length)
            {
                end=i;
                len = end - start;
                if (len > (maxEnd - maxStart)||((len ==(maxEnd - maxStart))&&((int)chars[start]<(int)chars[maxStart]))) {
                    maxStart = start;
                    maxEnd = end;
                }
                start = end;
            }
        }
        return str.substring(maxStart,maxEnd);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st=input.nextLine();
        System.out.println(maxRepat(st));
    }
}
