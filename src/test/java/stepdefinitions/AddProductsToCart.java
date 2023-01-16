package stepdefinitions;

import co.com.choucair.certification.retotecnicoexito.questions.Answer;
import co.com.choucair.certification.retotecnicoexito.questions.AnswerTotal;
import co.com.choucair.certification.retotecnicoexito.questions.AnswerTotalProducts;
import co.com.choucair.certification.retotecnicoexito.tasks.ChooseCategory;
import co.com.choucair.certification.retotecnicoexito.tasks.ChooseRandomQuantityProduct;
import co.com.choucair.certification.retotecnicoexito.tasks.OpenUp;
import co.com.choucair.certification.retotecnicoexito.tasks.SelectRandomProducts;
import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoHomePage;
import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoMonitores;
import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoShoppingCart;
import co.com.choucair.certification.retotecnicoexito.util.GlobalFunctions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddProductsToCart {
    static GlobalFunctions globalFunctions = new GlobalFunctions();
    static List<Integer> listRandomQuantities = globalFunctions.listRandomQuantitiesOfProducts();
    static List<String> listChosenProducts = new ArrayList<>();
    static List<Double> listPriceProducts = new ArrayList<>();
    static List<String> productsNameShoppingCart = new ArrayList<>();

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user Santiago navigates on the Exito page\\.$")
    public void userSantiagoNavigatesOnTheExitoPage() {
        OnStage.theActorCalled("Santiago").attemptsTo(OpenUp.thePage());
    }

    @When("^the user chooses the technology category$")
    public void theUserChoosesTheTechnologyCategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseCategory.onThePage());
    }

    @When("^choose a monitors subcategory$")
    public void chooseAMonitorsSubcategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ExitoHomePage.MONITORS_SUBCATEGORY, WebElementStateMatchers.isVisible()), Click.on(ExitoHomePage.MONITORS_SUBCATEGORY));
    }

    @When("^Randomly choose (\\d+) products$")
    public void randomlyChooseProducts(int arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectRandomProducts.onThePage());
    }

    @When("^randomly aggregate between (\\d+) and (\\d+) the amount of each product$")
    public void randomlyAggregateBetweenAndTheAmountOfEachProduct(int arg1, int arg2) {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseRandomQuantityProduct.toThe(listRandomQuantities));
    }

    @Then("^the name of the chosen products must be the same as in the shopping cart$")
    public void theNameOfTheChosenProductsMustBeTheSameAsInTheShoppingCart() {
        listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.NAME_PRODUCT1)));
        listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.NAME_PRODUCT2)));
        listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.NAME_PRODUCT3)));
        listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.NAME_PRODUCT4)));
        listChosenProducts.add(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.NAME_PRODUCT5)));
        listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.PRICE_PRODUCT1))));
        listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.PRICE_PRODUCT2))));
        listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.PRICE_PRODUCT3))));
        listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.PRICE_PRODUCT4))));
        listPriceProducts.add(globalFunctions.splitSpace(OnStage.theActorInTheSpotlight().asksFor(Text.of(ExitoMonitores.PRICE_PRODUCT5))));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ExitoMonitores.SHOPPING_CART_BUTTON));
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(ExitoShoppingCart.DIV_PRODUCTS_SHOPPING_CART).andAlignToBottom());
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ExitoShoppingCart.LIST_PRODUCT_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(12).seconds());
        Collection<String> names = OnStage.theActorInTheSpotlight().asksFor(Text.ofEach(ExitoShoppingCart.LIST_PRODUCT_NAME.waitingForNoMoreThan(Duration.ofSeconds(5))));
        productsNameShoppingCart = new ArrayList<>(names);
        Collections.sort(productsNameShoppingCart);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Answer.toThe(productsNameShoppingCart, listChosenProducts)));
    }

    @Then("^the total prices of the added products must be equal to that of the shopping cart$")
    public void theTotalPricesOfTheAddedProductsMustBeEqualToThatOfTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                AnswerTotal.toThe(listRandomQuantities, listPriceProducts)));

    }

    @Then("^the number of products added should be equal to the shopping cart$")
    public void theNumberOfProductsAddedShouldBeEqualToTheShoppingCart() {
//        Collection<String> quantity = OnStage.theActorInTheSpotlight().asksFor(Text.ofEach(ExitoShoppingCart.LIST_QUANTITY_PRODUCTS.waitingForNoMoreThan(Duration.ofSeconds(5))));
//        List<String> quantityProductsShoppingCart = new ArrayList<>(quantity);
//        quantityProductsShoppingCart.forEach(System.out::println);
    }

    @Then("^the number of products added must be equal to the shopping cart$")
    public void theNumberOfProductsAddedMustBeEqualToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerTotalProducts.toThe(listChosenProducts, productsNameShoppingCart)));
    }

}
