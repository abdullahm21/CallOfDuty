package Utilities;

import pageFactory.About;
import pageFactory.AfterPayPage;
import pageFactory.BuyNowPayLaterPage;
import pageFactory.Catalog;
import pageFactory.Checkout;
import pageFactory.HomePage;
import pageFactory.Legal_T_CsPage;
import pageFactory.LinksOnTheBottomClickablity;
import pageFactory.MyAccountAndLogin;
import pageFactory.OnlineStoreLocations;
import pageFactory.Products;
import pageFactory.SearchBar;
import pageFactory.ShippingDeliveryPage;
import pageFactory.WinterWarmer;
import pageFactory.ZipPayPage;

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
	public static HomePage homepage;
	public static BuyNowPayLaterPage bnpl;
	public static AfterPayPage afterPayPage;
	public static ZipPayPage zipPayPage;
	public static Legal_T_CsPage TCPage;
	public static ShippingDeliveryPage SDPage;

	
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
//Muatter Pages
		homepage = new HomePage();
		bnpl= new BuyNowPayLaterPage();
		afterPayPage = new AfterPayPage();
		zipPayPage = new ZipPayPage();
		TCPage =new Legal_T_CsPage();
		SDPage =new ShippingDeliveryPage();

	}
	
}
