public class SimpleCalculator {
    public static void main(String[] args) {
        suma(args);
        int product = 1;
        //Dodaj możliwość mnożenia liczb jeśli pierwszym argumentem jest *
        //TODO 1. Wydzielić kod mnożenia do osobnej funkcji mnożenia
        //TODO 2. Napisać test funkcji mnożenia, przyjać wynik 0 jeśli brak argumetow lub zły symbol mnożenia
        if (args[0].equals("*")) {
            for (int i = 1; i < args.length; i++) {
                product *= Integer.parseInt(args[i]);
            }
            System.out.println("suma liczb: " + product);
        }
    }

    public static int suma(String[] args) {
        int sum = 0;
        if (args[0].equals("+")) {
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("suma liczb: " + sum);
        }
        return sum;
    }
}
