package com.stackroute.pe4;

public class NumberOfOccurenceOfWordTest {

    public int methodToFindTheNumberOfOccurences(String sentence,String checker){

        int actuallength=sentence.length();//finding length of string

        int lengthWithoutChecckingChar=sentence.replaceAll(checker, "").length();//replacing the old values

        int charRepeatance=actuallength-lengthWithoutChecckingChar;
        System.out.println(charRepeatance);

        return charRepeatance;
    }
    public boolean theGivenMethodShouldReturnFalseIfTheCharIsNotPresentInTheGivenStringOrNot(String sentence,String checker){

        if(sentence.contains(checker))
            return true;
        else
           return false;
    }

}
