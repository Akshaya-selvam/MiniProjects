import java.util.Scanner;
class OtpGen 
{
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int sys_otp=(int) (Math.random()*3245+8888);
		System.out.println("----OTP:-----");
		Thread.sleep(2000);
		System.out.println(sys_otp);
		
		System.out.println("Please Enter the Displayed Otp:");
		int user_entered_otp=in.nextInt();
		
		String res=(sys_otp==user_entered_otp)?"Verification Success":"Verification Fails";
		System.out.println("OTP "+res);
		
	}
}
