package co.com.choucair.certification.retotecnicoexito.questions;

import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoShoppingCart;
import co.com.choucair.certification.retotecnicoexito.util.GlobalFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerTotal implements Question<Boolean> {
    private List<Integer> listRandomQuantities;
    private List<Double> listPriceProducts;
    private GlobalFunctions globalFunctions = new GlobalFunctions();

    public AnswerTotal(List listRandomQuantities, List listPriceProducts) {

        this.listRandomQuantities = listRandomQuantities;
        this.listPriceProducts = listPriceProducts;
    }

    public static AnswerTotal toThe(List listRandomQuantities, List listPriceProducts) {
        return new AnswerTotal(listRandomQuantities, listPriceProducts);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String str = actor.asksFor(Text.of(ExitoShoppingCart.TOTAL_PRICE));
        Double totalExito = globalFunctions.splitSpace(str);
        Double total = 0.0;
        for (int i = 0; i < listPriceProducts.size(); i++) {
            total += listPriceProducts.get(i) * (listRandomQuantities.get(i) + 1);
        }

        if (total.equals(totalExito)) {
            if (true) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
