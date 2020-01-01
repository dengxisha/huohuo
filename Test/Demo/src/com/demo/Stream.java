package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("李云龙");
        list.add("张翠山");
        list.add("张三丰");
        list.add("赵敏");
        list.stream().filter(a->a.startsWith("张"))
        .filter(a->a.length()==3)
        .forEach(b-> System.out.println(b));
    }
}
