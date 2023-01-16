package co.com.choucair.certification.retotecnicoexito.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ExitoHomePage extends PageObject {
    public static final Target MENU_BUTTON = Target.the("button menu").located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/button"));
    public static final Target TECHNOLOGY_CATEGORY = Target.the("Technology option menu").located(By.xpath("//p[contains(text(),\"Tecnolo\")]"));
    public static final Target SUBCATEGORIES_TECHNOLOGY = Target.the("SUBCATEGORIES_TECHNOLOGY").located(By.xpath("//p[contains(text(),\"Computadores\")]"));
    public static final Target MONITORS_SUBCATEGORY = Target.the("Monitors option submenu").located(By.xpath("//a[contains(text(),\"Monitores\")]"));

}
