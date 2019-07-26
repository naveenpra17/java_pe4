package com.stackroute.pe4;

public class TransposeOfTheString {

public String methodToGetTranspose(String para){

    String[] transposeArray=para.split(" ");
    String acutalString="";
    for(String word:transposeArray){
        String output=" ";
        for(int i= word.length()-1;i>=0;i--){
            output=output+word.charAt(i);
        }
        acutalString=acutalString+output;
    }
    System.out.println(acutalString);
    return acutalString.trim();
}
}
