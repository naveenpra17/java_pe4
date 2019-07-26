package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurences {


    public String occurenceFinderOfTheGivenWordFromInputString(String totalString, String word){
        if(totalString.isEmpty())//checeking for null condition
            return null;
        Pattern pattern=Pattern.compile(word);//taking the pattern as input word
        System.out.println(pattern);
        Matcher matcher=pattern.matcher(totalString);//matching the input strinh with matcher
        System.out.println(matcher);
        String position="";

        while (matcher.find()) {//loop for taking the matching [positions

            position=position+matcher.end()+" "+matcher.start()+" ";

        }

        return position;
    }
}