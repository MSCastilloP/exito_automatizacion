package co.com.choucair.certification.retotecnicoexito.tasks;

import co.com.choucair.certification.retotecnicoexito.userinterface.ExitoMonitores;
import co.com.choucair.certification.retotecnicoexito.util.GlobalFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class SelectRandomProducts2 implements Task {
    static GlobalFunctions globalFunctions = new GlobalFunctions();


    public static SelectRandomProducts2 onThePage() {
        return Tasks.instrumented(SelectRandomProducts2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(WaitUntil.the(ExitoMonitores.PRINCIPAL_DIV, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(), Scroll.to(ExitoMonitores.PRINCIPAL_DIV).andAlignToBottom());
            Thread.sleep(1000);
            List<WebElement> list = ExitoMonitores.List;
            List<Integer> listRandomNumberProducts = globalFunctions.listRandomNumberProducts(list.size() - 1);

            for (int i = 0; i < 5; i++) {
                actor.attemptsTo(Scroll.to(By.xpath("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]")).andAlignToBottom());
                Thread.sleep(1000);
                actor.attemptsTo(Click.on(By.xpath("(" + StringUtils.removeEnd(String.valueOf(list.get(i)).split("xpath:")[1], "]") + ")[" + listRandomNumberProducts.get(i) + "]")));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
