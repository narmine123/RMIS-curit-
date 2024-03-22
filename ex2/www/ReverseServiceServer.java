import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ReverseServiceServer {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new SecurityManager());
            LocateRegistry.createRegistry(1099);
            ReverseService service = ReverseServiceFactory.createReverseService();
            Naming.rebind("//localhost/ReverseService", service);
            System.out.println("ReverseServiceServer bound in registry");
        } catch (Exception e) {
            System.err.println("ReverseServiceServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
