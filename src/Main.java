public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        board.draw();

        System.out.println("\nDelivering next order:");
        board.deliver();
        board.draw();

        System.out.println("\nDelivering order #33:");
        board.deliver(33);
        board.draw();
    }
}