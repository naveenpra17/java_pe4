package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {

    private MultipleOccurences multipleOccurences;
    @Before
    public void setUp(){
        multipleOccurences=new MultipleOccurences();
    }
    @After
    public void tearDown(){
        multipleOccurences=null;
    }

    @Test
    //the below method will check for the number of occurences of the given input string
    public void givenMethodShouldcheckForTheNumberOfOccurencesOfTheGivenWordFromTheEntireInputString(){

        //act

        String end=multipleOccurences.occurenceFinderOfTheGivenWordFromInputString("my name is billaaa bi bi","bi");
        //assert

        assertEquals(end,"13 11 21 19 24 22 ");
    }
    @Test//this will check for null inpuy
    public void givenMethodShouldCheckForNullInputString(){
        //act
        String end=multipleOccurences.occurenceFinderOfTheGivenWordFromInputString("","bi");

        //assert
        assertNull(end);
    }
}