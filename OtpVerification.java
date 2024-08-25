import java.util.Scanner;
class OtpVerification
{
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int sys_otp=(int) (Math.random()*3245+7888);
		System.out.println("--------Your OTP is----------");  
		Thread.sleep(2000);
		System.out.println(sys_otp);
		
		System.out.println("Please Enter the Displayed OTP:");
		int user_entered_otp=in.nextInt();
		
		String res=(sys_otp==user_entered_otp)?"Verification Success....":"Verification Fails.....";
		System.out.println("OTP "+res);
		
	}
}
