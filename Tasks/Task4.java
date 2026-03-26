public Task4 {
    public static void main(String[] args) {


        String fullName = "Mohamed";

        System.out.println("Length: " + fullName.length());

        System.out.println("Uppercase: " + fullName.toUpperCase());

        System.out.println("Lowercase: " + fullName.toLowerCase());

        System.out.println("First character: " + fullName.charAt(0));

        System.out.println("Last character: " + fullName.charAt(fullName.length() - 1));

        String reversed = new StringBuilder(fullName).reverse().toString();
        System.out.println("Reversed: " + reversed);

        boolean hasSpace = fullName.contains(" ");
        System.out.println("Contains space: " + hasSpace);
    }
}