package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Our FizzStringReturner.class implementing {@link StringStringReturner}.
 * It's method {@link FizzStringReturner#getReturnString} returns a {@link String} with the content of "Fizz"
 */
public class FizzStringReturner implements StringStringReturner {
    /**
     * TODO: 23/12/1998 CP: Check javadoc for typos
     *
     * @return "Fisz"
     */
    public String getReturnString() {
        final StringBuilder myStringBuilder = new StringBuilder("Fizz");
        final String myString = myStringBuilder.toString();
        return new String(myString);
    }

}
