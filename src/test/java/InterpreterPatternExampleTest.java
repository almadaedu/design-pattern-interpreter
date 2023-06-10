import interpreter.Expression;
import interpreter.OrExpression;
import interpreter.TerminalExpression;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InterpreterPatternExampleTest {
    @Test
    public void testInterpreterPattern() {
        Expression expression1 = new TerminalExpression("Hello");
        Expression expression2 = new TerminalExpression("World");
        Expression expression3 = new OrExpression(expression1, expression2);

        assertEquals(true, expression3.interpret("Hello"));
        assertEquals(true, expression3.interpret("World"));
        assertEquals(true, expression3.interpret("Hello World"));
        assertEquals(false, expression3.interpret("Goodbye"));
    }
}