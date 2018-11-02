package week1.day4;

public class Redmi implements Mobile {

	public void dialCall(long number) {
		System.out.println("dial call "+number);
	}

	public void sendSMS(long number) {
		System.out.println("send sms to "+number);
	}

	@Override
	public void IMEINumber() {
		// TODO Auto-generated method stub
		
	}


}
