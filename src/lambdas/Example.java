package lambdas;

public class Example {

    public static void main(String[] args) {
        System.out.println("zafer");
        //lambda reduces code size
        //more clear code base

        //old way
        Tech tech1 = new Tech() {
            @Override
            public void name(String name) {
                System.out.println("Hello " + name);
            }
        };

        //lambda way
        //functional interface bir tane method tanımı olabilir. ama behaviour tanımlanabilir.
        Tech tech2 = name -> System.out.print("Hello " + name);

        tech1.name("old way");
        tech2.name("lambda way");


        //2. lambdaları bir methoda parametre olarak da verebiliriz.

        //old way
        double result1 = execute(3, 8, new Calculate() {
            @Override
            public double execute(double first, double second) {
                return first + second;
            }
        });

        //lamda way
        double result2 = execute(5.0, 7.0, (a, b) -> (a + b));
    }

    private static double execute(double first, double second, Calculate calculate) {
        return calculate.execute(first, second);
    }

}