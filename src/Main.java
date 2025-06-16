interface Greeting{
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Anonymous Class");
            }
        };

        greeting.greet();
    }
}