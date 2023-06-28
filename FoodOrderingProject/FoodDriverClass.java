package FoodOrderingProject;
import java.util.Scanner;

public class FoodDriverClass {
	
	private static FoodOrder Foodobj=new FoodOrder();
	private static Scanner scan= new Scanner(System.in);
	
	static void loginPage()
	{
		System.out.println("--------Login into Restaurant Page--------- ");
	}
	
	static void showMenu()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("	|	1. Show Food List	 |");
		System.out.println("	|	2. Order VegFood Menu	 |");
		System.out.println("	|	3. Order Non VegFood Menu|");
		System.out.println("	|	4. Total Bill		 |");
		System.out.println("	|	5. FeedBack		 |");
		System.out.println("	|	6. logout		 |");
		System.out.println("	|	7. Exit			 |");
		System.out.println("--------------------------------------------------");
	}
	
	static void vegFood()
	{
		System.out.println("--------vegetarian food list---------");
		System.out.println("	1. Roti		  20/-");
		System.out.println("	2. Rice		  100/-");
		System.out.println("	3. Shahi Paneer	  250/-");
		System.out.println("	4. Dal Makhani	  200/-");
		System.out.println("    5. Exit  ");
		System.out.println("-------------------------------------");
		System.out.println("");
	}
	
	static void nonVegFood() 
	{
		System.out.println("--------nonvegetarian food list--------");
		System.out.println("	1. Roti			20/-");
		System.out.println("	2. Rice			100/-");
		System.out.println("	3. Butter Chicken	300/-");
		System.out.println("	4. Fish fry		300/-");
		System.out.println("    5. Exit  ");
		System.out.println("---------------------------------------");
		System.out.println("");
	}
	
	
	static void showFood(int foodoption)//veg 1 nonveg 2 
	{
		boolean flag=false;
		
		for(int ctr=1;ctr<=2;ctr++)
		{
			if(foodoption==1)
			{
				flag=true;
				vegFood();
				break;
			}
			else if(foodoption==2)
			{
				flag=true;
				nonVegFood();
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Enter Correct option");
		}
	}
	public static void main(String args[])
	{
		loginPage();
		System.out.println("Enter the username");
		String name = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
		Foodobj.login(name,password);
		//System.out.println(Foodobj);
		
		
		int option;
		do {
			showMenu();
			System.out.println("Enter your choice to order a food: ");
			option=scan.nextInt();
			
			switch(option) {
			
			case 1:
				System.out.println("1. vegetarian food");
				System.out.println("2. Non-vegetarian food");
				int foodoption;
				System.out.println("Enter your choice: ");
				foodoption=scan.nextInt();
				showFood(foodoption);
				break;
				
			case 2:
				System.out.println("vegetarian food");
				Foodobj.orderVeg();
				break;
				
			case 3:
				System.out.println("Non-vegetarian food");
				Foodobj.orderNonVeg();
				break;
				
			case 4:
				Foodobj.totalBill();
				break;
			
			case 5:
				Foodobj.feedback();
				break;
				
			case 6:
				Foodobj.logout();
				System.exit(1);
				break;
				
			case 7:
				System.out.println("**********Thank you for visiting our Restuarant*********");
				System.exit(1);
				break;
				
			default:
				System.out.println("Enter proper options...");	
			}
			
			
		}
		while(option!=9);
	}

	private static FoodOrder orderVeg() {
		
		return null;
	}
}
