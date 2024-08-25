import java.util.Scanner;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tWELCOME TO SWIGGY APPLICATION :)");
		Thread.sleep(2000);
		System.out.println("Select The Hotel");
		System.out.println("------------------------\n1.Buhari\n2.A2B\n3.Bilal\n4.Amma Canteen");
		int hotel_selection=sc.nextInt();
		
		switch(hotel_selection)
		{
			case 1:{//buhari
				System.out.println("\t\t\tWelcome From Buhari");
				Thread.sleep(2000);
				System.out.println("Select Buhari Menu\n------------------\n1.Mutton Biryani\n2.Chicken Biryani\n3.Chicken-65");
				int food_selection=sc.nextInt();
				switch(food_selection)//buhari foods
				{
					case 1:{//mb
						double price=380;
						System.out.println("Enter the quantity of Mutton Biryani:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//mb
						
					case 2:{//cb
						double price=280;
						System.out.println("Enter the quantity of Chicken Biryani:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//cb
						
					case 3:{//ch-65
						double price=180;
						System.out.println("Enter the quantity of  chicken 65:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//ch-65
						
					default:{//invalid food selection
						System.out.println("Invalid Buhari Food Selection");
						break;}//invalid food selection
				}
				break;}//buhari
				
				
				
			
			case 2:{//a2b
				System.out.println("\t\t\tWelcome From A2B");
				Thread.sleep(2000);
				System.out.println("Select A2B Menu\n------------------\n1.Ghee Roast\n2.Mini Idly\n3.PaniPuri");
				int food_selection=sc.nextInt();
				switch(food_selection)//A2b foods
				{
					case 1:{//gr
						double price=125;
						System.out.println("Enter the quantity of Ghee Roast:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//gr
						
					case 2:{//mi
						double price=105;
						System.out.println("Enter the quantity of Mini Idly:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//mi
						
					case 3:{//panipuri
						double price=80;
						System.out.println("Enter the quantity of  PaniPuri:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//PaniPuri
						
					default:{//invalid food selection
						System.out.println("Invalid A2B Food Selection");
						break;}//invalid food selection
				}
				break;}//a2b
				
			
			case 3:{//bilal	
				System.out.println("\t\t\tWelcome From Bilal");
				Thread.sleep(2000);
				System.out.println("Select Bilal Menu\n------------------\n1.Prawn Fry\n2.Chicken Lollipop\n3.Fish Fry");
				int food_selection=sc.nextInt();
				switch(food_selection)//bilal foods
				{
					case 1:{//pf
						double price=280;
						System.out.println("Enter the quantity of Prawn Fry:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//pf
						
					case 2:{//cl
						double price=165;
						System.out.println("Enter the quantity of Chicken Lollipop:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//cl
						
					case 3:{//fish biryani
						double price=325;
						System.out.println("Enter the quantity of  Fish Biryani:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//fish biryani
						
					default:{//invalid food selection
						System.out.println("Invalid Bilal Food Selection");
						break;}//invalid food selection
				}
				break;}//bilal
			
			case 4:{//amma canteen
				System.out.println("\t\t\tWelcome From Amma Canteen");
				Thread.sleep(2000);
				System.out.println("Select Amma Canteen Menu\n------------------\n1.Idly\n2.Vada\n3.Pongal");
				int food_selection=sc.nextInt();
				switch(food_selection)//buhari foods
				{
					case 1:{//idli
						double price=15;
						System.out.println("Enter the quantity of Idly:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//idli
						
					case 2:{//vada
						double price=10;
						System.out.println("Enter the quantity of Vada:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//vada
						
					case 3:{//pongal
						double price=45;
						System.out.println("Enter the quantity of  Pongal:");
						int qty=sc.nextInt();
						double bill=price*qty;
						System.out.println("Your bill amount is:"+bill);
						Thread.sleep(1000);
						System.out.println("Select the Payment mode:\n1.Phonepe\n2.Gpay");
						int pay=sc.nextInt();
						switch(pay)
						{
							case 1:{//phonepe
								System.out.println("Redirecting to Phonepe......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//phonepe
							case 2:{//gapy
								System.out.println("Redirecting to Gpay......");
								Thread.sleep(2000);
								System.out.println("Enter your bill amount:");
								int amount=sc.nextInt();
								
								if(amount==bill)
								{
									int otp=(int)(Math.random()*4536+54321);
									Thread.sleep(1000);
									System.out.println("Please Wait You Receive an OTP:");
									Thread.sleep(3000);
									System.out.println(otp);
									System.out.println("Enter the displayed OTP:");
									int user_entered_otp=sc.nextInt();
									if(otp==user_entered_otp)
									{
										System.out.println("Your Order is Placed....:)");
										Thread.sleep(1000);
										System.out.println("Delivered By Next Year :)");
									}
									else
									{
										System.out.println("You Entered Wrong OTP!!!");
										Thread.sleep(1000);
										System.out.println("Order Failed.....:(");
									}
								}
								else
								{
									System.out.println("Order Fails because you enter wrong bill amount");
								}
								break;}//gpay
								
							default:{//invalid payment selection
								System.out.println("Invalid Payment Selection");
								break;}//inalid payment selection
						}
						break;}//pongal
						
					default:{//invalid food selection
						System.out.println("Invalid Amma Canteen Food Selection");
						break;}//invalid food selection
				}
				break;}//amma canteen
				
			default:{//invalid hotel selection
				System.out.println("Invalid Hotel Selection");
				break;}//invalid hotel selection
		}
	}
}
