import java.rmi.Naming;

public class ReverseServiceClient {
    public static void main(String[] args) {
        try {
            ReverseService service = (ReverseService) Naming.lookup("//localhost/ReverseService");
            String input = "Hello, world!";
            String reversed = service.reverseString(input);
            System.out.println("Original string: " + input);
            System.out.println("Reversed string: " + reversed);
        } catch (Exception e) {
            System.err.println("ReverseServiceClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
