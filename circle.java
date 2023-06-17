import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        //II=3.14159
        double pi=3.14159;
        int answer=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to calculate area of circle:");
        int num=scan.nextInt();
        answer=(int) (pi*num*num);
        System.out.println("Answer for area of circle:"+ answer);
    }
}