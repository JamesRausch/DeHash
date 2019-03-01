import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.security.MessageDigest;
public class DeHash extends Thread implements Runnable{
    private String hashed;
    private MessageDigest messageDigest;
    int length = 0;
    char[] alphabet = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};




    public DeHash(String hash)
    {

        length = hash.length();


        try {
           messageDigest = MessageDigest.getInstance("SHA-256");
           messageDigest.update(hash.getBytes());
           String eString = new String(messageDigest.digest());
           hashed = eString;


        }
        catch(NoSuchAlgorithmException e){

        }


    }
    public void run() {
        unHash("");
    }
   public void unHash(String temp) {
        boolean flag = false;

        if (temp.length() == length) {
            String t = new String(temp);
            messageDigest.update((t.getBytes()));
            String eString = new String(messageDigest.digest());
            if(eString.equals(hashed)){
                System.out.println(temp);
                flag = true;
            }
        } else {
            for(char c : alphabet) {
                String old;
                old = temp;
                temp += c;


                unHash(temp);
                temp = old;
                if(flag == true)
                {
                    break;
                }

            }
        }

    }





    public static void main(String[] args) {
        DeHash t1 = new DeHash ("dylan");
        t1.start();

        DeHash t2 = new DeHash ("hashed");
        t2.start();


    }
}
