package ie.cit.thehit.domain;

import ie.cit.thehit.interfaces.Currency;

public class Pound implements Currency {

	public final static String POUND = "£";
	
	@Override
	public String getSymbol() {
		return POUND;
	}

}
