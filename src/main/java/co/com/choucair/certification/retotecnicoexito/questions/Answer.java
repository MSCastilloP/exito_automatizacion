package co.com.choucair.certification.retotecnicoexito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Objects;

public class Answer implements Question<Boolean> {
    private List<String> choosenProducts;
    private List<String> productsShoppingCart;

    public Answer(List choosenProducts, List productsShoppingCart) {

        this.choosenProducts = choosenProducts;
        this.productsShoppingCart = productsShoppingCart;
    }

    public static Answer toThe(List choosenProducts, List productsShoppingCart) {
        return new Answer(choosenProducts, productsShoppingCart);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        choosenProducts.forEach(System.out::println);
        productsShoppingCart.forEach(System.out::println);

        if (Objects.equals(choosenProducts, productsShoppingCart)) {
            result = true;
        } else {
            result = false;
        }

        return false;
    }
}

