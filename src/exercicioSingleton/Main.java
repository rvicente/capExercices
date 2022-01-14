package exercicioSingleton;

public class Main {

	public static void main(String[] args) {
		
		ShopListSingleton shopList =  ShopListSingleton.getShopListInstance();
		
		shopList.addProduct("Food","apple");
	}

}
