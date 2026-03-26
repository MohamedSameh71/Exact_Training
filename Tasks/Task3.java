public Task3 {
    public static void main(String[] args) {


        double price = 29.99;
        int intPrice = (int) price;

        System.out.println("Original double price: " + price);
        System.out.println("After casting to int: " + intPrice);


        int result1 = 7 / 2;
        double result2 = (double) 7 / 2;

        System.out.println("7 / 2 = " + result1);
        System.out.println("(double) 7 / 2 = " + result2);


        String numberStr = "42";
        int number = Integer.parseInt(numberStr);

        System.out.println("String value: " + numberStr);
        System.out.println("Converted to int: " + number);
    }
}