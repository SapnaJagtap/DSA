class Statement{
    public static void main(String [] args)
    {
        int marks = 95;

        if(marks >= 90){
            System.out.println("A Grade");
        }

        else if(marks >= 75){
            System.out.println("B Grade");
        }

        else if(marks >= 50){
            System.out.println("C Grade");
        }

        else{
            System.out.println("Failed");
        }
    }
}