package co.com.test.tasks;

import co.com.test.model.ExampleModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.test.userinterface.ExampleUserInterface.*;
import static co.com.test.util.Constantes.ZERO;

public class ImplementationTask implements Task {
    private List<ExampleModel> dataSet;

        public ImplementationTask(List<ExampleModel> dataSet) {this.dataSet = dataSet;}

        public static ImplementationTask ImplementationTask(List<ExampleModel> dataSet){
            return Tasks.instrumented(ImplementationTask.class, dataSet);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataSet.get(ZERO).getUserExample()).into(Example1),
                Enter.theValue(dataSet.get(ZERO).getPasswordExample()).into(Example2),
                Click.on(Example3)
        );

    }
}
