package co.com.choucair.certification.retotecnicoexito.tasks;

import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class ChooseCategory implements Task {
    public static ChooseCategory onThePage() {
        return Tasks.instrumented(ChooseCategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ExitoHomePage.MENU_BUTTON));
        actor.attemptsTo(Click.on(ExitoHomePage.TECHNOLOGY_CATEGORY));
        actor.attemptsTo(Click.on(ExitoHomePage.SUBCATEGORIES_TECHNOLOGY));


    }
}
