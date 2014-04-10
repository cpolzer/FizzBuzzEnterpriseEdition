package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.ITranslatedValueReturner;

public class NewLinePrinter {

    private final FizzBuzzOutputStrategy outputStrategy;

    public NewLinePrinter() {
        FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
        this.outputStrategy = factory.createOutputStrategy();
    }

    public void printNewLine() {
        final ITranslatedValueReturner<String> myNewLineStringReturner = new NewLineStringReturner();
        final String myNewLineString = myNewLineStringReturner.getValue();
        try {
            this.outputStrategy.output(myNewLineString);
        } catch (Exception e) {
            // We're the enterprise...we don't get exceptions!
        }
    }

}
