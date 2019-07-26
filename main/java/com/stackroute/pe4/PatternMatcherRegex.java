package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherRegex {

    public boolean patternChecker(String sentence,String matchingWord){

//        Pattern checker=Pattern.compile(matchingWord);//this will take the particular matching word into checker
//        System.out.println(checker);
        Pattern checker=Pattern.compile(".*"+matchingWord+".*");
//        System.out.println(check);
        Matcher matcher=checker.matcher(sentence);//this will check the sentence with the checker variable

        System.out.println(matcher);

        boolean matches=matcher.matches();//if matcher matches then matches variable will be true


        return matches;
    }
}
