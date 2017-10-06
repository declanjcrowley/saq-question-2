import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.thehit.domain.AudienceImpl;

public class App {

	// private static ApplicationContext context;
	//private static ApplicationContext autoWirecontext;
	private static ApplicationContext exthreecontext;

	public static void main (String args[]){
		
		// context=new ClassPathXmlApplicationContext("configuration.xml");
		// autoWirecontext=new ClassPathXmlApplicationContext("autowireconfiguration.xml");
		exthreecontext = new ClassPathXmlApplicationContext("exthreeconfiguration.xml");
		
		AudienceImpl audImpl = (AudienceImpl) exthreecontext.getBean("autowireAudienceBean");
		System.out.println("Audience member firstname is: "+ audImpl.getFirstname());
		System.out.println("Audience member lastname is: "+ audImpl.getLastname());
		System.out.println("Audience member age is: "+ audImpl.getAge());
		System.out.println("Audience member : "+ audImpl.getTicket());
		
		audImpl = (AudienceImpl) exthreecontext.getBean("autoWireTypeBean");
		System.out.println("Audience member firstname is: "+ audImpl.getFirstname());
		System.out.println("Audience member lastname is: "+ audImpl.getLastname());
		System.out.println("Audience member age is: "+ audImpl.getAge());
		System.out.println("Audience member : "+ audImpl.getTicket());
		
		audImpl = (AudienceImpl) exthreecontext.getBean("autoWireConstructorBean");
		System.out.println("Audience member firstname is: "+ audImpl.getFirstname());
		System.out.println("Audience member lastname is: "+ audImpl.getLastname());
		System.out.println("Audience member age is: "+ audImpl.getAge());
		System.out.println("Audience member : "+ audImpl.getTicket());
		
		
		
		/*
		SongwriterImpl songwriter=(SongwriterImpl)context.getBean("marywriter");
		System.out.println("The songwriters name is: "+ songwriter.getFirstname() + " The song name is: " + songwriter.getSong().getName()+" The lyrics are: " + songwriter.getSong().getLyrics());
		
		Venue v = (Venue)context.getBean("O2");
		System.out.println("Venue is: " + v.toString()); 
		
		Song setterDISong =(Song)context.getBean("setterBeanSong");
		System.out.println("Song name is: "+ setterDISong.getName());
		System.out.println("Song lyrics are: "+setterDISong.getLyrics());
		
		SongwriterImpl setterDISongwriter =(SongwriterImpl)context.getBean("setterSongwriter");
		System.out.println("Songwriter name is: "+ setterDISongwriter.getFirstname());
		System.out.println("Songwriter song details are: Song name: "+setterDISongwriter.getSong().getName()+
		        		" Song lyrics are: "+setterDISongwriter.getSong().getLyrics());
		
		Currency currency=(Currency)context.getBean("irishcurrency");
    	System.out.println("Currency symbol: " + currency.getSymbol());

		Currency btcurrency=(Currency)context.getBean("britishcurrency");
    	System.out.println("Currency symbol: " + btcurrency.getSymbol());
    	
    	Stage s_a = Stage.getInstance();
    	System.out.println(s_a.getCount() + " " + s_a.getTestString());
    	
    	Stage s_b = Stage.getInstance();
    	s_b.setTestString("asdf");
    	System.out.println(s_a.getCount() + " " + s_a.getTestString());
    	
    	Stage s = (Stage) context.getBean("theStage");
    	System.out.println(s_a.getCount() + " " + s_a.getTestString());
    	*/
    }
}