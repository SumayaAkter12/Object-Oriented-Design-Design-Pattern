public class Calculator implements Adder, Subtractor, Multiplier, Divider {
    @Override
    public int add(int p, int q) {
        System.out.println("Addition: " + (p + q));
        return p + q;
    }

    @Override
    public int subtract(int p, int q) {
        System.out.println("Subtraction: " + (p - q));
        return p - q;
    }

    @Override
    public int multiply(int p, int q) {
        System.out.println("Multiplication: " + (p * q));
        return p * q;
    }

    @Override
    public int divide(int p, int q) {
        System.out.println("Division: " + (p / q));
        return p / q;
    }
}