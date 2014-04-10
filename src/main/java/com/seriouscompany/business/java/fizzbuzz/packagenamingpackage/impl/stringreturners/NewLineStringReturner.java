package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * The NewLineStringReturner extending  {@link ATranslatedValueReturner}.
 * returns the content of a linebreak
 */
public class NewLineStringReturner extends ATranslatedValueReturner<String> {

    /**
     * @return a string out of a stringbuilder which contents are retrieved from jvm settings
     */
    @Override
    public String getValue() {
        final String systemDefaultNewLineString = System.getProperty("line.separator");
        final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
        final String myString = myStringBuilder.toString();
        return new String(myString);
    }
}
