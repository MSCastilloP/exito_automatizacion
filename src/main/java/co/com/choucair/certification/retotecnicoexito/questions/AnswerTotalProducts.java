package co.com.choucair.certification.retotecnicoexito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class AnswerTotalProducts implements Question<Boolean> {
    private List<Integer> listProductsShoppingCart;
    private List<Double> listProducts;

    public AnswerTotalProducts(List listRandomQuantities, List listPriceProducts) {

        this.listProductsShoppingCart = listRandomQuantities;
        this.listProducts = listPriceProducts;
    }

    public static AnswerTotalProducts toThe(List listProductsShoppingCart, List listProducts) {
        return new AnswerTotalProducts(listProductsShoppingCart, listProducts);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(listProducts.size() + "  " + listProductsShoppingCart.size());
        if (listProducts.size() == listProductsShoppingCart.size()) {
            return true;
        } else {
            return false;
        }
    }
}
