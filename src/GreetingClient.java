import java.util.Scanner;
import java.rmi.Naming;
public class GreetingClient {
    public static void main(String[] arg) throws Exception
    {


        GreetingInterface stub=(GreetingInterface) Naming.lookup("rmi://localhost:9010/greeting");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        String response = stub.greeting(name);
        System.out.println("Server sent me this message: " + response);

    }
}
