class datatypes {
    public static void main(String[] args) {
        String name = "Acharya";
        char grade = 'A';
        byte x = 10; // -128 to +128
        long balance = 12345678; // above 20L and below -20L
        short y = 10000; // -32000 to +32000
        double value = 1000000.69; // -20L to +20L
        System.out.println(name);
        System.out.println(grade);
        System.out.println(x);
        System.out.println(balance);
        System.out.println(y);
        System.out.println(value);
        System.out.println(name.getClass().getSimpleName()); // To get the datatype of the function --> use this command
        }
}