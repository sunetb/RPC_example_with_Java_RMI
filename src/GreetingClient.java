import java.util.Scanner;
import java.rmi.Naming;
public class GreetingClient {
    public static void main(String[] arg) throws Exception
    {
        //Initialise the stub
        GreetingInterface stub = (GreetingInterface) Naming.lookup("rmi://localhost:9010/greeting");

        //Get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        //Wrap name in custom object
        CustomObject person = new CustomObject();
        person.setData(name);

        //Send to server
        String response = stub.greeting(person);
        System.out.println("Server sent me this message: " + response);
    }
}
