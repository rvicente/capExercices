package exercicioSingleton;

import java.util.LinkedList;
import java.util.List;

import exercicioSingleton.products.Food;

public class ShopListSingleton {
	
	
	
	
	public static ShopListSingleton shopListInstance =  new ShopListSingleton();
	
	private List<E> shopList = new LinkedList<>();
	
	public static ShopListSingleton getShopListInstance() {
		return shopListInstance;
	}

	
	public boolean addProduct(String name, String product) {
		
		if (name.startsWith("Food")) {
			Food food = new Food(name, product);
			
			food.toString();
			
		}
	}
}
