package stepdefinitions;

import co.com.choucair.certification.retotecnicoexito.tasks.ChooseCategory;
import co.com.choucair.certification.retotecnicoexito.tasks.OpenUp;
import co.com.choucair.certification.retotecnicoexito.tasks.SelectRandomProducts2;
import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoHomePage;
import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoMonitores;
import co.com.choucair.certification.retotecnicoexito.util.GlobalFunctions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsToCart {
    static GlobalFunctions globalFunctions = new GlobalFunctions();
    static List<Integer> listRandomQuantities = globalFunctions.listRandomQuantitiesOfProducts();
    static List<String> listChosenProducts = new ArrayList<>();
    static List<Double> listPriceProducts = new ArrayList<>();
    static List<String> productsNameShoppingCart = new ArrayList<>();

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user santiago is on the success page")
    public void theUserSantiagoIsOnTheSuccessPage() {
        OnStage.theActorCalled("Santiago").attemptsTo(OpenUp.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseCategory.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ExitoHomePage.MONITORS_SUBCATEGORY, WebElementStateMatchers.isVisible()), Click.on(ExitoHomePage.MONITORS_SUBCATEGORY));
    }

    @When("he chooses {int} products randomly and also randomly their quantities")
    public void heChoosesProductsRandomlyAndAlsoRandomlyTheirQuantities(Integer int1) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ExitoMonitores.PRINCIPAL_DIV, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.PRINCIPAL_DIV).andAlignToBottom());
        List<WebElement> list = ExitoMonitores.List;
        List<Integer> listRandomNumberProducts = globalFunctions.listRandomNumberProducts(list.size() - 1);
        list.forEach(System.out::println);
        for (int i = 0; i < 5; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(By.xpath("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]//button[@class=\"vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 \"]")).andAlignToBottom());
            listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(By.xpath("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]//h3//span"))));
            listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(By.xpath("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]//div[@class=\"exito-vtex-components-4-x-PricePDP\"]//span[@class=\"exito-vtex-components-4-x-currencyContainer\"]")))));
            OnStage.theActorInTheSpotlight().attemptsTo(Click.on("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]//button[@class=\"vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 \"]"));
        }
        listChosenProducts.forEach(System.out::println);
        listPriceProducts.forEach(System.out::println);
    }

    @Then("everything chosen appears in the shopping cart")
    public void everythingChosenAppearsInTheShoppingCart() {

    }
}
