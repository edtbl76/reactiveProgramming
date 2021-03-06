package Operators_9.Transforming_2;

import io.reactivex.Observable;

public class Repeat_6 {

    public static void main(String[] args) {

        /*
            This is an example of a repeat() operator.
         */
        Observable
                .just("License", "and", "registration", "please")
                .repeat(2)
                .subscribe(
                        System.out::println,
                        Throwable::printStackTrace,
                        () -> System.out.println("Got caught on the repeater eh? It happens.")
                );

        /*
            This is an extremely contrived example of
         */
        final long start = System.currentTimeMillis();
        Observable
                .just("Echo")
                .repeatUntil(() -> System.currentTimeMillis() - start > 2000)
                .subscribe(
                        System.out::println,
                        Throwable::printStackTrace,
                        () -> System.out.println("This is a clever way of saying - repeat for two seconds")
                );


    }
}
