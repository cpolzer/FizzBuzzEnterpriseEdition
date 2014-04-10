package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.ITranslatedValueReturner;

public class FizzPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public FizzPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printFizz() {
		final ITranslatedValueReturner<String> myFizzStringReturner = new FizzStringReturner();
		try {
			this.outputStrategy.output(myFizzStringReturner.getValue());
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}

}
