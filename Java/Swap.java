class Swap{
    public static void main (String[] args){
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping: \n"+ a  + "\n" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: \n"+ a + "\n" + b);


    }
}