package sda.cwiczenia;

public class TryCatchExceptions {
    public static void main(String[] args) {
        System.out.println(performOperation("1.5 2 add") + "\n");
        System.out.println(performOperation("1.5 2 root") + "\n");
        System.out.println(performOperation("1.5 2") + "\n");
        System.out.println(performOperation("2") + "\n");
        System.out.println(performOperation(null) + "\n");
    }

    static Double performOperation(String input) {
        try {
            String[] parts = input.split(" ");
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            System.out.println(a);
            System.out.println(b);
            String operation = parts[2].toUpperCase();
            switch (operation) {
                case "ADD" -> {
                    return a + b;
                }
                case "DIVIDE"->{return a / b;}

                case "MULTIPLY"->{return a * b;}
                case "SUBSTRACT"->{return a - b;}
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Could not process input: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing elements. Input too short: " +
                    e.getMessage());
        } finally {
            System.out.println("Finally.");
        }

        return null;
    }
}
