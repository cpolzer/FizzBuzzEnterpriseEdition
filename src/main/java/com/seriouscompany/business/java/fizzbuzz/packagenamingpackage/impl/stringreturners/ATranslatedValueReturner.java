/*
 * (c) LIDL Stiftung & Co.KG
 */
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.ITranslatedValueReturner;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @param <T>
 */
public abstract class ATranslatedValueReturner<T> implements ITranslatedValueReturner<T> {
    ResourceBundle resourceBundle;

    public ATranslatedValueReturner() {
        try {
            resourceBundle = ResourceBundle.getBundle(getClass().getSimpleName());
        } catch (MissingResourceException mrex) {
            resourceBundle = ResourceBundle.getBundle(getClass().getSimpleName(), Locale.ENGLISH);
        }
    }

    public abstract T getValue();
}
