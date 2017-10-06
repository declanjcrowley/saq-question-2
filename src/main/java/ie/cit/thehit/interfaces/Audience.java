package ie.cit.thehit.interfaces;

import ie.cit.thehit.domain.Ticket;

public interface Audience {
	
	public void purchase( Ticket ticket);
	public double refund(Ticket ticket);

}
