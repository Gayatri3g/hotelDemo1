import java.util.Scanner;

public class hotelDemo {

	public static void main(String[] args) {
				int choice,ch1,total=0;
                                int qut=0;
				String Item_ord="";
				char ans;
				Scanner sc=new Scanner(System.in);
				System.out.println("Welcome to Gayatri's Hotel");
				do
				{
					System.out.println("1:Starters\n2:Main menu\n3:Non veg\n4:Drink");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
							System.out.println("Starters:");
							System.out.println("1:pappad            40Rs.");
							System.out.println("2:panir chilli      50Rs.");
							System.out.println("3:masala pappad     80Rs.");
		
							ch1=sc.nextInt();
							switch(ch1)
{
							case 1:
					total=total+40;
					qut=qut+1;
					Item_ord+="pappad\n";
					break;
				case 2:
				        total=total+50;
					qut=qut+1;
					Item_ord+="panir chilli\n";
					break;
				case 3:
					total=total+80;
					qut=qut+1;
					Item_ord+="masala pappad\n";
					break;
							}
						break;
					case 2:
						System.out.println("Maain menu:");
						System.out.println("1:panir masala      120Rs.");
						System.out.println("2:veg kholapuri     110Rs.");
						System.out.println("3:kaju masala       100Rs.");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
					total=total+120;
					qut=qut+1;
					Item_ord+="panir masala\n";
					break;
				case 2:
					total=total+110;
					qut=qut+1;
					Item_ord+="veg kholapuri\n";
					break;
				case 3:
					total=total+60;
					qut=qut+1;
					Item_ord+="kaju masala\n";
					break;
}
                         
					break;
					case 3:
						System.out.println("Non veg:");
						System.out.println("1:muttan              550Rs.");
						System.out.println("2:chiken              250Rs.");
						System.out.println("3:chikan briyani      150Rs.");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
							total=total+550;
							qut=qut+1;
					       Item_ord+="muttan\n";
                         break;
						case 2:
							total=total+250;
							qut=qut+1;
					         Item_ord+="chikan\n";
                         break;
                         
						case 3:
							total=total+150;
							qut=qut+1;
					        Item_ord+="chikan briyani \n";
                         break;
}
                         
					break;
					case 4:
						System.out.println("Drinks:");
						System.out.println("1:cococola       40Rs.");
						System.out.println("2:string         50Rs.");
						System.out.println("3:thembsup      60Rs.");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
							total=total+40;
							qut=qut+1;
					Item_ord+="cococola\n";
                         break;
						case 2:
							total=total+50;
							qut=qut+1;
					Item_ord+="string \n";
                         break;
                         
						case 3:total=total+60;
						qut=qut+1;
					Item_ord+="thembsup\n";
						ch1=sc.nextInt();
                         break;
}
                         
					break;
					default:
						System.out.println("Invalid choice");
						break;
					}
					
					System.out.println("Do you want to add any other item Y/N");
					ans=sc.next().charAt(0);
				}
				while(ans=='Y'||ans=='y');
				
				System.out.println("Thank for coming\nVisit again :)");
				System.out.println("Bill");
				System.out.println("The order items are="+ Item_ord);
				System.out.println("Total amount="+total);

						System.out.println("quantity="+qut);
						}
						}
											


		
					
				
				
