import java.rmi.RemoteException;
import java.rmi.server.*;

public class GreetingImpl extends UnicastRemoteObject implements GreetingInterface{

    public GreetingImpl (int port)  throws java.rmi.RemoteException{
        super(port);
    }
    @Override
    public String greeting(String name) throws RemoteException {
        System.out.println(name + " said hello to me");
        return "greetings " + name + "!";
    }
}
