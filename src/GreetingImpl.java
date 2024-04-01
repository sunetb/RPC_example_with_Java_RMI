import java.rmi.RemoteException;
import java.rmi.server.*;


//Serverside implementation of methods defined in the GreetingInterface "contract"
//These methods are "exposed" (i.e. accessible) to the client
public class GreetingImpl extends UnicastRemoteObject implements GreetingInterface{

    public GreetingImpl (int port)  throws java.rmi.RemoteException{
        super(port);
    }
    @Override
    public String greeting(CustomObject person) throws RemoteException {
        System.out.println(person.getData() + " said hello to me");
        return "greetings " + person.getData() + "!";
    }
}
