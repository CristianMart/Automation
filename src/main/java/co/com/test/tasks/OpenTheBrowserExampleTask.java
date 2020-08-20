package co.com.test.tasks;

import co.com.test.model.ExampleData;
import co.com.test.userinterface.ExampleUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.test.userinterface.ExampleUserInterface.Example1;
import static co.com.test.userinterface.ExampleUserInterface.Example2;
import static co.com.test.util.Constantes.ZERO;

public class OpenTheBrowserExampleTask implements Task
{
    private List<ExampleData> dataSet;
    private ExampleUserInterface exampleUserInterface;

    public OpenTheBrowserExampleTask (List<ExampleData> dataSet) {this.dataSet = dataSet;}

    public static OpenTheBrowserExampleTask exampleUserInterface(List<ExampleData> dataSet) {
        return Tasks.instrumented(OpenTheBrowserExampleTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(exampleUserInterface),
                Enter.theValue(dataSet.get(ZERO).getNameExample()).into(Example1),
                Enter.theValue(dataSet.get(ZERO).getLastNameExample()).into(Example1),
                Enter.theValue(dataSet.get(ZERO).getAddress()).into(Example2),
                Enter.theValue(dataSet.get(ZERO).getDate()).into(Example2)
        );
    }
}
