package FoodOrderingProject;
import java.util.Scanner;

public class FoodOrder implements FoodOperations{

	private static Scanner scan=new Scanner(System.in);
	
	private String name;
	private int password;
	private int Roti=20;
	int Rice=100;
	int ShahiPaneer=250;
	int DalMakhani=200;
	int ButterChicken=300;
	int FishFry=300;
	int quantity;
	int vegtotal=0;
	int nonvegtotal=0;
	int total1=0;
	int total2=0;
	
	int vegChoice;
	int nonVegChoice;
	
	FoodOrder()
	{
		System.out.println("-------- Please Login into Account-----------");	
	}
	@Override
	public void login(String name, String Password){
		if(name.equals("Shruti") && Password.equals("123")) 
		{
			System.out.println("=====Logged in successfully....======");
		}
		else {
			System.out.println("Enter correct username and password");}
			System.out.println();
		
		messge();
		
	}
	public void logout(){
		System.out.println("===Succefully Log out====");
		System.out.println("|----------------------|");
		System.out.println("| Thank U for Feedback |");
		System.out.println("|----------------------|");
	}
	public void showFood(){		

	}
	public void orderVeg(){	
		
			System.out.println("Enter your choice for veg food:--");
			vegChoice=scan.nextInt();
			switch(vegChoice)
			{
			case 1:
				System.out.println("You have selected Roti");
				System.out.println();
				System.out.println("Enter Roti Quantity:--");
				quantity=scan.nextInt();
				total1=total1+quantity*Roti;
				calVegBill(total1);
				break;
				
			case 2:
				System.out.println("You have selected Rice Plate");
				System.out.println();
				System.out.println("Enter Rice Plate Quantity:--");
				quantity=scan.nextInt();
				total1=total1+quantity*Rice;
				calVegBill(total1);
				break;
				
			case 3:
				System.out.println("You have selected Shahi Paneer");
				System.out.println();
				System.out.println("Enter ShahiPaneer plate Quantity:--");
				quantity=scan.nextInt();
				total1=total1+quantity*ShahiPaneer;//80+1*250=330
				calVegBill(total1);
				break;
				
			case 4:
				System.out.println("You have selected Dal Makhani");
				System.out.println();
				System.out.println("Enter Dal Makhani plate Quantity:--");
				quantity=scan.nextInt();
				total1=total1+quantity*DalMakhani;
				calVegBill(total1);
				break;
				
			case 5:
				System.exit(1);
				break;
				
			default:
				System.out.println("Enter Correct Choice");	
			}
		}

	
	public void orderNonVeg() {
		
		System.out.println("Enter your choice for Nonveg food:--");
		nonVegChoice=scan.nextInt();
		switch(nonVegChoice)
		{
		case 1:
			System.out.println("You have selected Roti");
			System.out.println();
			System.out.println("Enter Roti Quantity:--");
			quantity=scan.nextInt();
			total2=total2+quantity*Roti;
			calNonVegBill(total2);
			break;
			
		case 2:
			System.out.println("You have selected Rice Plate");
			System.out.println();
			System.out.println("Enter Rice Plate Quantity:--");
			quantity=scan.nextInt();
			total2=total2+quantity*Rice;
			calNonVegBill(total2);
			break;
			
		case 3:
			System.out.println("You have selected ButterChicken");
			System.out.println();
			System.out.println("Enter ButterChicken plate Quantity:--");
			quantity=scan.nextInt();
			total2=total2+quantity*ButterChicken;
			calNonVegBill(total2);
			break;
			
		case 4:
			System.out.println("You have selected FishFry");
			System.out.println();
			System.out.println("Enter FishFry plate Quantity:--");
			quantity=scan.nextInt();
			total2=total2+quantity*FishFry;
			calNonVegBill(total2);
			break;
			
		case 5:
			System.exit(1);
			break;
			
		default:
			System.out.println("Enter Correct Choice");	
		}
		
	}
	public void calVegBill(int total1) {
		vegtotal=total1;
		System.out.println("Total cost: "+total1);
	}
	
	public void calNonVegBill(int total2) {
		nonvegtotal=total2;
		System.out.println("Total bill is: "+total2);
	}
	
	public void totalBill()
	{
		int billchoice;
		System.out.println("1. veg food Bill");
		System.out.println("2. Non-veg food Bill");
		System.out.println("3. if order both Veg and non-veg Food bill");
		System.out.println("Enter choice for bill:--");
		billchoice=scan.nextInt();
		switch(billchoice)
		{
		case 1:
			System.out.println("Total Bill of Veg Food is: "+vegtotal);
			break;
		case 2:
			System.out.println("Total Bill of Non-Veg Food is: "+nonvegtotal);
			break;
		case 3:
			System.out.print("Total Bill of veg and Non-Veg Food is: ");
			System.out.print(vegtotal+nonvegtotal);
			System.out.println();
			break;
		}
	}
	
	public void feedback() {
		System.out.println("Write your feedback");
		String feedback=scan.next();
		System.out.println(feedback);
		System.out.println("|----------------------|");
		System.out.println("| Thank U for Feedback |");
		System.out.println("|----------------------|");
	}
	
}
