package demidova;

import java.util.function.*;

public class Calculator {
    //supplier
    static Supplier<Calculator> instance = Calculator::new;

    //binary
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devideWithZero = (x, y) -> (y == 0) ? Integer.MAX_VALUE : x / y;

    //unary
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //predicate
    Predicate<Integer> isPositive = x -> x > 0;

    //consumer
    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnBool = System.out::println;
}
