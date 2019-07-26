package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatcherRegexTest {

    private PatternMatcherRegex patternMatcherRegex;

    @Before
    public void setUp(){
        patternMatcherRegex=new PatternMatcherRegex();
    }

    @After
    public void tearDown(){
        patternMatcherRegex=null;
    }
    @Test//test method for the given word which is orresent in the given string
    public void givenMethodShouldCheckForPatternMatching() {
        //act
        boolean isPresent = patternMatcherRegex.patternChecker("Check for naveen in the String", "naveen");

        //assert
        assertTrue(isPresent);


    }
    @Test//test case for the input word which is not preesent in the given string
    public void givenMethodwillCheckForMatchingWordWhichIsNotPresentInTheGivenSentence(){
        //act
        boolean isPresent=patternMatcherRegex.patternChecker("Check for naveen in the String","prakash");

        //assert
        assertFalse(isPresent);
    }

}