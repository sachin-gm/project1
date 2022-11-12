package basic_framework;

import org.testng.annotations.Test;

public class addcart extends baseclass
{
	@Test
	public void addtocart() {
	pomclass pc = new pomclass(driver);
	
	pc.book_btn();
	
	pc.add_cart();
	
	pc.shop_cart();
	
	}

}
