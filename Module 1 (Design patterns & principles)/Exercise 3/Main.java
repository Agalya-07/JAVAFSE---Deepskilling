public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(32)
                .setStorage(1024)
                .build();
        computer.display();
    }
}
