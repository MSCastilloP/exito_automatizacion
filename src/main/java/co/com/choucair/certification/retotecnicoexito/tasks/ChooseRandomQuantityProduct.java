package co.com.choucair.certification.retotecnicoexito.tasks;

import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoMonitores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class ChooseRandomQuantityProduct implements Task {
    private List<Integer> listRandomQuantities = new ArrayList<>();

    public ChooseRandomQuantityProduct(List list) {
        this.listRandomQuantities = list;
    }

    public static ChooseRandomQuantityProduct toThe(List listRandomQuantities) {
        return new ChooseRandomQuantityProduct(listRandomQuantities);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        listRandomQuantities.forEach(System.out::println);


        actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT1, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT1).andAlignToBottom());
        for (int i = 0; i < listRandomQuantities.get(0); i++) {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT1, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT1.waitingForNoMoreThan(Duration.ofSeconds(3))));
        }
        actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT2, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT2).andAlignToBottom());
        for (int i = 0; i < listRandomQuantities.get(1); i++) {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT2, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT2.waitingForNoMoreThan(Duration.ofSeconds(3))));
        }
        actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT3, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT3).andAlignToBottom());
        for (int i = 0; i < listRandomQuantities.get(2); i++) {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT3, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT3.waitingForNoMoreThan(Duration.ofSeconds(3))));
        }
        actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT4, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT4).andAlignToBottom());
        for (int i = 0; i < listRandomQuantities.get(3); i++) {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT4, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT4.waitingForNoMoreThan(Duration.ofSeconds(3))));
        }
        actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT5, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT5).andAlignToBottom());
        for (int i = 0; i < listRandomQuantities.get(4); i++) {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT5, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_PLUS_BUTTON_PRODUCT5.waitingForNoMoreThan(Duration.ofSeconds(3))));
        }
    }
}
