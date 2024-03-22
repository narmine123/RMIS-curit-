import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseServiceImpl extends UnicastRemoteObject implements ReverseService {
    protected ReverseServiceImpl() throws RemoteException {
        super();
    }

    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
