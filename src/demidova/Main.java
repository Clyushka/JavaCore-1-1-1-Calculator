package demidova;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        System.out.print("1 + 2 = ");
        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        System.out.print("1 - 1 = ");
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        //int c = calc.devide.apply(a, b); //b==0, ошибка деления на ноль
        // при делении на ноль возвращает максимальное значение Integer, что не совсем верно с точки зрения математики,
        // но программа при таком решении не вывалится и, в целом, похоже на правду, с учетом результата в мат. анализе
        // при делении на 0 с учетом органичений типа
        System.out.print(a + " / " + b + " = ");
        int c = calc.devideWithZero.apply(a, b);
        calc.println.accept(c);

        // проверим работу остальных операций
        System.out.print(a + " * " + b + " = ");
        c = calc.multiply.apply(a, b);
        calc.println.accept(c);

        System.out.print("pow " + a + " = ");
        c = calc.pow.apply(a);
        calc.println.accept(c);

        System.out.print("abs -3 = ");
        c = calc.abs.apply(-3);
        calc.println.accept(c);

        System.out.print("isPos -3 = ");
        calc.printlnBool.accept(calc.isPositive.test(-3));
    }
}
