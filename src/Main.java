import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        Integer number = -5;
        Predicate<Integer> realNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number > 0;
            }
        };
        Predicate<Integer> isPositive = number2 -> number2 > 0;
        if(realNumber.test(number)){
            System.out.println("Число больше нуля");
        } else {
            System.out.println("число меньше нуля");
        }



        // Exercise 2
        Consumer<String> nameConsumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name + "!");
                ;
            }
        };
        Consumer<String> greetPerson = name -> System.out.println("Hello, " + name + "!");

        nameConsumer.accept("Nikita");

        // Exercise 3

        Function<Double, Long> doubleLongFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double, Long> roundNumber = number3 -> Math.round(number3);

        long roundLong = doubleLongFunction.apply(2.95678);
        System.out.println(roundLong);

        //Exercise 4

        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(integerSupplier.get());
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);

    }

    //Exercise5
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return input -> condition.test(input) ? ifTrue.apply(input) : ifFalse.apply(input);
    }
}