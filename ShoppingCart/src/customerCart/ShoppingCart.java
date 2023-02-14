package customerCart;

import java.util.ArrayList;

public class ShoppingCart {

	int subTotal = 0;
	final double tax = 0.1;
	
	String cartName = "Antonio";
	
	private ArrayList<Product> shopCart = new ArrayList<>();
	
	public int getProductQuantity(Product p) {
		int quantity = 0;
		
		for(int i = 0; i<shopCart.size(); i++) {
			if(shopCart.get(i).getName() == p.getName()) {
				quantity++;
			}
		}
		
		return quantity;
	}

	
	public void addProduct(Product p) {
		shopCart.add(p);
		
	}
	
	public void addProduct(Product p, int n) {
		for(int i = 0; i<n; i++) {
			shopCart.add(p);
		}
	}
	
	public void deleteProduct(Product p) {
		if(shopCart.size() >= 1) {
			shopCart.remove(p);
		}
		System.out.println(cartName + " total products: " + shopCart.size());
	}
	
	public void deleteProduct(Product p, int n) {
		if(shopCart.size()  - n >= 1) {
			for(int i = 0; i<n; i++) {
				shopCart.remove(p);
			}	
		}
		System.out.println(cartName + " total products: " + shopCart.size());
	}
	
	public void editQuantity(Product p, int n) {
		int quantity = getProductQuantity(p);
		
		if(n<=5 && n>=0) {
			if(quantity > n) {
				deleteProduct(p, quantity - n);
			}else if(quantity < n) {
				addProduct(p, n - quantity);
			}
		}
	}
	
	public int getSubTotal() {
		int total = 0;
		
		for(int i = 0; i<shopCart.size(); i++) {
			total += (shopCart.get(i).getPrice() + (shopCart.get(i).getPrice()*tax));
		}
		
		return total;
	}
	
	public int getCartQuantity() {
		return shopCart.size();
	}
	
	public double getTax() {
		return tax;
	}
	
	public void showCart() {
		for(int i = 0; i<shopCart.size(); i++) {
			System.out.println(shopCart.get(i).getName());
		}
		System.out.println("Price: " + getSubTotal());
	}

}
