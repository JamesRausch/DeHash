public class Simulator {
    public static void main(String[] args) {
        DeHash unHash = new DeHash();
        unHash.start();
        unHash.run();
        DeHash unHashTwo = new DeHash();
        unHashTwo.start();
        unHashTwo.run();
    }
}
