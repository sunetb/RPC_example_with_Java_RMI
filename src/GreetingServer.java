import java.rmi.Naming;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

public class GreetingServer {
    private static final long serialVersionUID = 1L+1;
    public static void main(String[] arg) throws Exception
    {

        //Initialise "skeleton" = stub
        GreetingImpl service = new GreetingImpl(9010);

        //Registry does the "magic": creating a namespace, defining a port and so on
        Registry reg = java.rmi.registry.LocateRegistry.createRegistry(9010); //
        reg.rebind("greeting", service);

        System.out.println("Service is now listening...");
    }
}
