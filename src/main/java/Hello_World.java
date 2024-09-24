public class Hello_World {
    //comment test
    public static void main(String[] args) {
        String text = getText();  // This method might return null

        // Risk: Dereferencing the variable 'text' without checking if it's null
        System.out.println(text.length());
        System.out.println("Hello, World!");
    }

    private static String getText() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getText'");
    }

    public void methodC() {
        System.out.println("This is method A");
        System.out.println("This is method A");
        System.out.println("This is method A");
        System.out.println("This is method A");
    }

    
}