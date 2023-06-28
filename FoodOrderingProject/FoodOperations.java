package FoodOrderingProject;

public interface FoodOperations {
	
	void login(String name, String Password);
	void logout();
	void showFood();
	void orderVeg();
	void orderNonVeg();
	void calVegBill(int total1);
	void calNonVegBill(int total2);
	void totalBill();
	void feedback();
	
	default void messge()
	{
		System.out.println("*********Welcome to our Foody Restaurant and hope happy with services and food*********");
	}

}
