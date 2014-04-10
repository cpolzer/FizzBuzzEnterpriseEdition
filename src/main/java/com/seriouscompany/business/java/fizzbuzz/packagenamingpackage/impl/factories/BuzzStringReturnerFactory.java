package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.ITranslatedValueReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public ITranslatedValueReturner<String> createStringStringReturner() {
		final ITranslatedValueReturner<String> myBuzzStringReturner = new BuzzStringReturner();
		return myBuzzStringReturner;
	}

}
