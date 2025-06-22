package pageObjectRepository;

import org.testng.annotations.BeforeMethod;

import testBase.TestBase;

public class PageObjects extends TestBase {

	public pageObjectRepository.LoginPageObjects loginPage;
	public pageObjectRepository.ProductPageObjects productPage;
	public pageObjectRepository.SideMenuAndSubMenuPageObjects sideMenu;

	@BeforeMethod
	public void initPageObjects() {
		loginPage = new pageObjectRepository.LoginPageObjects(driver);
		productPage = new pageObjectRepository.ProductPageObjects(driver);
		sideMenu = new pageObjectRepository.SideMenuAndSubMenuPageObjects(driver);

	}

}
