package com.stackroute.pe4;

public class ReplaceAll {

    public String givenMethodReplaceStringWithChar(String sentence,String replaceWith1,
                                        String replaceWith2,
                                        String replaceBy1,String replaceBy2){

        String newString=sentence.replaceAll(replaceWith1,replaceBy1).replaceAll(replaceWith2,replaceBy2);
        System.out.println(newString);
        return newString;
    }

    public boolean givenMethodCheckStringWithReplaceWithChar(String sentence,String replaceWith1,
                                                  String replaceWith2,
                                                  String replaceBy1,String replaceBy2){
        if(sentence.contains(replaceWith1)&&sentence.contains(replaceWith2)){
            return true;
        }
        else
           return false;
    }
}
