package activity;

public class Main {
    public static void main(String[] args) {
        Cycle c = new Cycle(new Activity(),15);
        c.start();
    }
}