package interpreter;

import java.util.Map;
import java.util.HashMap;

/*
 * Interpreter Design Pattern
 * ==========================
 *
 * Used for created interpreter for a language. This example is used for creating interpreter for Backus–Naur form (BNF)
 * Wikipedia for BNF: https://en.wikipedia.org/wiki/Interpreter_pattern#BNF.
 *
 * This has a context which provides the basis of the calculations/storage - like variables in Java.
 * Then a tree is constructed by chaining expressions which can be interpreted using our context.
 */
public class Driver {
    public static void main(String[] args) {
        Map<String,Expression> context = new HashMap<String,Expression>();

        context.put("w", new Number(5));
        context.put("x", new Number(10));
        context.put("z", new Number(42));

        int result = (new Plus(new Variable("w"), new Minus(new Variable("x"), new Variable("z")))).interpret(context);
        int result1 = (new Plus(new Number(5), new Minus(new Number(10), new Number(42)))).interpret(context);

        Expression tree = (new Plus(new Number(5), new Minus(new Number(10), new Number(42))));

        System.out.println(tree.interpret(context));
        System.out.println(result);
        System.out.println(result1);
    }
}

