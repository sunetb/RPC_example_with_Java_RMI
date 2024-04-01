import java.rmi.Remote;
import java.rmi.RemoteException;

//The "contract" between server and client
public interface GreetingInterface extends Remote {

    public String greeting(CustomObject name) throws RemoteException;

}