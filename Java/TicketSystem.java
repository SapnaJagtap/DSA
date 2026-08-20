import java.util.Scanner;
class TicketSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Membership: ");
        String membership = sc.nextLine();

        if(age >= 18 && membership.equals("yes")){
            System.out.println("Premium Ticket");
        }

        else if(age >= 18 || membership.equals("yes")){
            System.out.println("Regular Ticket");
        }

        else{
            System.out.println("Not Eligible");
        }
    }
}