import java.util.Scanner;
class LoginSystem{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Your Password: ");
        int password = sc.nextInt();

        if(username.equals("Sapna") && password == 1234){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Credentials");
        }

    }
}