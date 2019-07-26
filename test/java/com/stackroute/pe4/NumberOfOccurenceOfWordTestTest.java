package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOccurenceOfWordTestTest {
    private NumberOfOccurenceOfWordTest numberOfOccurenceOfWord;
    @Before
    public void setUp(){
        numberOfOccurenceOfWord=new NumberOfOccurenceOfWordTest();
    }

    @After
    public void tearDown(){
        numberOfOccurenceOfWord=null;
    }

    @Test
    public void theGivenMethodWillCheckForTheNumberOfOccurenceOfTheWord(){

        //act
        int count=numberOfOccurenceOfWord.methodToFindTheNumberOfOccurences("This is a sentence","i");

        //assert
        assertEquals(2,count);


    }


    @Test
    public void theGivenMethodShouldCheckForFalseIfTheCharIsNotPresentInTheGivenInputString(){

        //act
        boolean result=numberOfOccurenceOfWord.theGivenMethodShouldReturnFalseIfTheCharIsNotPresentInTheGivenStringOrNot("This is a sentence","z");
        //assert
        assertFalse(result);
    }



}