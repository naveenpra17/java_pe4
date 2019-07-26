package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticalOrderGenerator {

    public String alphabeticalSorter(String paragraph){

        if(paragraph.isBlank())
            return null;

        String[] array=paragraph.split(" ");
        ArrayList<String> sortList=new ArrayList<>();
       for(String str:array)
           sortList.add(str);
        System.out.println(sortList);
        Collections.sort(sortList);

        StringBuilder sb=new StringBuilder();
        for(String str:sortList)
            sb.append(str);
        String sorted=sb.toString();
        return sorted;
    }
}
