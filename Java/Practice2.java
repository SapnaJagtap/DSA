public class Practice2{
    public static void main(String[] args){
        String name = "Sapna";
        int Science = 90;
        int Maths = 95;
        int History = 85;

        int total_marks = Science + Maths + History;
        int avg_marks = total_marks / 3;
        int percentage = (total_marks * 100) / 300;

        System.out.println("My Name is " + name);
        System.out.println("Total Marks Obtained is " + total_marks);
        System.out.println("Average Marks " + avg_marks);
        System.out.println("Percentage " + percentage + " %");
    }
}