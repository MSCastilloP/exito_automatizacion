package co.com.choucair.certification.retotecnicoexito.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExitoShoppingCart extends PageObject {

    public static final Target LIST_PRODUCT_NAME = Target.the("LIST_PRODUCT_NAME").located(By.xpath("//td//a[@class=\"exito-checkout-product-name\"]"));
    public static final Target LIST_QUANTITY_PRODUCTS = Target.the("AGREGATE_BUTTON_ PRODUCT4").located(By.xpath("//*[@class=\"quantity\"]//input"));
    public static final Target TOTAL_PRICE = Target.the("TOTAL_PRICE").located(By.xpath("//*[@id=\"checkoutMainContainer\"]/div[5]/div[3]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[2]/div/table/tfoot/tr[1]/td[3]"));
    public static final Target DIV_PRODUCTS_SHOPPING_CART = Target.the("DIV_PRODUCTS_SHOPPING_CART").located(By.xpath("//*[@id=\"cartLoadedDiv\"]/div[2]"));

}
