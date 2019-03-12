import java.util.Scanner;
public class GatherInput {
    String hashed;
    public GatherInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the hashed value");
        String input = scan.nextLine();
        hashed = input;
    }
}

