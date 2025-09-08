import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("name: ");
        String name = in.next();
        System.out.println("studio number: ");
        int studio = in.nextInt();
        Double s1 = (studio/8.0)*15;
        s1 = Math.round(s1*100.0)/100.0;
        System.out.printf("Weighted studio grade (out of 15): "+s1+"%n");
        System.out.println("Average quiz score: ");
        Double quiz = in.nextDouble();
        double s2 = (quiz/100.00)*25;
        System.out.printf("Weighted quiz grade (out of 25): "+ s2+"%n");
        System.out.println("Average exam score: ");
        Double exam = in.nextDouble();
        double s3 = (exam/100)*60;
        System.out.printf("Weighted exam grade (out of 60):"+s3+"%n");
        double total = s1+s2+s3;
        System.out.printf("Total Grade: %.2f%%%n", total);



    }
}
