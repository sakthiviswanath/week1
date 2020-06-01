package week1.day1;

public class Mobile {

	String mobileBrand ="oneplus";
	double mobilePrice =38000;
	int noContact = 500;
	long imeNo = 12900886546L;
			
			
	public void makeCall(int a) {
		System.out.println("calling phone");

	}
	
	
	/*public void sendMsg() {
		System.out.println("sending msg");
		
	}
	public void takePic() {
		System.out.println("taking pic");
	}*/
	
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall(2);
		myMobile.makeCall(10);

		/*myMobile.takePic();
		myMobile.sendMsg();*/
		
		/*System.out.println(myMobile.mobileBrand);
		
		int nocont = myMobile.noContact;
		System.out.println(nocont);*/
		
	}
		
	}




