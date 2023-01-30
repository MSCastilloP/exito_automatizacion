package co.com.choucair.certification.retotecnicoexito.userinterface;

import co.com.choucair.certification.retotecnicoexito.util.GlobalFunctions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExitoMonitores extends PageObject {
    static WebDriver driver = Serenity.getDriver();
    static GlobalFunctions globalFunctions = new GlobalFunctions();
    static List<Integer> list = globalFunctions.listRandomNumberProducts(15);

    //*[@id="gallery-layout-container"]/div[1]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
    //*[@id="gallery-layout-container"]/div[4]/sectin/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
    //*[@id="gallery-layout-container"]/div[24]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[2]/span/svg

    public static final Target AGREGATE_BUTTON_PRODUCT1 = Target.the("AGREGATE_BUTTON_ PRODUCT1").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(0) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"));
    public static final Target AGREGATE_BUTTON_PRODUCT2 = Target.the("AGREGATE_BUTTON_ PRODUCT2").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(1) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"));
    public static final Target AGREGATE_BUTTON_PRODUCT3 = Target.the("AGREGATE_BUTTON_ PRODUCT3").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(2) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"));
    public static final Target AGREGATE_BUTTON_PRODUCT4 = Target.the("AGREGATE_BUTTON_ PRODUCT4").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(3) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"));
    public static final Target AGREGATE_BUTTON_PRODUCT5 = Target.the("AGREGATE_BUTTON_ PRODUCT4").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(4) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"));

    public static final Target AGREGATE_PLUS_BUTTON_PRODUCT1 = Target.the("AGREGATE_PLUS_BUTTON_PRODUCT1").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(0) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]"));
    public static final Target AGREGATE_PLUS_BUTTON_PRODUCT2 = Target.the("AGREGATE_PLUS_BUTTON_PRODUCT2").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(1) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]"));
    public static final Target AGREGATE_PLUS_BUTTON_PRODUCT3 = Target.the("AGREGATE_PLUS_BUTTON_PRODUCT3").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(2) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]"));
    public static final Target AGREGATE_PLUS_BUTTON_PRODUCT4 = Target.the("AGREGATE_PLUS_BUTTON_PRODUCT4").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(3) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]"));
    public static final Target AGREGATE_PLUS_BUTTON_PRODUCT5 = Target.the("AGREGATE_PLUS_BUTTON_PRODUCT5").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(4) + "]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]"));

    public static final Target PRICE_PRODUCT1 = Target.the("PRICE_PRODUCT1").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(0) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[4]/div[2]/div/span"));
    public static final Target PRICE_PRODUCT2 = Target.the("PRICE_PRODUCT2").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(1) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[4]/div[2]/div/span"));
    public static final Target PRICE_PRODUCT3 = Target.the("PRICE_PRODUCT3").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(2) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[4]/div[2]/div/span"));
    public static final Target PRICE_PRODUCT4 = Target.the("PRICE_PRODUCT4").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(3) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[4]/div[2]/div/span"));
    public static final Target PRICE_PRODUCT5 = Target.the("PRICE_PRODUCT5").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(4) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[4]/div[2]/div/span"));


    public static final Target NAME_PRODUCT1 = Target.the("NAME_PRODUCT1").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(0) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/h3"));
    public static final Target NAME_PRODUCT2 = Target.the("NAME_PRODUCT2").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(1) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/h3"));
    public static final Target NAME_PRODUCT3 = Target.the("NAME_PRODUCT3").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(2) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/h3"));
    public static final Target NAME_PRODUCT4 = Target.the("NAME_PRODUCT4").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(3) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/h3"));
    public static final Target NAME_PRODUCT5 = Target.the("NAME_PRODUCT5").located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[" + list.get(4) + "]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/h3"));


    public static final Target pruebas = Target.the("{0} Prueba ").located(By.xpath("(//button[.=\"Agregar\"])['{0}']"));
    public static final List<WebElement> List = driver.findElements(By.xpath("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"]"));

    public static final Target PRINCIPAL_DIV = Target.the("Main element to load the products").located(By.xpath("//*[@id=\"gallery-layout-container\"]"));
    public static final Target SHOPPING_CART_BUTTON = Target.the("Shopping cart menu").located(By.xpath("//a[@class=\"exito-header-3-x-minicartLink\"]"));
}
