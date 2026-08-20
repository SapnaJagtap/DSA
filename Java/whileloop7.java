import java.util.Scanner;
class whileloop7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int number = sc.nextInt();
        
        int count = 0;
        while(number>0){
            number = number / 10; 
            count++;
        }
        System.out.println("Count of number = "+ count);
    }
}