package repl159;

class Main {
    final int num1 = 20;

    private void subtract(int num2, int num3, int num4) {
        int sum = num1 - num2 - num3 - num4;
        System.out.println(sum + " (should come from subtracting 4 numbers)");
    }

    private void subtract(int num2, int num3) {
        int sum = num1 - num2 - num3;
        System.out.println(sum + " (should come from subtracting 3 numbers)");
    }

    private void subtract(int num2) {
        int sum = num1 - num2;
        System.out.println(sum + " (should come from subtracting 2 numbers)");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.subtract(100, -140, 20);
        obj.subtract(90, -100);
        obj.subtract(0);
    }
}

