package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.userinterface.ExampleUserInterface.Example4;

public class VerifyWith implements Question<Boolean> {
    private String question;
    public VerifyWith(String question){
        this.question = question;
    }
    public static VerifyWith the(String question){
        return  new VerifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(Example4).viewedBy(actor).asString();
        return question.contains(answer);
    }
}
