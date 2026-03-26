public  Task1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int modulo = a % b;
        boolean isDivisible = (a % b == 0);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Integer Division: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("a % b == 0: " + isDivisible);
    }
}