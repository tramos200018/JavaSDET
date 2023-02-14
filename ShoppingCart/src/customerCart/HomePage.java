package customerCart;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		
		
		ShoppingCart myCart = new ShoppingCart();
		
		
		
		Warehouse inv = new Warehouse();
		
		
		Product nikeShoes = new Product("nikeShoes", 60, "Shoes by nike");
		Product shinGuards = new Product("shinGuards", 10, "Guards to protect legs");
		Product jerseys = new Product("jerseys", 50, "Shirts to play soccer");
		Product shorts = new Product("shorts", 20, "Shorts to play soccer");
		Product balls = new Product("balls", 10, "Soccer balls");

		
		
		
		
		String s = "";
		
		
		while(!s.equals("4")) {
			

			
			System.out.println("Choose next Action");
			System.out.println("1) Show Subtotal");
			System.out.println("2) Add Product");
			System.out.println("3) Delete Product");
			System.out.println("4) Exit");

			Scanner obj = new Scanner(System.in);
			
			s = obj.nextLine();
			
			if(s.equals("1")) {
				System.out.println("$" + myCart.getSubTotal());
			}
			if(s.equals("2")) {
				System.out.println("Which Product?");
				System.out.println("1) nikeShoes");
				System.out.println("2) shinGuards");
				System.out.println("3) jersey");
				System.out.println("4) shorts");
				System.out.println("5) soccerBall");
				s = obj.nextLine();
				
				if(s.equals("1")) {
					myCart.addProduct(nikeShoes);
					inv.nikeShoes--;
				}
				if(s.equals("2")) {
					myCart.addProduct(shinGuards);
					inv.shinGuards--;
				}
				if(s.equals("3")) {
					myCart.addProduct(jerseys);
					inv.jerseys--;
				}
				if(s.equals("4")) {
					myCart.addProduct(shorts);
					inv.shorts--;
				}
				if(s.equals("5")) {
					myCart.addProduct(balls);
					inv.balls--;
				}
			}
			if(s.equals("3")) {
				System.out.println("Which Product?");
				System.out.println("1) nikeShoes");
				System.out.println("2) shinGuards");
				System.out.println("3) jersey");
				System.out.println("4) shorts");
				System.out.println("5) soccerBall");
				s = obj.nextLine();
				
				if(s.equals("1")) {
					myCart.deleteProduct(nikeShoes);
					inv.nikeShoes++;
				}
				if(s.equals("2")) {
					myCart.deleteProduct(shinGuards);
					inv.shinGuards++;
				}
				if(s.equals("3")) {
					myCart.deleteProduct(jerseys);
					inv.jerseys++;
				}
				if(s.equals("4")) {
					myCart.deleteProduct(shorts);
					inv.shorts++;
				}
				if(s.equals("5")) {
					myCart.deleteProduct(balls);
					inv.balls++;
				}
			}
			if(s.equals("4")) {
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
