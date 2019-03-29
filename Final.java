

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;
public class DeHash extends Thread implements Runnable{
   // Instance Variables
    private boolean flag;
    private String hashed;
    //Default Constructor
    DeHash() {
        Scanner input = new Scanner(System.in);

        if (hashed == null){
            System.out.println("Please Enter The Hashed Value:");
            hashed = input.nextLine();
              }

    }
    //Tester Method
    public String test(String in){
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(in.getBytes());
            String xString = new String(messageDigest.digest());
            System.out.println(xString);
            return xString;
        } catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return "";
    }
    //Converts from Hexa to Base 64
    private String convertBase(String in)
    {
        return Base64.getEncoder().encodeToString((new BigInteger(in, 16).toByteArray()));
    }
    //Checks Values to See if they Match Up
    private boolean checker(String tString){
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");


            if(tString != null)
            messageDigest.update(tString.getBytes());
            String sString = new String(messageDigest.digest());
            if(sString.equals(hashed)){
                return true;
            }

        }
        catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return false;
    }

  //Runs 0-1 Million
    private void generatorOne()
    {

           for(int i = 0; i <= 0xF4240; i++)
           {
               String temp = Integer.toHexString(i);
               temp = convertBase(temp);

               if(flag)
               {
                   break;
               }
               if(checker(temp))
               {
                   flag = true;
                   System.out.println(temp);
                   break;
               }

           }


    }
    //Runs 1-2 Million
    private void generatorTwo()
    {
        for(int i = 0xF4240; i < 0x1E8480; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag) {
                break;

            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }
        }
    }
    //Runs 2-3 Million
    private void generatorThree()
    {
        for(int i = 0x1E8480; i < 0x2DC6C0 ; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);

            if(flag) {
                break;

            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }
        }
    }
    //Runs 3-4 Million
    private void generatorFour()
    {
        for(int i = 0x2DC6C0; i < 0x3D0900; i++)
        {
            String temp = Integer.toHexString(i);

            if(flag) {
                break;

            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }
        }
    }
    //Runs 4-5 Million
    private void generatorFive()
    {
        for(int i = 0x3D0900 ; i < 0x4C4B40; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag) {
                break;

            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }
        }
    }
    //Runs 5-6 Million
    private void generatorSix()
    {
        for(int i = 0x4C4B40; i < 0x5B8D80; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag) {
                break;

            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }
        }
    }
    //Runs 6-7 Million
    private void generatorSeven()
    {

        for(int i = 0x5BBD80 ; i <= 0x6ACFC0; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag)
            {
                break;
            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }

        }


    }
    //Runs 7-8 Million
    private void generatorEight()
    {

        for(int i = 0x6ACFC0; i <= 0x7A1200; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag)
            {
                break;
            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }

        }


    }
  //Runs 8-9Million
    private void generatorNine()
    {

        for(int i = 0x7A1200; i <= 0x895440; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag)
            {
                break;
            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }

        }


    }
    //Runs 9-10 Millon
    private void generatorTen()
    {

        for(int i = 0x895440; i <= 0x989680; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag)
            {
                break;
            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }

        }


    }
    //Runs 10 Million to 100 Million 
    private void generatorBig(){
        for(int i = 0x989680; i <= 0x5F5E100; i++)
        {
            String temp = Integer.toHexString(i);
            temp = convertBase(temp);
            if(flag)
            {
                break;
            }
            if(checker(temp))
            {
                flag = true;
                System.out.println(temp);
                break;
            }

        }
    }
    //Default Constructor for New Threads
    private DeHash(String input){
    }
    //Thread Creation
    public void run() {
            try {

                DeHash x1 = new DeHash("");
                DeHash x2 = new DeHash("");
                DeHash x3 = new DeHash("");
                DeHash x4 = new DeHash("");
                DeHash x5 = new DeHash("");
                DeHash x6 = new DeHash("");
                DeHash x7 = new DeHash("");
                DeHash x8 = new DeHash("");
                DeHash x9 = new DeHash("");
                DeHash x10 = new DeHash("");
                DeHash x11 = new DeHash("");
                x1.generatorOne();
                x2.generatorTwo();
                x3.generatorThree();
                x4.generatorFour();
                x5.generatorFive();
                x6.generatorSix();
                x7.generatorSeven();
                x8.generatorEight();
                x9.generatorNine();
                x10.generatorTen();
                x11.generatorBig();
                Thread threadX1 = new Thread(x1);
                Thread threadX2 = new Thread(x2);
                Thread threadX3 = new Thread(x3);
                Thread threadX4 = new Thread(x4);
                Thread threadX5 = new Thread(x5);
                Thread threadX6 = new Thread(x6);
                Thread threadX7 = new Thread(x7);
                Thread threadX8 = new Thread(x8);
                Thread threadX9 = new Thread(x9);
                Thread threadX10 = new Thread(x10);
                Thread threadX11 = new Thread(x11);
                threadX1.start();
                threadX2.start();
                threadX3.start();
                threadX4.start();
                threadX5.start();
                threadX6.start();
                threadX7.start();
                threadX8.start();
                threadX9.start();
                threadX10.start();
                threadX11.start();
                threadX1.join();
                threadX2.join();
                threadX3.join();
                threadX4.join();
                threadX5.join();
                threadX6.join();
                threadX7.join();
                threadX8.join();
                threadX9.join();
                threadX10.join();
                threadX11.join();


            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


        }


    public static void main(String[] args) {

        DeHash u = new DeHash();
        u.run();


    }

}

