import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReverseService extends Remote {
    String reverseString(String input) throws RemoteException;
}
