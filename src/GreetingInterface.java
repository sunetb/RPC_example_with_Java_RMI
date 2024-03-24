import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreetingInterface extends Remote {

    public String greeting(String name) throws RemoteException;

}