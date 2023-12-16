
package week1.day1;

public class Mobile {
	
	public void makecall() {
		
		System.out.println("You can make call");
		String mobileModel;
		float mobileWeight;
	}
	
	public void sendMsg() {
		
		System.out.println("You can send message");
		boolean isFullCharged;
		int mobileCost;
	}
	
	public static void main(String[] args) {
		Mobile mob =new Mobile();
		mob.makecall();
		mob.sendMsg();
		System.out.println("This is my Mobile");
	}

}
