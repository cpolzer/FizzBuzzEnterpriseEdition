package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * The NewLineStringReturner implementing {@link StringStringReturner}.
 * Use it's method  {@link com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner#getReturnString()}
 * to get a string returned with the content of a linebreak
 */
public class NewLineStringReturner implements StringStringReturner {

    /**
     * @return a string out of a stringbuilder which contents are retrieved from jvm settings
     */
    public String getReturnString() {
        final String systemDefaultNewLineString = System.getProperty("line.separator");
        final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
        final String myString = myStringBuilder.toString();
        return new String(myString);
    }
}
