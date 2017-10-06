package ie.cit.thehit.factories;

import ie.cit.thehit.domain.Euro;
import ie.cit.thehit.domain.Pound;
import ie.cit.thehit.interfaces.Currency;

public class CurrencyFactory {
	public static Currency createCurrency (String country) {
	       if (country.equalsIgnoreCase ("Ireland")){
	              return new Euro();
	       }else if(country.equalsIgnoreCase ("UK")){
	              return new Pound();
	       }
	       else return null;
	}
}
