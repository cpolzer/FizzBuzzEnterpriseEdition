package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * A Integer to string converter implementing {@link com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner}.
 * Call it's method {@link IntegerIntegerStringReturner#getIntegerReturnString(int)} and pass in the {@link Integer} of your desire to get it converted to a string.
 */
public class IntegerIntegerStringReturner implements IntegerStringReturner {
    /**
     * @param theInteger
     * @return the given {@link Integer} as a {@link String}
     */
    public String getIntegerReturnString(int theInteger) {
        final Integer myInteger = new Integer(theInteger);
        final StringBuilder myStringBuilder = new StringBuilder(myInteger.toString());
        final String myString = myStringBuilder.toString();
        return new String(myString);
    }

}
