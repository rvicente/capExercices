

public class Main {

	public static void main(String[] args) {
		
		ShopListSingleton shopList =  ShopListSingleton.getShopListInstance();
		
		shopList.addProduct("Food");
		shopList.addProduct("Food apple");
		shopList.addProduct("Other");
		shopList.addProduct("Other water");
		shopList.addProduct("carrots");
		
		shopList.printFood();
		shopList.printOther();


		


		
	}

}
