import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class ReverseClient {
    public static void main(String[] args) {
        try {
            ReverseService service = (ReverseService) Naming.lookup("//localhost/ReverseService");
            String input = "Hello, world!";
            String reversed = service.reverseString(input);
            System.out.println("Original string: " + input);
            System.out.println("Reversed string: " + reversed);

        } catch (Exception e) {
            System.err.println("ReverseClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
