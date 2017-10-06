package ie.cit.thehit.domain;

import ie.cit.thehit.interfaces.Audience;

public class AudienceImpl extends Person implements Audience{
	
	private Ticket ticket;

	public AudienceImpl() {
		super();
		/* needed for autowiring example*/
	}
	
	public AudienceImpl(Ticket ticket) {
		super();
		this.setTicket(ticket);
	}

	public AudienceImpl(String firstname, String lastname, int age, Ticket ticket) {
		super(firstname, lastname, age);
		this.setTicket(ticket);
	}

	public Ticket getTicket() {
		return ticket;
	}

	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public void purchase(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double refund(Ticket ticket) {
		// TODO Auto-generated method stub
		return 0;
	}

}
