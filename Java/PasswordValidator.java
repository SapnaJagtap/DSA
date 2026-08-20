import java.util.function.Predicate;


public class PasswordValidator {
    public static void main(String[] args) {
        
        Predicate<String> isValidPassword = pwd -> 
            pwd != null && 
            pwd.length() >= 8 && 
            !pwd.matches(".*\\s.*");

        System.out.println("SecurePass123 -> " + isValidPassword.test("SecurePass123")); 
        System.out.println("weak pass -> " + isValidPassword.test("weak pass"));         
        System.out.println("short -> " + isValidPassword.test("short"));                 
    }
}
