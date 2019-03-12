import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
public class DeHash extends Thread implements Runnable{
    private GatherInput input = new GatherInput();
    private String hashed = input.hashed;
    private MessageDigest messageDigest;

    private boolean isDone = false;
    private String hold = "";
    DeHash()
    {
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
    }

    private DeHash(String temp) {

        char[] alphabet = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (char c : alphabet) {


                temp = hold;
                temp += c;
                hold = temp;
                if (isDone) {
                    break;
                }
            }

        }

    public void run() {
        if (hold.length() == hashed.length()) {
            messageDigest.update((hold.getBytes()));
            String eString = new String(messageDigest.digest());
            if (eString.equals(hashed)) {
                System.out.println(hold);
                isDone = true;

            } else try {
                DeHash x1 = new DeHash(hold);
                DeHash x2 = new DeHash(hold);
                Thread threadX1 = new Thread(x1);
                Thread threadX2 = new Thread(x2);
                threadX1.start();
                threadX2.start();
                threadX1.join();
                threadX2.join();


            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {

    }

}

