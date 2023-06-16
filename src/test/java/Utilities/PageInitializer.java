package Utilities;

import pageFactory.About;
import pageFactory.Catalog;
import pageFactory.Checkout;
import pageFactory.LinksOnTheBottomClickablity;
import pageFactory.MyAccountAndLogin;
import pageFactory.OnlineStoreLocations;
import pageFactory.Products;
import pageFactory.SearchBar;
import pageFactory.WinterWarmer;

public class PageInitializer extends Driver{

	public static About about;
	public static Catalog catalog;
	public static Checkout checkout;
	public static LinksOnTheBottomClickablity links;
	public static MyAccountAndLogin login;
	public static OnlineStoreLocations location;
	public static Products products;
	public static SearchBar search;
	public static WinterWarmer winter;
	
	public static void initialize() {
		about = new About();
		catalog= new Catalog();
		checkout = new Checkout();
		links = new LinksOnTheBottomClickablity();
		login= new MyAccountAndLogin();
		location = new OnlineStoreLocations();
		products = new Products();
		search= new SearchBar();
		winter = new WinterWarmer();
	}
	
}
