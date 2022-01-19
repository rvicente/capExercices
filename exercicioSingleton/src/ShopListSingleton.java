

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShopListSingleton<T> {
	
	public static ShopListSingleton shopListInstance =  new ShopListSingleton();
	ArrayList<String> shopList = new ArrayList<>();
	
	private ShopListSingleton() {
			
	}
	
	public static ShopListSingleton getShopListInstance() {
		return shopListInstance;
	}
	
	
	public boolean addProduct(String product) {
		
		if (product.startsWith("Food") && !isEqual(product)) {
			
			shopList.add(product);
			System.out.println("Product of type Food as added");
			return true;
		}
		
		if (product.startsWith("Other") && !isEqual(product)) {
			
			shopList.add(product);
			System.out.println("Product of type Other as added");
			return true;
		}
		
		return false;
	}
	
	public Boolean isEqual(String product) {
		for (String string : shopList) {
			if (string.equals(product)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void printFood() {
		System.out.println("Product of type Food:");

		for (String string : shopList) {
			if (string.startsWith("Food")) {
				System.out.println(string);
			}
		}
	}
	
	public void printOther() {
		System.out.println("Product of type Other:");

		for (String string : shopList) {
			if (string.startsWith("Other")) {
				System.out.println(string);
			}
		}
	}
	
}
