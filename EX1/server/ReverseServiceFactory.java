import java.rmi.RemoteException;

public class ReverseServiceFactory {
    public static ReverseService createReverseService() throws RemoteException {
        return new ReverseServiceImpl();
    }
}
