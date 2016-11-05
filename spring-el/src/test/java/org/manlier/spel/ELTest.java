package org.manlier.spel;

import org.junit.Test;
import org.manlier.spel.entities.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by manlier on 2016/10/30.
 */
public class ELTest {

    @Test
    public void testMethodCall() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'Hello World'.concat('!')");
        String message = (String) expression.getValue();
        System.out.println(message);
    }

    @Test
    public void testEvalCtx() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1856, 7, 9);

        // The constructor arguments are name, birthday, and nationality.
        Inventor tesla = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");

        EvaluationContext context = new StandardEvaluationContext(tesla);
        String name = (String) exp.getValue(context);
        System.out.println(name);
    }

    @Test
    public void testExpressionCompile() {
    }
}
