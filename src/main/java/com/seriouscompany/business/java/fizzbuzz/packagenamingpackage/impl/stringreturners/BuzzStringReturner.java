package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Our BuzzStringReturner.class implementing {@link StringStringReturner}.
 */
public class BuzzStringReturner extends ATranslatedValueReturner<String> {

    /**
     * @return a <s>{@link StringBuilder}</s> {@link String} with the value of buzz
     */
    @Override
    public String getValue() {
        final StringBuilder myStringBuilder = new StringBuilder(resourceBundle.getString("buzz"));
        final String myString = myStringBuilder.toString();
        return new String(myString);
    }
}
