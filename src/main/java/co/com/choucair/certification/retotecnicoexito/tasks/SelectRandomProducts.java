package co.com.choucair.certification.retotecnicoexito.tasks;

import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoMonitores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class SelectRandomProducts implements Task {
    public static SelectRandomProducts onThePage() {
        return Tasks.instrumented(SelectRandomProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ExitoMonitores.PRINCIPAL_DIV, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.PRINCIPAL_DIV).andAlignToBottom());
        actor.attemptsTo(Scroll.to(ExitoMonitores.AGREGATE_BUTTON_PRODUCT1).andAlignToBottom(), WaitUntil.the(ExitoMonitores.AGREGATE_BUTTON_PRODUCT1, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_BUTTON_PRODUCT1.waitingForNoMoreThan(Duration.ofSeconds(3))));
        actor.attemptsTo(Scroll.to(ExitoMonitores.AGREGATE_BUTTON_PRODUCT2).andAlignToBottom(), WaitUntil.the(ExitoMonitores.AGREGATE_BUTTON_PRODUCT2, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_BUTTON_PRODUCT2.waitingForNoMoreThan(Duration.ofSeconds(3))));
        actor.attemptsTo(Scroll.to(ExitoMonitores.AGREGATE_BUTTON_PRODUCT3).andAlignToBottom(), WaitUntil.the(ExitoMonitores.AGREGATE_BUTTON_PRODUCT3, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_BUTTON_PRODUCT3.waitingForNoMoreThan(Duration.ofSeconds(3))));
        actor.attemptsTo(Scroll.to(ExitoMonitores.AGREGATE_BUTTON_PRODUCT4).andAlignToBottom(), WaitUntil.the(ExitoMonitores.AGREGATE_BUTTON_PRODUCT4, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_BUTTON_PRODUCT4.waitingForNoMoreThan(Duration.ofSeconds(3))));
        actor.attemptsTo(Scroll.to(ExitoMonitores.AGREGATE_BUTTON_PRODUCT5).andAlignToBottom(), WaitUntil.the(ExitoMonitores.AGREGATE_BUTTON_PRODUCT5, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Click.on(ExitoMonitores.AGREGATE_BUTTON_PRODUCT5.waitingForNoMoreThan(Duration.ofSeconds(3))));
    }
}
