package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;

/**
 * FIXME 10/04/2014 CP: @Mikael: What is this class doing? Needs a proper javadoc
 */
public class FizzBuzz {
    /**
     * @param nFizzBuzzUpperLimit
     */
	public void fizzbuzz(int nFizzBuzzUpperLimit) {
		final FizzBuzzSolutionStrategyFactory mySolutionStrategyFactory =
			new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
		final FizzBuzzSolutionStrategy mySolutionStrategy =
			mySolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
