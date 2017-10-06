package ie.cit.thehit.domain;

import ie.cit.thehit.interfaces.Currency;

public class Euro implements Currency {

	public final static String EUR ="€";
	@Override
	public String getSymbol() {
		return EUR;
	}

}
