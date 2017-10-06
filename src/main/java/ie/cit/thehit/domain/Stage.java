package ie.cit.thehit.domain;

public class Stage {

	private static Stage stage=null;

	private String testString = "qwerty €";
	private static int count = 0;
	
	public static Stage getInstance(){
		
		if(stage==null){
			stage = new Stage();
		}
		count++;
		return stage;
	}
	
	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Stage.count = count;
	}
}
